public class chapter1 {
    public static void main (String[] args) {

        byte userAge = 36;
        short numberOfStudents = 28;
        int numberOfEmployees = 220;
        long numberOfInhabitants = 2102131302548L;

        float hourlyRate = 14.8F;
        // need to add F, otherwise it is treated as a double
        double numberOfHours = 512.5;

        char grade = 'B';
        boolean promote = true;

        byte level = 3, userExperience = 4;

        byte skill;
        skill = 127;
        // skill won't get any higher, cause it uses 1 byte. 2 to the power of 8

        int x = 7;
        float y = 10.0F;
        double remainder = y % x;
        double divideThis = y / x;

        int counter = 0;

        short age = 23;
        double ageDouble = age;
        // type casting age from short to double. Widening primitive conversion

        int castThis = (int) 20.9;
        // casting a double (8 bytes) to an int (4 bytes)
        // results in loss of data, avoid when you can

        float numberOne = (float) 14.99;
        // by default it;s a double, only do this when memory is a concern

        System.out.println(castThis);



        System.out.println("Lets get it on");
        // sequence matters!
        System.out.println(++counter);
        System.out.println(counter);
    }

}
