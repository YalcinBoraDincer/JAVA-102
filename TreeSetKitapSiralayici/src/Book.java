public class Book implements Comparable<Book>{
    private String title;
    private int pageNo;

    public Book(String name, int pageNo) {
        this.title = name;
        this.pageNo = pageNo;
    }

    public String getTitle() {
        return title;
    }



    public int getPageNo() {
        return pageNo;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }



    @Override
    public String toString() {
        return "Title: " + title + ", PageNo: " +pageNo;
    }
}
