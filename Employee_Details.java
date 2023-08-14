class Employee{
    void print(String Name, int Year, String Address){
        System.out.println(Name+"\t\t\t"+Year+"\t\t\t"+Address);
    }
}
class Employee_Details{
    public static void main(String[] args){
        System.out.println("Name        Year of Joining         Address");
        Employee e=new Employee();
        e.print("Robert", 1994, "64C-WallsStreat");
        e.print("Sam", 2000, "68D-WallsStreat");
        e.print("John", 1999, "26B-WallsStreat");
    }
}
