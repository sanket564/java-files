package except;

public class Bookmyshow{
	static int book=7;	
static void submit() throws bookException
{
if(book<10)
{
System.out.println("success");	
}
else
{
throw new bookException("failed");	
}
}
public static void main(String[] args)
{
try
{
submit();	
}
catch(bookException e)
{
System.out.println(e.getmessage());	
}
}
}
class bookException extends Exception
{
String textmsg;
bookException(String textmsg)
{
this.textmsg=textmsg;	
}
public String getmessage()
{
return textmsg;	
}
}