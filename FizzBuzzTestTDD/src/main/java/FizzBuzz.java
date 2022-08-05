import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> getNumbers() {
        List<String> numbers =new ArrayList<>();
        for (int i=1;i<100; i++){
            numbers.add(getNumbers(i));
        }
        return numbers;

    }

    private String getNumbers(int i) {
        if (i %3==0 && i %5==0){
            return ("FIZZBUZZ");
        }else if (i %3==0){
            return("FIZZ");
        }else if (i %5==0){
            return("BUZZ");
        }else {
            return(""+ i);
        }
    }
}
