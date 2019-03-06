//Q1- Implement Singleton Design Pattern on a dummy class.

class DBfetcher
{
	static DBfetcher member;

	private DBfetcher()
	{
		System.out.println("I am constructor of singleton class");
	}

	static DBfetcher getInstance()
	{
		member = new DBfetcher();
		return member;

	}
}

class Singleton
{
	public static void main(String[] args) {

		System.out.println(DBfetcher.getInstance());
		//System.out.println(DBfetcher.member);
		System.out.println(DBfetcher.getInstance());
	}
}