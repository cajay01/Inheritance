import java.util.ArrayList;
import java.util.List;

public class Trial {

    List<String> ratingList=new ArrayList<>();

    public void putNewRating(String app, int rating){
        // YOUR CODE HERE
        ratingList.add(app+","+rating);
    }


    public double getAverageRating(String app){
        // YOUR CODE HERE
        int cntr=0;
        int total=0;
        for (String ratinL : ratingList) {
            final String[] arrOfStr = ratinL.split(",",2);
            if(arrOfStr[0].equals(app)){
                total=total+Integer.parseInt(arrOfStr[1]);
                cntr=cntr+1;
            }
        }




        return(total/cntr);
    }
}
