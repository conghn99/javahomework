enum Genre {
  COMEDY, SLICEOFLIFE, ACTION, ROMANCE, FANTASY
}

public class Film {
  protected String id;
  protected String title;
  protected Genre genre;
  protected double ranking;

  public String getID() {
    return this.id;
  }

  public void setID(String id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Genre getGenre() {
    return this.genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public double getRanking() {
    return this.ranking;
  }

  public void setRanking(Double ranking) {
    this.ranking = ranking;
  }
}
