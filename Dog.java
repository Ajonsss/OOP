public class Dog {
    String name;
    boolean isMale;
    int numPuppies;
    String[] listPuppies;



    //Set name of dog//
    public void setName (String newName){
        name = newName;
    }

    //Show new name//
    public String showName(){
        return name;
    }

    public String bagoName(){
        String angName = "The new dog name is " + name;
        return angName;
    }

//...................................................

    public void woof(){
        System.out.println("Woof! Woof!");
    }

//...................................................

    //Set no of puppies
    public void setNum (int newNum){
        numPuppies = newNum;
    }

    //Show new no of puppies//
    public int showNum(){
        return numPuppies;
    }

//...................................................

    //Set puppies name
    public void setNames (String newNames[]){
        listPuppies = newNames;
    }

    //Show puppies name
    public String puppynames(){
        String angNames = "The puppies' names are: " + listPuppies;
        return angNames;
    }

}
