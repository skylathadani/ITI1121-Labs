public class Book {

    private String author;
    private String title;
    private int year;

    public Book (String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    @Override

    public boolean equals(Object other) {
        if(this==other){
            return true;
        }
        if(other == null){
            return false;
        }

        if(this.author == null || this.title == null || this.year == 0){
            return false;
        }

        if(!(other instanceof Book)){
            return false;
        }

        Book o  = (Book) other;


        if(getAuthor().equals(o.getAuthor()) && getTitle().equals(o.getTitle()) && getYear() == o.getYear()){
                return true;
            }

        return false;

    }
        

    public String toString() {
        String r = getAuthor() + ": " + getTitle() + " (" + getYear()+ ")";
        return r;
    }
}