import java.io.*;

public class SD {

    // SimpleStudent class
    static class SimpleStudent implements Serializable {
        private static final long serialVersionUID = 1L;
        String name;
        int age;

        // Constructor to initialize name and age
        public SimpleStudent(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Step 1: Create a SimpleStudent object
        SimpleStudent student = new SimpleStudent("Alice", 16);

        // Step 2: Serialize the SimpleStudent object to a file
        FileOutputStream fileOut = new FileOutputStream("simpleStudent.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(student);
        out.close();
        fileOut.close();
        System.out.println("Serialized data is saved in simpleStudent.ser");

        // Step 3: Deserialize the SimpleStudent object from the file
        FileInputStream fileIn = new FileInputStream("simpleStudent.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        SimpleStudent deserializedStudent = (SimpleStudent) in.readObject();
        in.close();
        fileIn.close();

        // Step 4: Display the deserialized SimpleStudent object
        System.out.println("Deserialized SimpleStudent:");
        System.out.println("Name: " + deserializedStudent.name);
        System.out.println("Age: " + deserializedStudent.age);
    }
}
