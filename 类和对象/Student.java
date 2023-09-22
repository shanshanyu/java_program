public class Student{
  private int age;  //私有属性
  private String name;

  //无参构造
  public Student(){
  }
  //全参构造
  public Student(int age,String name){
    this.age = age;
    this.name = name;
  }

  //get  set 方法
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }

  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
}
