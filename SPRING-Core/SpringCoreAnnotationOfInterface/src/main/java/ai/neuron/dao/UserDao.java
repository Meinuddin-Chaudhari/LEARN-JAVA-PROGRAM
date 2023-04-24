package ai.neuron.dao;

import org.springframework.stereotype.Repository;



@Repository("hen ")
public class UserDao implements IDemo
{
	public UserDao()
	{
		System.out.println("UserDao Dao obj created");
	}
	
	 public boolean save()
	{
		System.out.println("able to save in db UserDao");
		return true;
	}

}


