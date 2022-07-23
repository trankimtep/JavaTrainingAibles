package entity;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private float score;  

    public Student() {}

    public Student(String id, String name, String score) {
        this.id = Integer.parseInt(id);
        this.name = name.trim();
        this.score = Float.parseFloat(score);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student newStudent){
        return id - newStudent.getId();
    }

    @Override
    public String toString(){
        return "id = " + id + "; name = " + name + "; score = " + score + "\n";
    }  
}
