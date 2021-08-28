package com.ss.imap;

import java.util.Collection;
import java.util.Set;

/**
 * @author JDsen99
 * @description
 * @createDate 2021/8/28-19:04
 */
public interface Map<K,V> {

    int size();

    boolean isEmpty();

    boolean containsKey(Object key);

    boolean containsValue(Object value);

    V put(K key, V value);

    V remove(Object key);

    void putAll(java.util.Map<? extends K, ? extends V> m);

    void clear();

    Set<K> keySet();

    Collection<V> values();

    Set<java.util.Map.Entry<K, V>> entrySet();

    boolean equals(Object o);

    int hashCode();

    interface Entry<K,V> {

    }
}
