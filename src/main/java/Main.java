import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        //Добавляю строителей и их професии.


        Builder builder1 = new Builder(Arrays.asList(Skills.BRICKLAYER,Skills.PLASTERER, Skills.PAINTER), new BigDecimal(1000));
        Builder builder2 = new Builder(Arrays.asList(Skills.CARPENTER, Skills.ELECTRICIAN), new BigDecimal(400));
        Builder builder3 = new Builder(Arrays.asList(Skills.ELECTRICIAN, Skills.WELDER), new BigDecimal(700));
        Builder builder4 = new Builder(Arrays.asList(Skills.ELECTRICIAN, Skills.WELDER,Skills.CARPENTER,Skills.PLUMBER), new BigDecimal(1200));


       List<Builder> listOfBuilders = new ArrayList<>();
       listOfBuilders.add(builder1);
       listOfBuilders.add(builder2);
       listOfBuilders.add(builder3);
       listOfBuilders.add(builder4);

       listOfBuilders.stream()

        .forEach(System.out::println);

       }


    }





