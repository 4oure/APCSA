package inheritence;

public class Dog extends Mammal {

        private String name;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public Dog() {
            super();
        }

        public Dog(String hairColor, String nameOfDog) {
            super(hairColor);
            name = nameOfDog;
        }
        @Override
        public String talk(){
            return "Hi, my name is " + name;
        }


    }

