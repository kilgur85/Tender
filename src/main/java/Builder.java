import java.math.BigDecimal;
import java.util.*;

public class Builder {
    private List<Skills> buildersSkills;
    private BigDecimal salary;


    public Builder(List<Skills> buildersSkills, BigDecimal salary) {
        this.buildersSkills = buildersSkills;
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public List<Skills> getBuildersSkills() {
        return buildersSkills;
    }

    public void setBuildersSkills(List<Skills> buildersSkills) {
        this.buildersSkills = buildersSkills;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "buildersSkills=" + buildersSkills +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Builder)) return false;
        Builder builder = (Builder) o;
        return Objects.equals(getBuildersSkills(), builder.getBuildersSkills()) && Objects.equals(getSalary(), builder.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBuildersSkills(), getSalary());
    }
}
