public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.add(55);
        bst.add(21);
        bst.add(86);
        bst.add(84);
        bst.add(12);
        bst.add(62);
        bst.add(92);

        bst.preOrder();

        System.out.println("\n21 is: "+bst.search(21));
    }
}
