package com.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.mj.Operations;

public class TestExample {
	Operations opr=null;
	int val1,val2,exp;
	@Before
	public void preSetup(){
	opr=new Operations();
	val1=val2=1;
	exp=2;
	}
	@Test
	public void test() {
	int res=opr.doSum(val1, val2);
	assertEquals("Dosum is not working",exp,res);
	}
	@After
	public void postTest(){
	opr=null; val1=val2=exp=0;
	}
}
