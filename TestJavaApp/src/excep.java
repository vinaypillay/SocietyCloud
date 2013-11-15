class excep 
{
	public static void main(String args[]) {
		int array[] = new int[100];
		try {
			
			array[100] = 100;
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		finally {
			array = null;
		}
	}
	protected void finalize() {
		System.out.println("Finalize is called hahhahha");
	}
	
}
