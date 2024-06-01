Map - отображает однозначные ключи на значения

Map.Entry - внутренний класс интерфейса Map.
Описывает элемент отображения (пару ключ значение)

NavigableMap - extend interface SortedMap for extracting
the elements from the Map by the criteria of searching the most precise match

SortedMap - extends interface Map in a way that the keys are located in ascending order.

Map interface:
* Is Generical and has a declaration such as K - type of keys
and V - type of stored value:
  * interface Map<K, V>
* Methods:
 - default V compute(K k, BiFunction<? super K, ? super V, ? extends V> function)

 - default V computeIfAbsent(K k, Function<? super K, ? extends V> function)
    
 - merge?

SortedMap interface:
 * interface SortedMap<K, V>
    - comparator()
    - K firstKey()
    - SortedMap<K,V> headMap(K end)
    - K lastKey()
    - SortedMap<K, V> subMap(K start, K end)
    - SortedMap<K, V> tailMap(K start)

NavigableMap interface: (p. 608)
    * interface NavigableMap<K, V>

Map.Entry interface:
 * interface Map.Entry<K, V>
   - comparingByKey() - returns Comparator by key
   - comparingByValue() 
   
HashMap:
    get() and put() have constant time of execution
    HashMap()
    HashMap(Map<? extends K, ? extends V> m)
    HashMap(int capacity)
    HashMap(int capacity, float coef_filling)
by default is 16, and coef is 0,75

TreeMap:
    extends AbstractMap and implements interface NavigableMap
    Map located in tree like structure
    In comparison with HM, it guarantees that its elements will
    be sorted by the order of ascending keys.   

- class TreeMap<K, V>
  - TreeMap()
  - TreeMap(Comparator<? super K> comparator)
  - TreeMap(Map<? extends K, ? extends V> m)
  - TreeMap(SortedMap<K, ? extends V> sm)

    
- class LinkedHashMap<K, V>
  - LinkedHashMap(int capacity, float coef_fill, boolean order):
    - if true, the order of access is used
    - if false, the order of input is used
  - removeEldestEntry(Map.Entry<K, V> e)
    - is called from methods put() and putAll(). The oldest writing 
    is passed as a parameter e. You can override it and delete the oldest writing
    from LHM. For this method should return true (by default returns false).
    But for saving the oldest writing you should return false in the overridden method.

- IdentityHashMap
    - Is same as HashMap class, but in this case, during comparison of elements of Map here
  is equality of referenced is done.
    - class IdentityHashMap<K, V>
    - is not used for the wide range use

- EnumMap
  - Is used with the keys of type enum.
  - class EnumMap<K extends Enum<K>, V>

- Comparators
  - Classes TreeSet and TreeMap save the elements in the sorted order.
  - But the sorting order is exactly defined by the used comparator.
  - Natural ordering by default (expected ordering)
  * Interface Comparator<T>
    - int compare(T object1, T object2)
    - boolean equals(object obj)
    - default Comparator<T> reversed()
    - static <T extends Comparable<? super T>> Comparator<T> reverseOrder()
    - naturalOrder()
    - nullsFirst()
    - nullsLast()
    - thenComparing(Comparator<? super T> second_comparator)
    - U - is type of key
    - comparing(Function<? super T, ? extends U> get_key)
    - comparing(Function<? super T, ? extends U> get_key, Comparator<? super U> key_comparator)
        - get_key gets next key for the comparison
    - reversed() for comparator with natural ordering

- Algorithms of class Collections:
  * ClassCastException
  * UnsupportedOperationException
  * checkedCollection() - dynamically typed representation
  * checkedSet()
  * checkedList()
  * checkedMap()
  * synchronizedList()
  * synchronizedSet() - for getting copies of the collections
  * iterators of the synchronized collections should be used inside the block
  of code with access modifier synchronized
  * unmodifiable - when to guarantee that access is only for reading

- Arrays
  * asList()
  * binarySearch() - for finding a defined value, apply for sorted arrays
  * copyOf() - returns copy of the array
  * copyOfRange()
  * equals()
  * deepEquals() - compares inner arrays
  * fill()
  * sort()
  * parallelSort()
  * spliterator()
  * stream()
  * setAll()
  * parallelSetAll()
  * parallelPrefix()
  * toString()
  * hashCode()
  * deepHashCode()

- Inherited classes:
    - Dictionary
    - Hashtable
    - Properties
    - Stack
    - Vector

- Interface Enumeration<E>
    * hasMoreElements()
    * E nextElement()

- Vector - dynamic array
  - int capacityIncrement;
  - int elementCount;
  - Object[] elementData;

- Stack<E> - still is used but ArrayDeque is recommended instead
  - extends from Vector and server the principle - last in, first out
  - empty()
  - E peek() - returns from the top of stack, not deleting
  - E pop() - returns from the top, deleting
  - E push(E element) - puts defined element in stack and returns it
  - int search(Object element) - searches for the defined element in stack.
  If element is found, then its place is returned relatively the top of stack, 
  else -1.

- Dictionary<K, V> is analogous to Map but with outdated methods

- Hashtable<K, V> is analogous to HashMap but is synchronized
  - nor keys nor values can be empty
  - inside we can store only objects whose methods hashCode() and equals()
  are overridden.

- Properties
  - getProperties()
  - Properties properties: this variable contains list of prop by default
  - store()
  - load()