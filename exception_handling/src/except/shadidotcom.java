package except;

public class shadidotcom {
	static int age=14;	
static void submit() throws marriageException
{
if(age>=21)
{
System.out.println("happy life");	
}
else
{
throw new marriageException("invalid age");	
}
}
public static void main(String[] args)
{
try
{
submit();	
}
catch(marriageException e)
{
System.out.println(e.getmessage());	
}
}
}
class marriageException extends Exception
{
String textmsg;
marriageException(String textmsg)
{
this.textmsg=textmsg;	
}
public String getmessage()
{
return textmsg;	
}
}