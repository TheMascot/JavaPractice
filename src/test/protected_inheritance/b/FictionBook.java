package test.protected_inheritance.b;

import test.protected_inheritance.a.Book;

class FictionBook extends Book {

    public void doThings(){
        read();
        this.read();

        FictionBook fb = new FictionBook();
        fb.read();

        SpaceFictionBook sfb = new SpaceFictionBook();
//        sfb.read(); // DOES NOT WORK

        Book book = new Book();
//        book.read(); // DOES NOT WORK
    }

}

class SpaceFictionBook extends Book {

    public void doThings(){
        read();
        this.read();

        SpaceFictionBook sfb = new SpaceFictionBook();
        sfb.read();

        FictionBook fb = new FictionBook();
//         fb.read(); // DOES NOT WORK

        Book book = new Book();
//      ((SpaceFictionBook) book).read(); // DOES NOT WORK, ORIGINAL OBJECT IS A BOOK!!!
        Book bookToCast = new SpaceFictionBook();
//        bookToCast.read(); // DOES NOT WORK!!! COMPILER CAN NOT FIND THE METHOD ON THE REFERENCE!
        System.out.println("Proper casting:");
        ((SpaceFictionBook) bookToCast).read(); // PROPERLY CASTED, OBJECT IS THE SAME AS CASTED TYPE
    }

}