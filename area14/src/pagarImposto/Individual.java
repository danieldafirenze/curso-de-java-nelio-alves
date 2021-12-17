package pagarImposto;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() < 20000) {
            return getAnualIncome() * 0.15 - 0.5 * healthExpenditures;
        }
        else {
            return getAnualIncome() * 0.25 - 0.5 * healthExpenditures;
        }
    }
}
