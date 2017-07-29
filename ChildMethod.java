package assignments;

public class ChildMethod extends AbstractMethod{
	@Override
	public void property() {
		System.out.println("children will be inheriting the parents's property");
		
	}

	
	public static void main(String[] args) {
		ChildMethod c= new ChildMethod();
		c.teach();
		c.property();
	
			
		}	

	}

	

