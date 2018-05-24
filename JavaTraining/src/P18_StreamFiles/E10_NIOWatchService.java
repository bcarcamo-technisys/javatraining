package P18_StreamFiles;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.*;

public class E10_NIOWatchService {

	public static void main(String[] args) throws Exception {

		Path DIR = Paths.get("src", "P18_StreamFiles", "files");
		DirectoryWatcher.Listener client = new  DirectoryListener();
		DirectoryWatcher watcher = new DirectoryWatcher(DIR, client);
		
		watcher.start();
		
		Files.createFile(DIR.resolve("newFilecreated.txt"));
		Files.delete(DIR.resolve("newFilecreated.txt"));
		
		watcher.stop();
		 
	}
	
	private static class DirectoryListener implements DirectoryWatcher.Listener {

		@Override
		public void receive(String eventKind, Path file) {
			System.out.println("Event: " + eventKind);
			System.out.println("Element: " + file.toString());
			System.out.println();
		}
		
	}
	
	private static class DirectoryWatcher {
		
		private boolean enable = false;
		private WatchService watcher;
		
		private Listener client; 
		
		public DirectoryWatcher(Path DIR, Listener client) throws IOException {
			DIR.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
			this.client = client;
		}
		
		public void start() throws IOException, InterruptedException {
			if(!this.enable)  {
				this.enable = true;
				this.watcher = FileSystems.getDefault().newWatchService();
				deamon();
			} else
				throw new IOException("Watcher is already started");
		}
		
		public void stop() throws IOException {
			if(this.enable) {
				this.enable = false;
			} else
				throw new IOException("Watcher wasn't started still");
		}
		
		public void deamon() throws InterruptedException {
			while(this.enable) {
				WatchKey key = this.watcher.take();
				List<WatchEvent<?>> events = key.pollEvents();
				
				for(WatchEvent<?> event : events) {
					Kind<?> eventType = event.kind();
					Path file = (Path) event.context();
					this.client.receive(eventType.name(), file);
					
					Thread.sleep(10);
					
					
				}
			}
		}
		
		public interface Listener {
			
			public void receive(String eventKind, Path file);
			
		}
		
	}

}
