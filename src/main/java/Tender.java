import java.math.BigDecimal;
import java.util.*;

public class Tender {
    private BigDecimal priceForWork;
    private List<Brigade>brigades;

    public Tender(BigDecimal priceForWork, List<Brigade> brigades) {
        this.priceForWork = priceForWork;
        this.brigades = brigades;
    }

    public BigDecimal getPriceForWork() {
        return priceForWork;
    }

    public void setPriceForWork(BigDecimal priceForWork) {
        this.priceForWork = priceForWork;
    }

    public List<Brigade> getBrigades() {
        return brigades;
    }

    public void setBrigades(List<Brigade> brigades) {
        this.brigades = brigades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tender)) return false;
        Tender tender = (Tender) o;
        return Objects.equals(getPriceForWork(), tender.getPriceForWork()) && Objects.equals(getBrigades(), tender.getBrigades());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPriceForWork(), getBrigades());
    }

    @Override
    public String toString() {
        return "Tender{" +
                "priceForWork=" + priceForWork +
                ", brigades=" + brigades +
                '}';
    }
}
