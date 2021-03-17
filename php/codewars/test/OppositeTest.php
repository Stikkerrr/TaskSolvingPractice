<?php
include '../eighthkyu/oppositenumber.php';

use PHPUnit\Framework\TestCase;

class OppositeTest extends TestCase {

	public function testOpposite() {
		$oppoobj = new Oppositeclass();
		$this->assertEquals(-1, $oppoobj->opposite(1));
		$this->assertEquals(14, $oppoobj->opposite(-14));
		$this->assertEquals(34, $oppoobj->opposite(-34));
	}
}
