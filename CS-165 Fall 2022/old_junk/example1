import java.util.ArrayList;

public class CallWatch {
   public static void main(String[] args) {
      Watch watch1;
      SmartWatch watch2;
      Watch watch3;

      ArrayList<Watch> watchList = new ArrayList<Watch>();
      int i;

      watch1 = new Watch();
      watch1.setHours(10);
      watch1.setMins(22);
      
      watch2 = new SmartWatch();
      watch2.setHours(20);
      watch2.setMins(44);
      watch2.setPercentage(65);

      watch3 = new Watch();
      watch3.setHours(3);
      watch3.setMins(25);
      
      watchList.add(watch1);
      watchList.add(watch3);
      watchList.add(watch2);

      for(i = 0; i < watchList.size(); ++i) {
         watchList.get(i).printItem();
      }
   }
}
