import java.util.Scanner;

class BST {
    Scanner userInput = new Scanner(System.in);

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
    
        int compareName = item.softName.compareTo(root.item.softName);
    
        if (compareName < 0) {
            root.left = insertRecursive(root.left, item);
        } else if (compareName > 0) {
            root.right = insertRecursive(root.right, item);
        } else {
            int compareVersion = item.version.compareTo(root.item.version);
            if (compareVersion < 0) {
                root.left = insertRecursive(root.left, item);
            } else if (compareVersion > 0) {
                root.right = insertRecursive(root.right, item);
            }
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

        Software checkItem = search(softName, version);

        if (checkItem != null) {

            System.out.println("This Software already exists!");
            System.out.print("Enter Quantity to add: ");
            int toAdd = Integer.parseInt(userInput.nextLine());
            checkItem.quantity += toAdd;
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

    public void sellSoftware () {

        System.out.print("Software Name: ");
        String softName = userInput.nextLine();

        System.out.print("Software Version: ");
        String version = userInput.nextLine();

        Software checkItem = search(softName, version);

        if (checkItem != null) {
            System.out.print("Enter Quantity to sell: ");
            int toSell = Integer.parseInt(userInput.nextLine());

            if (toSell <= checkItem.quantity) {
                checkItem.quantity -= toSell;

                if (checkItem.quantity == 0) {
                    root = remove(root, checkItem);
                }

                System.out.println("Sale successful! Remaining quantity: " + checkItem.quantity);
            } else {
                System.out.println("Insufficient package in stock to sell.");
            }
        } else {
            System.out.println("Software not found.");
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

    private BSTNode remove(BSTNode root, Software item) {
        if (root == null) {
            return null;
        }

        int compareResult = item.softName.compareTo(root.item.softName);

        if (compareResult < 0) {
            root.left = remove(root.left, item);
        } else if (compareResult > 0) {
            root.right = remove(root.right, item);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.item = minValue(root.right);

            root.right = remove(root.right, root.item);
        }

        return root;
    }

    private Software minValue(BSTNode root) {
        Software minValueProduct = root.item;
        while (root.left != null) {
            minValueProduct = root.left.item;
            root = root.left;
        }
        return minValueProduct;
    }

}