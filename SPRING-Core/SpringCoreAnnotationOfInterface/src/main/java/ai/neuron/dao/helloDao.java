package ai.neuron.dao;

import org.springframework.stereotype.Repository;

@Repository("men")
public class helloDao implements IDemo
{
	public helloDao()
	{
		System.out.println("hello Dao obj created");
	}
	
	 public boolean save()
	{
		System.out.println("able to save in db helloDao");
		return true;
	}

}
