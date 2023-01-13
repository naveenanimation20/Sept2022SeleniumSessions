package SeleniumSessions;

public class TimeUtil {

	public final static long SMALL_TIME_OUT = 1000;
	public final static long MEDIUM_TIME_OUT = 5000;
	public final static long LARGE_TIME_OUT = 10000;
	public final static long EXTRA_LARGE_TIME_OUT = 20000;

	public static void smallWait() {
		try {
			Thread.sleep(SMALL_TIME_OUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void mediumWait() {
		try {
			Thread.sleep(MEDIUM_TIME_OUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void largeWait() {
		try {
			Thread.sleep(LARGE_TIME_OUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void extraLargeWait() {
		try {
			Thread.sleep(EXTRA_LARGE_TIME_OUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void applyWait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
