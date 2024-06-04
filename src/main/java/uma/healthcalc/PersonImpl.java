package uma.healthcalc;

public class PersonImpl implements Person{
    private float weight;
    private float height;
    private Gender gender;
    private int age;

    public PersonImpl(float weight, float height, Gender gender, int age){
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.age = age;
    }

    public PersonImpl(float height, Gender gender){
        this.weight = 0;
        this.height = height;
        this.gender = gender;
        this.age = -1;
    }

    @Override
    public float weight() {
        return weight;
    }

    @Override
    public float height() {
        return height;
    }

    @Override
    public Gender gender() {
        return gender;
    }

    @Override
    public int age() {
        return age;
    }

    
}
