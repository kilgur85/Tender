import java.math.BigDecimal;
import java.util.*;

public class Brigade {
    private BigDecimal totalPrice;

    private List<Builder> builders;

    public Brigade(BigDecimal totalPrice, List<Builder> builders) {
        this.totalPrice = totalPrice;

        this.builders = builders;
    }

    public BigDecimal totalPrice(List<Builder> builders) {
        builders.stream()
                .map(Builder::getSalary)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return totalPrice;

    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Builder> getBuilders() {
        return builders;
    }

    public void setBuilders(List<Builder> builders) {
        this.builders = builders;
    }


    @Override
    public String toString() {
        return "Brigade{" +
                "totalPrice=" + totalPrice +
                ", totalSkillsInBrigades=" +
                ", builders=" + builders +
                '}';
    }
}





