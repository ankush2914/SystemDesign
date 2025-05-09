package BookMyShowSystemDesign;

class Student{
    private int id;
    private String name;
    private int regno;
    private String fatherName;
    private String motherName;
    
    private Student(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.regno = builder.regno;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
    }
    public void printDetails(){
        System.out.println("ID: "+ this.id);
        System.out.println("Name: "+this.name);
        System.out.println("RegNo: "+this.regno);
        System.out.println("FatherName: "+this.fatherName);
        System.out.println("MotherName: "+this.motherName);
    }
    public static class Builder{
        private int id;
        private String name;
        private int regno;
        private String fatherName;
        private String motherName;
        public Builder setId(int id){
            this.id = id;
            return this;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setRegNo(int regno){
            this.regno = regno;
            return this;
        }
        public Builder setFatherName(String fatherName){
            this.fatherName = fatherName;
            return this;
        }
        public Builder setMotherName(String motherName){
            this.motherName = motherName;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}

public class BuilderClass {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                            .setId(101)
                            .setName("Ankush")
                            .setMotherName("Geeta Verma")
                            .build();
        student.printDetails();
    }
}
