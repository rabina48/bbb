package Generics;

public class Display<K,V>  implements  InterfaceDemo <K,V>{



        private K key;
        private V value;

        public Display(K key, V value) {
            this.key = key;
            this.value = value;
        }


    @Override
    public K getKeyValue() {
            System.out.println(" This is Active voice = Her name is "+key+ " and Roll is "+value);

        return key;
    }

    @Override
    public V getValue() {
            System.out.println("This is Passive Voice = The person age is "+value+ " and her name is "+key);
        return value;
    }

    static void decoratedDisplay(){
            System.out.println("================================================================");
    }

    public static  void main (String[] args){
            Display <String, Integer> display = new Display<String, Integer>("Rabina", 48);
            Display <String ,Integer> display1 = new Display<String, Integer>("Sabina", 50);
            decoratedDisplay();

            display.getKeyValue();
            display1.getKeyValue();

            decoratedDisplay();

            display.getValue();
            display1.getValue();

            decoratedDisplay();


    }
}
