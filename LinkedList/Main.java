public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(4);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(0);
//        list.insertFirst(7);
//        list.insert(44, 3);
//        list.deleteFirst();
//        list.deleteLast();
//        list.delete(2);
//        list.display();

//        DLL list = new DLL();
//
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8, 65);
//
//        list.display();


        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.display();
        list.delete(19);
        list.display();
    }
}
