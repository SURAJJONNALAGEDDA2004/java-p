public class m2_11argument {
    public static void main(String[] args) {
        int count = args.length;
        System.out.println("Total number of arguments: " + count);

        System.out.println("Arguments:");
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + ": " + args[i]);
        }
    }
}

