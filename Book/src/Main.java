import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProgrammingBook pb1 = new ProgrammingBook("PB1", "Js", 50, "tg1", "JavaScript", "Angular");
        ProgrammingBook pb2 = new ProgrammingBook("PB2", "Java", 60, "tg2", "Java", "SpringMVC");
        ProgrammingBook pb3 = new ProgrammingBook("PB3", "PHP", 55, "tg3", "PHP", "PHP Framework");
        ProgrammingBook pb4 = new ProgrammingBook("PB4", "C#", 100, "tg4", "C#", ".NET");
        ProgrammingBook pb5 = new ProgrammingBook("PB5", "Ruby on Rails", 50, "tg5", "Ruby", "Rails");

        FictionBook fb1 = new FictionBook("FB1", "Sach1", 50, "tg6", "vien tuong 1");
        FictionBook fb2 = new FictionBook("FB2", "Sach2", 200, "tg7", "vien tuong 1");
        FictionBook fb3 = new FictionBook("FB3", "Sach3", 2500, "tg8", "vien tuong 2");
        FictionBook fb4 = new FictionBook("FB4", "Sach4", 1200, "tg9", "vien tuong 3");
        FictionBook fb5 = new FictionBook("FB5", "Sach5", 80, "tg0", "vien tuong 4");

        Book[] listBooks = {pb1, pb2, pb3, pb4, pb5, fb1, fb2, fb3, fb4, fb5};

        getSumPrice(listBooks);
        countLanguage(listBooks);
        coutCategory(listBooks);
        countFictionPrice(listBooks);

        Scanner input=new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        String name= input.nextLine();
        for (int i = 0; i < listBooks.length ; i++) {
            if (listBooks[i].getName().equals(name)){
                System.out.println("Giá của cuốn sách "+name+ " là: "+listBooks[i].getPrice());
                break;
            }
            if (i==listBooks.length-1){
                System.out.println("Không tìm thấy tên sách!!!");
            }
        }

    }
    public static int getSumPrice(Book[] books){
        int sum=0;
        for (int i = 0; i < books.length ; i++) {
            sum+=books[i].getPrice();
        }
        System.out.println("Tổng giá 10 cuốn sách là: " +sum);
        return sum;
    }
    public static int countLanguage(Book[] books){
        int cnt=0;
        for (Book a:books
             ) {
            if (a instanceof ProgrammingBook){
                if (((ProgrammingBook) a).getLanguage()=="Java"){
                    cnt++;
                }
            }
        }
        System.out.println("Số sách Programing có language Java là: "+cnt);
        return cnt;
    }
    public static int coutCategory(Book[] books){
        int cnt1=0;
        for (Book b:books
             ) {
            if (b instanceof  FictionBook){
                if (((FictionBook) b).getCategory()=="vien tuong 1"){
                    cnt1++;
                }
            }
        }
        System.out.println("Số cuốn sách Fiction có thể loại viễn tưởng là: " +cnt1);
        return cnt1;
    }
    public static int countFictionPrice(Book[] books){
        int cnt2=0;
        for (Book c:books
             ) {
            if (c instanceof FictionBook){
                if (c.getPrice()<100){
                    cnt2++;
                }
            }
        }
        System.out.println("Số cuốn sách Fiction có giá nhỏ hơn 100 là: "+cnt2);
        return cnt2;
    }

}

