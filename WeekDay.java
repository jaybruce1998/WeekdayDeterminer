import java.util.Calendar;
import java.util.Date;
import java.time.DayOfWeek;
public class WeekDay
{
	public static void main(String[] a)
	{
		Calendar c = Calendar.getInstance();
		c.setTime(new Date(a[0]));
		int d = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(DayOfWeek.of(d==1?7:d-1));
	}
}