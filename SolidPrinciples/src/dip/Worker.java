package dip;

class Worker {
	public void Work()
	{
		
	}

}
class Manager{
	Worker worker;
	
	public void setWorker(Worker w)
	{
		worker = w;
	}
	
	public void manage()
	{
		worker.Work();
	}
}
class SuperWorker
{
	public void work()
	{
		
	}
}