<?php
include '../eighthkyu/evenorodd.php';

use PHPUnit\Framework\TestCase;

class EvenOrOddTest extends TestCase {

	public function testEven_or_odd() {
		$eooFunc = new EvenOrOdd();
		$this->assertEquals("Even", $eooFunc->even_or_odd(2));
		$this->assertEquals("Even", $eooFunc->even_or_odd(0));
		$this->assertEquals("Odd", $eooFunc->even_or_odd(7));
		$this->assertEquals("Odd", $eooFunc->even_or_odd(1));
	}
}
