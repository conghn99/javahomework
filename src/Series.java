public class Series extends Film {
    protected int episodes;
    protected int avarageTime;

    public int getEpisode() {
        return this.episodes;
    }
    
    public void setEpisode(int episodes) {
        this.episodes = episodes;
    }

    public int getAvarageTime() {
        return this.avarageTime;
    }
    
    public void setAvarageTime(int avarageTime) {
        this.avarageTime = avarageTime;
    }

    public Series(String id, String title, Genre genre, double ranking, int episodes, int avarageTime) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
        this.episodes = episodes;
        this.avarageTime = avarageTime;
    }

    //hàm in ra thông tin
    public void printInfo() {
        System.out.println(this.id);
        System.out.println(this.title);
        System.out.println(this.genre);
        System.out.println(this.ranking);
        System.out.println(this.episodes);
        System.out.println(this.avarageTime);
    }


    //hàm tìm keyword tựa đề phim
    public boolean hasKeyword(String keyword) {
        boolean result = this.title.contains(keyword);
        return result;
    }
}
