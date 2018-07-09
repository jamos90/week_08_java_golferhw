import db.DBGolfer;
import models.Golfer;

public class Runner {

  public static void main(String[] args) {
      Golfer golfer = new Golfer("James", "Amos",22,4);
      DBGolfer.save(golfer);
  }

}
