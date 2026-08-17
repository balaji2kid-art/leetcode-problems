class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        root.insert(word, 0);
    }

    public boolean search(String word) {
        return root.search(word, 0);
    }

    public boolean startsWith(String prefix) {
        return root.startsWith(prefix, 0);
    }

    class Node {
        Node[] nodes;
        boolean isEnd;

        Node() {
            nodes = new Node[26];
            isEnd = false;
        }

        private void insert(String word, int idx) {
            if (idx == word.length()) {
                this.isEnd = true;
                return;
            }

            int i = word.charAt(idx) - 'a';
            if (nodes[i] == null) {
                nodes[i] = new Node();
            }

            nodes[i].insert(word, idx + 1);
        }

        private boolean search(String word, int idx) {
            if (idx == word.length()) {
                return this.isEnd;
            }

            Node node = nodes[word.charAt(idx) - 'a'];
            if (node == null) {
                return false;
            }

            return node.search(word, idx + 1);
        }

        private boolean startsWith(String prefix, int idx) {
            if (idx == prefix.length()) {
                return true;
            }

            Node node = nodes[prefix.charAt(idx) - 'a'];
            if (node == null) {
                return false;
            }

            return node.startsWith(prefix, idx + 1);
        }
    }
}