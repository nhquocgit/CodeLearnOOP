public class Entry {
    public static void main(String[] args) {
        Animal[] animals= new Animal[4];
        animals[0]= new Animal();
        animals[1]= new Dog();
        animals[2]= new Cat();
        animals[3]= new Duck();
        for (int i=0; i<= animals.length;i++){
            animals[i].sound();
        }

    }
}
