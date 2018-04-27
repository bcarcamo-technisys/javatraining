package P12_Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class E01_CollectionInterfaces {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {

		class AdapterCollection implements Collection {
			public boolean add(Object e) { return false; }
			public boolean addAll(Collection c) { return false; }
			
			public boolean remove(Object o) { return false; }
			public boolean removeAll(Collection c) { return false; }
			public void clear() {}
			public boolean retainAll(Collection c) { return false; }
			
			public boolean contains(Object o) { return false; }
			public boolean containsAll(Collection c) { return false; }
			
			public int size() { return 0; }
			public boolean isEmpty() { return false; }
			
			public Object[] toArray() { return null; }
			public Object[] toArray(Object[] a) { return null; }
			
			public Iterator iterator() { return null; }
		}
		
		class AdapterList extends AdapterCollection implements List {
			public void add(int index, Object element) {}
			public boolean addAll(int index, Collection c) { return false; }
			
			public Object get(int index) { return null; }
			
			public Object set(int index, Object element) { return null; }
			
			public Object remove(int index) { return null; }
			
			public int indexOf(Object o) { return 0; }
			public int lastIndexOf(Object o) { return 0; }
			
			public ListIterator listIterator() { return null; }
			public ListIterator listIterator(int index) { return null; }
			public List subList(int fromIndex, int toIndex) { return null; }	
		}
		
		List list1 = new ArrayList();
		List list2 = new LinkedList();
		
		class AdapterSet extends AdapterCollection implements Set {}
		
		Set set1 = new HashSet();
		Set set2 = new LinkedHashSet();
		
		class AdapterSortedSet extends AdapterSet implements SortedSet {
			public Comparator comparator() { return null; }
			
			public Object first() { return null; }
			public Object last() { return null; }
			
			public SortedSet headSet(Object toElement) { return null; }
			public SortedSet tailSet(Object fromElement) { return null; }
			public SortedSet subSet(Object fromElement, Object toElement) { return null; }
		}
		
		class AdapterNavigableSet extends AdapterSortedSet implements NavigableSet {
			public Object lower(Object e) { return null; }
			public Object floor(Object e) { return null; }
			public Object ceiling(Object e) { return null; }
			public Object higher(Object e) { return null; }
			public Object pollFirst() { return null; }
			public Object pollLast() { return null; }
			public NavigableSet descendingSet() { return null; }
			public Iterator descendingIterator() { return null; }
			public NavigableSet subSet(Object fromElement, boolean fromInclusive, Object toElement,
					boolean toInclusive) { return null; }
			public NavigableSet headSet(Object toElement, boolean inclusive) { return null; }
			public NavigableSet tailSet(Object fromElement, boolean inclusive) { return null; }
		}
		
		NavigableSet navigableset1 = new TreeSet();
		
		class AdapterMap implements Map {
			public int size() { return 0; }
			public boolean isEmpty() { return false; }
			
			public boolean containsKey(Object key) { return false; }
			public boolean containsValue(Object value) { return false; }
			
			public Object get(Object key) { return null; }
			
			public Object put(Object key, Object value) { return null; }
			public void putAll(Map m) { }
			
			public Set keySet() { return null; }
			public Set entrySet() { return null; }
			public Collection values() { return null; }
			
			public Object remove(Object key) { return null; }
			public void clear() { }
		}
		
		Map map1 = new HashMap();
		Map map2 = new Hashtable();
		Map map3 = new TreeMap();
		
		Deque deque1 = new ArrayDeque();
		
	}

}
