package com.ss.imap.hashmap;

import com.ss.imap.Map;

import java.util.Collection;
import java.util.Set;

/**
 * @author JDsen99
 * @description
 * @createDate 2021/8/28-19:05
 */
public class HashMap<K,V> implements Map {

    private Node<K,V>[] table = (Node<K,V>[]) new Node[16];
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean containsKey(Object key) {

        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object put(Object key, Object value) {

        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(java.util.Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<java.util.Map.Entry> entrySet() {
        return null;
    }

    static class Node<K,V> implements Map.Entry<K,V> {
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
