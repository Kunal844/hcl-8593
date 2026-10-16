    package Day8;

    public class Student {
        private static Student obj = new Student();

        private Student() {
            System.out.println("Object Created");
        }

        public static Student getInstance() {
            return obj;
        }
    }
