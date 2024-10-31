package except;

public class phone{
	static int digit=6;	
static void submit() throws phoneException
{
if(digit==10)
{
System.out.println("phone number accepted");	
}
else
{
throw new phoneException("rejected");	
}
}
public static void main(String[] args)
{
try
{
submit();	
}
catch(phoneException e)
{
System.out.println(e.getmessage());	
}
}
}
class phoneException extends Exception
{
String textmsg;
phoneException(String textmsg)
{
this.textmsg=textmsg;	
}
public String getmessage()
{
return textmsg;	
}
}