interface Animal {
    public String getAnimalName();
}

class Fish implements Animal {

    @Override
    public String getAnimalName() {
        return "Fish";
    }

}

class Bear implements Animal {

    @Override
    public String getAnimalName() {
        return "Bear";
    }

}

class EcoSystem {
    Animal animals[];

    public EcoSystem() {
        animals = new Animal[20];

        for(int i=0; i<animals.length; i++) {
            int x = (int) (Math.random() * 4);


            if(x == 0) {
                animals[i] = new Fish();
            } else if(x == 1) {
                animals[i] = new Bear();
            }

        }
    }

    public void simulate() {
        for(int i=0; i<animals.length - 1; i++) {

            if(animals[i] != null && ((int) (Math.random() * 2) == 1)) {

                if(animals[i+1] == null) {
                    animals[i+1] = animals[i];
                    animals[i] = null;

                } else if(animals[i+1].getAnimalName().equals(animals[i].getAnimalName())) {

                    int newRandomIndex = (int) (Math.random() * animals.length);

                    int count = 0;
                    while(animals[newRandomIndex] != null && count++ < 20) {
                        newRandomIndex = (int) (Math.random() * animals.length);
                    }

                    if(animals[i].getAnimalName().equals("Fish")) {
                        animals[newRandomIndex] = new Fish();
                    } else {
                        animals[newRandomIndex] = new Bear();
                    }

                } else {

                    if(animals[i].getAnimalName().equals("Fish")) {
                        animals[i] = null;
                    } else {
                        animals[i+1] = null;
                    }
                }
            }

        }
    }

    public void display() {
        for(int i=0; i<animals.length; i++) {

            if(animals[i] == null) {
                System.out.printf("%3s", "");
            } else {
                System.out.printf("%3s", animals[i].getAnimalName().substring(0, 1));
            }

            if(i % 10 == 9) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
public class EcoSystemDemo {

    public static void main(String[] args) {
        int i = 0;

        EcoSystem ecoSystem = new EcoSystem();
        while(i < 5) {
            ecoSystem.display();
            ecoSystem.simulate();
            i++;;
        }
    }

}