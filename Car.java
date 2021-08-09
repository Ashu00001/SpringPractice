package com.ashu.demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void drive()
	{
		System.out.println("Chal rhi hai");
	}
}
