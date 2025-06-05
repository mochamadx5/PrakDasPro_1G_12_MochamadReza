package semester2.pertemuan14;

public class BinaryTree12 {
    Node_12 root;

    public BinaryTree12(){
        root = null;
    }
    public boolean isEmpty() {
        return root == null;
    }
    public void addRekursif(Mahasiswa_12 data) {
        root = addRekursif(root, data);
    }

    Node_12 addRekursif(Node_12 current, Mahasiswa_12 data) {
        if (current == null) {
            return new Node_12(data); 
        }
        if (data.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, data);
        } else {
            current.right = addRekursif(current.right, data); 
        }
        return current;
    }

    public void add(Mahasiswa_12 mahasiswa) {
        Node_12 newNode = new Node_12(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node_12 current = root;
            Node_12 parent = null;
            
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
    if (isEmpty()) {
        System.out.println("Tree kosong");
        return;
    }
    System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
    tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    void tampilMahasiswaIPKdiAtas(Node_12 node, double ipkBatas) {
    if (node != null) {
        
        tampilMahasiswaIPKdiAtas(node.left, ipkBatas);

        if (node.mahasiswa.ipk > ipkBatas) {
            node.mahasiswa.tampilInformasi12();
        }
        tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }

    public void cariMinIPK() {
        if (isEmpty()) {
        System.out.println("Tree kosong");
        return;
        }

        Node_12 current = root;
            while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi12();
        }

        public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
    Node_12 current = root;
    while (current.right != null) {
        current = current.right;
    }
    System.out.println("Mahasiswa dengan IPK terbesar:");
    current.mahasiswa.tampilInformasi12();
    }
    boolean find(double ipk) {
        boolean result = false;
        Node_12 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }
    void traversePreOrder (Node_12 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi12();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traverseInOrder (Node_12 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi12();
            traverseInOrder(node.right);
        }
    }
    void traversePostOrder(Node_12 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi12();
        }
    }
    Node_12 getSuccessor(Node_12 del) {
        Node_12 successor = del.right;
        Node_12 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successorParent.right = del.right;
        }
        return successor;
    }
    void delete(double ipk) {
    if (isEmpty()) {
        System.out.println("Binary tree kosong");
        return;
    }

    Node_12 parent = root;
    Node_12 current = root;
    boolean isLeftChild = false;

    // Cari node yang akan dihapus
    while (current != null) {
        if (current.mahasiswa.ipk == ipk) {
            break;
        } else if (ipk < current.mahasiswa.ipk) {
            parent = current;
            current = current.left;
            isLeftChild = true;
        } else {
            parent = current;
            current = current.right;
            isLeftChild = false;
        }
    }

    // Jika tidak ditemukan
    if (current == null) {
        System.out.println("Data tidak ditemukan");
        return;
    }

    // Kasus 1: Node tidak punya anak (daun)
    if (current.left == null && current.right == null) {
        if (current == root) {
            root = null;
        } else {
            if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
    }
    // Kasus 2: Node hanya punya anak kanan
    else if (current.left == null) {
        if (current == root) {
            root = current.right;
        } else {
            if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
    }
    // Kasus 3: Node hanya punya anak kiri
    else if (current.right == null) {
        if (current == root) {
            root = current.left;
        } else {
            if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }
    }
    // Kasus 4: Node punya dua anak
    else {
        Node_12 successor = getSuccessor(current);
        System.out.println("Jika 2 anak, current = ");
        current.mahasiswa.tampilInformasi12();

        if (current == root) {
            root = successor;
        } else {
            if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
        }
        successor.left = current.left;
        }
    }
}