package com.ranfordbank1;

import org.testng.annotations.Test;

public class TestExecution extends Repository

{
	@Test(priority=0)
	public void verify_launch()
	{
		launch();
	}
	@Test(priority=1)
	public void verify_As()
	{
		As();
	}
	@Test(priority=2)
	public void verify_Branches()
	{
		Branches();
	}
	@Test(priority=3)
	public void Verify_Branchsearch()
	{
		Branchsearch();
	}
	@Test(priority=4)
	public void Verify_Newbrach()
	{
		Newbranch();
}
	@Test(priority=5)
	public void Verify_NewBranches()
	{
		NewBranches();
	}
}
