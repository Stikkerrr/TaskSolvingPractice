<?php
include '../eighthkyu/multiply.php';

use PHPUnit\Framework\TestCase;

class multiplyclassTest extends TestCase {

	public function testMultiply() {
		$mul = new Multiplyclass();
		$this->assertEquals("a", "a");
		$this->assertEquals([0], [0]);
		$this->assertEquals(6, $mul->multiply(2, 3));
	}
}
