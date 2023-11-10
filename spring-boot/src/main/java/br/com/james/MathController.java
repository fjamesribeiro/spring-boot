package br.com.james;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new Exception("Is not a numeric");
		}

		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}

	@RequestMapping(value = "/diff/{numberOne}/{numberTwo}")
	public Double diff(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new Exception("Is not a numeric");
		}

		return convertToDouble(numberOne) - convertToDouble(numberTwo);
	}

	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}")
	public Double mult(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new Exception("Is not a numeric");
		}

		return convertToDouble(numberOne) * convertToDouble(numberTwo);
	}

	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}")
	public Double div(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new Exception("Is not a numeric");
		}

		return convertToDouble(numberOne) / convertToDouble(numberTwo);
	}

	
	
	
	private Double convertToDouble(String strNumber) {
		if (isNumeric(strNumber)) {
			return Double.parseDouble(strNumber);
		} else
			return 0D;
	}

	private boolean isNumeric(String strNumber) {
		return strNumber.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
