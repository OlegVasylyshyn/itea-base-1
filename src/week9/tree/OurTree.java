package week9.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OurTree<K, V> {

    private TreeNode<K, V> root;
    private int size;



    public V put(K key, V value) {

        @SuppressWarnings("unchecked")
        Comparable<? super K> comparator = (Comparable<? super K>) key;

        if(root == null) {
            root = new TreeNode<>(key, value, null, null, null);
            return null;
        }
        return putNode(root, comparator, key, value);
    }

    private V putNode(TreeNode<K, V> root, Comparable<? super K> comparator, K key, V value){
        int compare = comparator.compareTo(root.key);

        if(compare == 0) {
            V toReturn = root.value;
            root.value = value;
            return toReturn;
        } else if (compare < 0) {

            if(root.left == null) {
                root.left = new TreeNode<>(key, value, root, null, null);
                return null;
            }
            return putNode(root.left, comparator, key, value);
        } else {

            if(root.right == null) {
                root.right = new TreeNode<>(key, value, root, null, null);
                return null;
            }
            return putNode(root.right, comparator, key, value);
        }
    }

    public V remove(K key) {
        return null;
    }

    public V get(K key) {
        return null;
    }

    @Override
    public String toString() {
        return getString(root);
    }

    private String getString(TreeNode<K, V> root) {
        return root != null ? getString(root.left) + " " + root.value + " " + getString(root.right) : "";
    }

    private static class TreeNode<K, V> {

        private K key;
        private V value;

        private TreeNode<K, V> top;
        private TreeNode<K, V> left;
        private TreeNode<K, V> right;

        public TreeNode(K key, V value, TreeNode<K, V> top, TreeNode<K, V> left, TreeNode<K, V> right) {
            this.key = key;
            this.value = value;
            this.top = top;
            this.left = left;
            this.right = right;
        }
    }

}
