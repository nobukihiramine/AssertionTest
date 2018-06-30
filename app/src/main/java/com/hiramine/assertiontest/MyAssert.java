package com.hiramine.assertiontest;

public class MyAssert
{
	public static void assertTrue( boolean condition )
	{
		// assert版
		// assert( condition );

		// Assert.assertTrue版
		// Assert.assertTrue( condition );

		// BuildConfig.DEBUG && 版
		if( BuildConfig.DEBUG && !condition )
		{
			throw new AssertionError();
		}
	}
}
