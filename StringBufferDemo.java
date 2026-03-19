class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Hello");

        str.append(" World");
        System.out.println("After Append: " + str);

        str.insert(6, "JAVA ");
        System.out.println("After Insert: " + str);

        str.delete(6, 11);
        System.out.println("After Delete: " + str);

        str.reverse();
        System.out.println("After Reverse: " + str);
    }
}