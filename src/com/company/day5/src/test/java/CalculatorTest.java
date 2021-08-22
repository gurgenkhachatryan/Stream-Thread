import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSumWithValidArguments()
    {
        int a=3;
        int b=4;
        int expectedResult=7;
        Calcurator calcurator=new Calcurator();

       int ac= calcurator.sum(a,b,true);
        Assertions.assertEquals(expectedResult,ac);
    }
}
