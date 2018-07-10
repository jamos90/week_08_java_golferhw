import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

  public static void main(String[] args) {
      Golfer golfer = new Golfer("James", "Amos",22,4);
      DBGolfer.save(golfer);

      Golfer golfer2 = new Golfer("Happy","Gilmore",23,4);
      DBGolfer.save(golfer2);


      List<Golfer> golfers = DBGolfer.getAll();
  }

}
