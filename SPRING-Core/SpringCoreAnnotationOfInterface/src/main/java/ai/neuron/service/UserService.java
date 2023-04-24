package ai.neuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ai.neuron.dao.IDemo;


@Service
public class UserService 
{
	@Autowired()
	@Qualifier("hen")
	private IDemo pay;

	public void setPay(IDemo pay) {
		this.pay = pay;
	}

	public UserService()
	{
		System.out.println("User service obj created");
	}
	 
	public void storeInDb()
	{
		boolean status=pay.save();
		if(status)
		{
			System.out.println("Storing sucess");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
