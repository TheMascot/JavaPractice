package test.protected_inheritance.a;

public class Book {

    protected void read(){
        System.out.println("Reading");
    }

}

class NonFictionBook extends Book{
    public void doThings(){
        read();
    }
}
