package com.dkit.gd2.johnloane;

import java.util.*;

/**
 * OOP CA3
 * @author John Loane
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Question 1");
        List<Student> studentList = new ArrayList<>();
        //Question 1
        questionOnePartA(studentList);
        displayArrayList(studentList);
        questionOnePartB(studentList);
        questionOnePartC(studentList);
        questionOnePartD();


        //Question 2
        System.out.println("\n\nQuestion 2");
        List<Employee> employeeList = new ArrayList<>();
        questionTwoPartA(employeeList);
        pickLuckyWinner(employeeList);
        Map<Employee, String> employeeToy = new HashMap<>();
        questionTwoPartB(employeeToy);
        printUniqueNames(employeeToy);
        //questionTwoPartC();
        Queue<Employee> employeeQueue = new ArrayDeque<>();
        questionTwoPartD(employeeQueue);
        getNextOnWaitingList(employeeQueue);

        System.out.println("\n\nQuestion 3");
        //Question 3
        //List<String> oneHundredStrings = new ArrayList<>();
        //populateOneHundredStrings(oneHundredStrings);
        //questionThreePartA(oneHundredStrings);
        //questionThreePartB();

        System.out.println("\n\nQuestion 4");
        //Question 4
        //compareTwoStudents();
        //questionFourPartA();
        //questionFourPartB();
        //questionFourPartC();
    }

    //The method below relates to Question 4
    private static void compareTwoStudents()
    {
        Student alex1 = new Student(1, "Alex", 22);
        Student alex2 = new Student(1, "Alex", 22);
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }

    //This is just a helper method to populate the list of strings for question 3. You do not need to read it to answer any of the questions in the CA
    private static void populateOneHundredStrings(List<String> oneHundredStrings)
    {
        for(int i=0; i < 100; i++)
        {
            if(i / 10 == 0)
            {
                oneHundredStrings.add("Java");
            }
            else if(i / 10 == 1)
            {
                oneHundredStrings.add("Python");
            }
            else if(i / 10 == 2)
            {
                oneHundredStrings.add("C++");
            }
            else if(i / 10 == 3)
            {
                oneHundredStrings.add("Javascript");
            }
            else if(i / 10 == 4)
            {
                oneHundredStrings.add("Ruby");
            }
            else if(i / 10 == 5)
            {
                oneHundredStrings.add("Golang");
            }
            else if(i / 10 == 6)
            {
                oneHundredStrings.add("C#");
            }
            else if(i / 10 == 7)
            {
                oneHundredStrings.add("C");
            }
            else if(i / 10 == 8)
            {
                oneHundredStrings.add("R");
            }
            else if(i / 10 == 9)
            {
                oneHundredStrings.add("Swift");
            }
        }
    }

    public static void displayArrayList(List<Student> list){
        for(Student s:list){
            System.out.println(s);
        }
    }

    public static void questionOnePartA(List<Student> studentlist){
        studentlist.add(new Student(1, "Vincent", 19));
        studentlist.add(new Student(2,"Christian", 22));
        studentlist.add(new Student(3,"John", 21));
        studentlist.add(new Student(4,"Paul", 24));
    }

    public static void questionOnePartB(List<Student> studentlist){
        ComparatorStudentName NameComparator = new ComparatorStudentName();
        Collections.sort(studentlist, NameComparator);
        for(Student s:studentlist){
            System.out.println(s);
        }
    }

    public static void questionOnePartC(List<Student> studentlist){
        ComparatorStudentAge AgeComparator = new ComparatorStudentAge();
        Collections.sort(studentlist, AgeComparator);
        for(Student s:studentlist){
            System.out.println(s);
        }
    }

    public static void questionOnePartD(){
        System.out.println("The time Complexity is O(N) where the more data it is the more time it will take to add and to sort the array");
    }

    public static void questionTwoPartA(List<Employee> list){
        list.add(new Employee("Vincent", "Arellano"));
        list.add(new Employee("John", "O'Reilly"));
        list.add(new Employee("Paul", "Smith"));
        list.add(new Employee("Christian", "Arellano"));
        list.add(new Employee("Paul", "Arellano"));

    }

    public static void pickLuckyWinner(List<Employee> list){
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        Employee employee = list.get(index);
        System.out.println("The lucky Employee is " + employee);
    }

    public static void questionTwoPartB(Map<Employee, String> list){
        list.put(new Employee("Vincent", "Arellano"), "Toy 1");
        list.put(new Employee("John", "O'Reilly"), "Toy 2");
        list.put(new Employee("Paul", "Smith"), "Toy 3");
        list.put(new Employee("Christian", "Arellano"), "Toy 4");
        list.put(new Employee("James", "Arellano"), "Toy 5");
    }

    public static void printUniqueNames(Map<Employee, String> list){
        Set<Employee> keySet = list.keySet();

        for (Employee key : keySet) {
            String toy = list.get(key);
            System.out.println("Unique Names: " + key.getFirstName() + " First Name: " + toy);
        }
    }

    public static void questionTwoPartC(Map<Employee, String> list){

    }

    public void printNameAndCount(List<Employee> list){
        String title = "The legend of the World of Bushcraft of the universe";
        String array[] = title.split(" ");

        for(String s : array)
            System.out.println(s +", ");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for(String word : array) {
            Integer count = wordCountMap.get(word);
            if (count != null) {

                wordCountMap.put(word,(count+1));

            } else {
                wordCountMap.put(word, 1); // add new word with count 1
            }
        }
        System.out.println("Count of 'of' : = " +wordCountMap.get("of"));
    }

    public static void questionTwoPartD(Queue<Employee> list){
        list.add(new Employee("Vincent", "Arellano"));
        list.add(new Employee("John", "O'Reilly"));
        list.add(new Employee("Paul", "Smith"));
        list.add(new Employee("Christian", "Arellano"));
        list.add(new Employee("Paul", "Arellano"));
    }

    public static void getNextOnWaitingList(Queue<Employee> list){
        list.remove();
        Employee head = list.peek();
        System.out.println("head of queue-"
                + head);
    }
}
