public class Movie extends Film{
    protected int time;

    public int getTime() {
        return this.time;
    }
    
    public void setID(int time) {
        this.time = time;
    }

    public Movie(String id, String title, Genre genre, double ranking, int time) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
        this.time = time;
    }

    //hàm in ra thông tin
    public void printInfo() {
        System.out.println(this.id);
        System.out.println(this.title);
        System.out.println(this.genre);
        System.out.println(this.ranking);
        System.out.println(this.time);
    }

    //hàm tìm keyword tựa đề phim
    public boolean hasKeyword(String keyword) {
        boolean result = this.title.contains(keyword);
        return result;
    }

    
}
