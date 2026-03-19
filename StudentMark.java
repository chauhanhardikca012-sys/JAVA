class MarkOutOfBoundsException extends Exception {
    MarkOutOfBoundsException(String message) {
        super(message);
    }
}

class Student {
    void chmark(int mark) throws MarkOutOfBoundsException {
        if (mark < 0 || mark > 100) {
            throw new MarkOutOfBoundsException("Enter Between 0 to 100");
        } else {
            System.out.println("Marks: " + mark);
        }
    }
}

class StudentMark {
    public static void main(String[] args) {
        Student st = new Student();

        try {
            st.chmark(101);
        } catch (MarkOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}