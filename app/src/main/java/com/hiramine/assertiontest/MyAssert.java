package com.hiramine.assertiontest;

public class MyAssert
{
	public static void assertTrue( boolean condition )
	{
		// assert版
		// assert( bValue );

		// Assert.assertTrue版
		// Assert.assertTrue( bValue );

		// BuildConfig.DEBUG && 版
		if( BuildConfig.DEBUG && !condition )
		{
			throw new AssertionError();
		}
	}
}
