package test.protected_inheritance.b;

import test.protected_inheritance.a.Book;

class SpaceFictionBook2 extends Book {

    public void doThings(){
        read();
        this.read();

        SpaceFictionBook2 sfb2 = new SpaceFictionBook2();
        sfb2.read();

        FictionBook fb = new FictionBook();
//       fb.read(); // DOES NOT WORK

        Book book = new Book();
//       book.read(); // DOES NOT WORK
    }

}
