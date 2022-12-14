package tapshyrma17_1;

public class Cow extends AbstractAnimal{
    private double weight;
    private int age;
    private String gender;
    private String nickName;

    public Cow(String nickName, int age, double weight, String gender){
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }
    @Override
    public void voice(){
        System.out.println("The cow says: muu muu");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public String getNickName() {
        return nickName;
    }

}
