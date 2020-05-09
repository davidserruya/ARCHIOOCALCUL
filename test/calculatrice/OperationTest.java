package calculatrice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controller.Calculate;
import exception.ExceptionEnum;
import model.OperationModel;
import settings.ApplicationProperties;

public class OperationTest {

	@Before
	public void initializeProperties() {
		ApplicationProperties.getInstance("server/settings/messages_fr.properties");
	}

	@Test
	public void testAddidtion() {
		OperationModel add = Calculate.calculate(new OperationModel(1, 1, "+"));
		assertEquals(2, (int) add.getResult());
	}

	@Test
	public void testSoustraction() {
		OperationModel sou = Calculate.calculate(new OperationModel(1, 1, "-"));
		assertEquals(0, (int) sou.getResult());
	}

	@Test
	public void testMultiplication() {
		OperationModel mul = Calculate.calculate(new OperationModel(1, 1, "*"));
		assertEquals(1, (int) mul.getResult());
	}

	@Test
	public void testDivision() {
		OperationModel div = Calculate.calculate(new OperationModel(1, 1, "/"));
		assertEquals(1, (int) div.getResult());
		div = Calculate.calculate(new OperationModel(1, 0, "/"));
		assertEquals(ExceptionEnum.DIVISION_BY_ZERO.getCode(), div.getErrorCode());
		assertEquals(ExceptionEnum.DIVISION_BY_ZERO.getDefaultMessage(), div.getError());
	}

	@Test
	public void testError() {
		OperationModel test = Calculate.calculate(new OperationModel(1, 1, "%"));
		assertEquals(ExceptionEnum.UNKNOW_OPERATION.getCode(), test.getErrorCode());
		assertEquals(ExceptionEnum.UNKNOW_OPERATION.getDefaultMessage(), test.getError());
	}

}
