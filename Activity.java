class Activity{
    public static void main(String[] args) {
 
        Dog dog = new Dog();

        //Set name
        String setName = "Bogart";
        dog.setName(setName);

        //Show name
        System.out.println(dog.showName());

        System.out.println(dog.bagoName());

        //...................................................

        //print "woof! woof!"
        dog.woof();

        //...................................................

       //Set num of puppies
       int setNum = 69;
       dog.setNum(setNum);

       //Show no of puppies
       System.out.println(dog.showNum());

        //...................................................

       String setNames[] = {"Maria, Leonora, Teresa"};


       System.out.println(dog.puppynames());
    }
}