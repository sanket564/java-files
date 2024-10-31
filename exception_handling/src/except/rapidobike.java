package except;

public class rapidobike {
	static int passenger=4;	
static void submit() throws rapidoException
{
if(passenger==1)
{
System.out.println("booking done");	
}
else
{
throw new rapidoException("booking failed");	
}
}
public static void main(String[] args)
{
try
{
submit();	
}
catch(rapidoException e)
{
System.out.println(e.getmessage());	
}
}
}
class rapidoException extends Exception
{
String textmsg;
rapidoException(String textmsg)
{
this.textmsg=textmsg;	
}
public String getmessage()
{
return textmsg;	
}
}