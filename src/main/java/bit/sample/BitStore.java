package bit.sample;

/**
 * This class defined an enum with int value as key and enum value as Stirng
 * will assign values always as 2^0 and so on(1,2,4,8,16,32,64..)
 *Inside DB always store value as int.
 *  Example in DB i want to stroe phoneVerified then DB will contain value as 1,
  * now in DB add isStateVerified as well then in DB value will be 1+8 =9
  * again i want to store isActive in DB , so total value will be 9+32=41
  * similarly if u want to remove some field from DB then substract that value from store value.
 */
public class BitStore 
{
	
	static int base = 32;
	enum state {
		PhoneVerified(1,"phoneVerified"), emailVerified(2,"emailVerified"), TncVerified(4,"tncAccepted"), stateVerified(8,"isStateVerified"), teacher(16,"isTeacher"),active(32,"isActive");
		int key;
		String value;

		state(int key,String val) {
			this.key = key;
			this.value = val;
		}

	}
	
	
    public static void main( String[] args )
    {
		
              // this code will help you to convert int to binary with fixed base value.
               /*
		 * int value = 90; String val = Integer.toBinaryString(value); int remainder =
		 * base-val.length(); for (int i=0;i<remainder;i++) { val ="0"+val; }
		 * 
		 * System.out.println(val);
		 */
       // 33 indicates (PhoneVerified and active)
       matchFound(33);
    }
    
    
    /**
    * this method will take int value and identify what are the attribute found with provided value
    **/
    public static void matchFound (int val) {
       
    	if ((val & state.PhoneVerified.key)==state.PhoneVerified.key) {
    		System.out.println(state.PhoneVerified.value);
    	}if ((val & state.emailVerified.key)==state.emailVerified.key) {
    		System.out.println(state.emailVerified.value);
    	}if ((val & state.TncVerified.key)==state.TncVerified.key) {
    		System.out.println(state.TncVerified.value);
    	}if ((val & state.stateVerified.key)==state.stateVerified.key) {
    		System.out.println(state.stateVerified.value);
    	}if ((val & state.teacher.key)==state.teacher.key) {
    		System.out.println(state.teacher.value);
    	}if ((val & state.active.key)==state.active.key) {
    		System.out.println(state.active.value);
    	}
    }
    
}
