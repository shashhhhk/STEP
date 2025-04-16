class LibraryManage{
    public static boolean check(String[] books,String book){
        for(int i=0;i<book.length();i++){
            if(books[i]==book)return true;
        }
        return false;
    }
    public static void main(String[] args){
        String[] catalog={"Java Basics","Data Structures","Algorithms"};
        String BookName="Algorithms";
        if(check(catalog,BookName))System.out.println("Book is available");
        else System.out.println("Book is not available");
    }
}