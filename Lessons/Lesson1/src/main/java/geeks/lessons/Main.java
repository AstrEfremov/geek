package geeks.lessons;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[10];
        for (int i = 0; i < animals.length; i++) {
            if (i%2==0) {
                animals[i] = new Dog("dog "+(i/2+1), (int)(Math.random()*10), (int)(Math.random()*1000));
            }
            else {
                animals[i] = new Tiger("tiger "+(i+1), (int)(Math.random()*10), (int)(Math.random()*1000));
            }
            animals[i].run();
            animals[i].swim();
        }
        Cat house = new HouseCat("John", 1 , 2 );
        System.out.println(Dog.getCountDogs());
        System.out.println(Tiger.getCountTiger());
    }
}