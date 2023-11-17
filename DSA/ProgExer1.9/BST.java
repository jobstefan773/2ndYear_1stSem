import java.util.Scanner;

class BST {
    public static Scanner userInput = new Scanner(System.in);

    BSTNode root;

    public BST() {
        this.root = null;
    }

    public void insert(Software item) {
        root = insertRecursive(root, item); 
    }

    private BSTNode insertRecursive(BSTNode root, Software item) {
        if (root == null) {
            return new BSTNode(item);
        }

        int compareResult = item.softName.compareTo(root.item.softName);

        if (compareResult < 0) {
            root.left = insertRecursive(root.left, item);
        } else if (compareResult > 0) {
            root.right = insertRecursive(root.right, item);
        }

        return root;
    }

    public void inOrderTraversal(BSTNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            displayProduct(root.item);
            inOrderTraversal(root.right);
        }
    }

    private void displayProduct(Software item) {
        System.out.printf("%-30s  %-10s  %-10s  %-5s\n", 
                item.softName,
                item.version,
                item.quantity,
                "$" + String.format("%.2f", item.price),
                "\n");
    }

    public void addSoftware () {

        System.out.print("Software Name: ");
        String softName = userInput.nextLine();
        System.out.print("Software Version: ");
        String version = userInput.nextLine();

        Software existing = search(softName, version);

        if (existing != null) {

            System.out.println("This Software already exists!");
            System.out.print("Enter Quantity: ");
            int toAdd = Integer.parseInt(userInput.nextLine());
            existing.quantity += toAdd;
            System.out.println("Updated successfully!");

        } else {
            System.out.print("Enter Quantity: ");
            int quantity = Integer.parseInt(userInput.nextLine());

            System.out.print("Enter Price: ");
            double price = Double.parseDouble(userInput.nextLine());

            insert(new Software(softName, version, quantity, price));
            System.out.print("New Software added successfully!\n");
        }
    }

    public Software search (String softName, String version) {
        return searchRecursive(root, softName, version);
    }

    public Software searchRecursive (BSTNode root, String softName, String version) {
        if (root == null) {
            return null;
        }

        int compareResult = softName.compareTo(root.item.softName);

        if (compareResult == 0 && version.equals(root.item.version)) {
            return root.item;
        } else if (compareResult < 0) {
            return searchRecursive(root.left, softName, version);
        } else {
            return searchRecursive(root.right, softName, version);
        }
    }

}