import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DealerTest{

	@Test
	public void testThatNumberOfItemsIsZero(){
		Dealer dealer = new Dealer();
		float result = Dealer.getNumberOfYearsWhenGoodsBecomesFree();
		assertEquals(result, 0);


	@Test
	public void testThatNumberOfItemsIncreased(){
		Dealer dealer = new Dealer();
		float result = Dealer.getNumberOfYearsWhenGoodsBecomesFree(2);
		assertEquals(result,1);

}
	}

}