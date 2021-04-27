package digital.innovation.one.utils;

import digital.innovation.one.utils.interno.DivHelper;
import digital.innovation.one.utils.interno.MultiHelper;
import digital.innovation.one.utils.interno.SubHelper;
import digital.innovation.one.utils.interno.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultiHelper multiHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora() {
        divHelper = new DivHelper();
        multiHelper = new MultiHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public Integer sum(Integer a, Integer b) {
        return sumHelper.execute(a, b);
    }

    public Integer sub(Integer a, Integer b) {
        return subHelper.execute(a, b);
    }

    public Integer div(Integer a, Integer b) {
        return divHelper.execute(a, b);
    }

    public Integer multi(Integer a, Integer b) {
        return multiHelper.execute(a, b);
    }
}
