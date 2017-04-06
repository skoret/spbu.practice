/**
 * Created by Sergey Skaredov.
 * SPSU. 2017.
 */

class RBTreePrinter<K: Comparable<K>, V> {

    fun print(tree: RedBlackTree<K, V>?) {

        if (tree == null || tree.isEmpty()) {
            println("tree is empty")
            return
        }

        for (node in tree) {

            var indent = ""
            var i = 0

            while (i < node.high()) {
                i++
                indent += "  "
            }

            println(indent + node.branch() + node.toString())
        }

        println("_____________________")
    }
}