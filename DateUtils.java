package com.androidappmaster.utils;

import android.content.Context;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;

/**
 * @author Jatin Patel
 */
public class DateUtils {
    //Format: year-month-day hour: minute: second
    public static final String FORMAT_ONE = "yyyy-MM-dd HH:mm:ss";

    // Format: year-month-day hour: minute
    public static final String FORMAT_TWO = "yyyy-MM-dd HH:mm";

    // Format: year, month, day, hour, minute, second
    public static final String FORMAT_THREE = "yyyyMMdd-HHmmss";

    // Format: year-month-day
    public static final String LONG_DATE_FORMAT = "yyyy-MM-dd";

    // Format: month-day
    public static final String SHORT_DATE_FORMAT = "MM-dd";

    // Format: hour: minute: second
    public static final String LONG_TIME_FORMAT_SS = "HH:mm:ss";

    //Format: hour: minute
    public static final String LONG_TIME_FORMAT = "HH:mm";


    //Format: year-month
    public static final String MONTG_DATE_FORMAT = "yyyy-MM";

    // year
    public static final int SUB_YEAR = Calendar.YEAR;

    // Month
    public static final int SUB_MONTH = Calendar.MONTH;

    // Date
    public static final int SUB_DAY = Calendar.DATE;

    // Hour
    public static final int SUB_HOUR = Calendar.HOUR;

    // Minute
    public static final int SUB_MINUTE = Calendar.MINUTE;

    // Second
    public static final int SUB_SECOND = Calendar.SECOND;

    static final String dayNames[] = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday"};

    @SuppressWarnings("unused")
    private static final SimpleDateFormat timeFormat = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss");

    public DateUtils() {
    }

    /**
     * Convert a string that matches the date format to a date type
     *
     * @param dateStr
     * @return
     */
    public static java.util.Date stringtoDate(String dateStr, String format) {
        Date d = null;
        SimpleDateFormat formater = new SimpleDateFormat(format);
        try {
            formater.setLenient(false);
            d = formater.parse(dateStr);
        } catch (Exception e) {
            // log.error(e);
            d = null;
        }
        return d;
    }

    /**
     * Convert a string that matches the date format to a date type
     */
    public static java.util.Date stringtoDate(String dateStr, String format,
                                              ParsePosition pos) {
        Date d = null;
        SimpleDateFormat formater = new SimpleDateFormat(format);
        try {
            formater.setLenient(false);
            d = formater.parse(dateStr, pos);
        } catch (Exception e) {
            d = null;
        }
        return d;
    }

    /**
     * Convert date to string
     *
     * @param date
     * @return
     */
    public static String dateToString(java.util.Date date, String format) {
        String result = "";
        SimpleDateFormat formater = new SimpleDateFormat(format);
        try {
            result = formater.format(date);
        } catch (Exception e) {
            // log.error(e);
        }
        return result;
    }

    /**
     * Get the specified format of the current time
     *
     * @param format
     * @return
     */
    public static String getCurrDate(String format) {
        return dateToString(new Date(), format);
    }

    /**
     * @param dateStr
     * @param amount
     * @return
     */
    public static String dateSub(int dateKind, String dateStr, int amount) {
        Date date = stringtoDate(dateStr, FORMAT_ONE);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(dateKind, amount);
        return dateToString(calendar.getTime(), FORMAT_ONE);
    }

    /**
     * Subtracting two dates
     *
     * @param firstTime
     * @param secTime
     * @return Seconds obtained by subtraction
     */
    public static long timeSub(String firstTime, String secTime) {
        long first = stringtoDate(firstTime, FORMAT_ONE).getTime();
        long second = stringtoDate(secTime, FORMAT_ONE).getTime();
        return (second - first) / 1000;
    }

    /**
     * Get the number of days in a month
     *
     * @param year  int
     * @param month int
     * @return int
     */
    public static int getDaysOfMonth(String year, String month) {
        int days = 0;
        if (month.equals("1") || month.equals("3") || month.equals("5")
                || month.equals("7") || month.equals("8") || month.equals("10")
                || month.equals("12")) {
            days = 31;
        } else if (month.equals("4") || month.equals("6") || month.equals("9")
                || month.equals("11")) {
            days = 30;
        } else {
            if ((Integer.parseInt(year) % 4 == 0 && Integer.parseInt(year) % 100 != 0)
                    || Integer.parseInt(year) % 400 == 0) {
                days = 29;
            } else {
                days = 28;
            }
        }

        return days;
    }

    /**
     * Get the number of days in a certain month
     *
     * @param year  int
     * @param month int Month [1-12]
     * @return int
     */
    public static int getDaysOfMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    /**
     * Get the current date
     *
     * @return int
     */
    public static int getToday() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DATE);
    }

    /**
     * Get the current month
     *
     * @return int
     */
    public static int getToMonth() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * Get the current year
     *
     * @return int
     */
    public static int getToYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    /**
     * Return date of the day
     *
     * @param date Date
     * @return int
     */
    public static int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DATE);
    }

    /**
     * Return date of the year
     *
     * @param date Date
     * @return int
     */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * The month of the return date, 1-12
     *
     * @param date Date
     * @return int
     */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * Calculates the number of days between two dates,
     * if date2 > date1 returns a positive number, otherwise returns a negative number
     *
     * @param date1 Date
     * @param date2 Date
     * @return long
     */
    public static long dayDiff(Date date1, Date date2) {
        return (date2.getTime() - date1.getTime()) / 86400000;
    }

    /**
     * Compare the difference between two dates
     *
     * @param before
     * @param after
     * @return
     */
    public static int yearDiff(String before, String after) {
        Date beforeDay = stringtoDate(before, LONG_DATE_FORMAT);
        Date afterDay = stringtoDate(after, LONG_DATE_FORMAT);
        return getYear(afterDay) - getYear(beforeDay);
    }

    /**
     * Compare the difference between the specified date and the current date
     *
     * @param after
     * @return
     */
    public static int yearDiffCurr(String after) {
        Date beforeDay = new Date();
        Date afterDay = stringtoDate(after, LONG_DATE_FORMAT);
        return getYear(beforeDay) - getYear(afterDay);
    }

    /**
     * Compare the difference between the specified date and the current date
     *
     * @param before
     * @return
     * @author Jatin Patel
     */
    public static long dayDiffCurr(String before) {
        Date currDate = DateUtils.stringtoDate(currDay(), LONG_DATE_FORMAT);
        Date beforeDate = stringtoDate(before, LONG_DATE_FORMAT);
        return (currDate.getTime() - beforeDate.getTime()) / 86400000;

    }

    /**
     * Get the first week of the month
     *
     * @param year
     * @param month
     * @return
     * @author Jatin Patel
     */
    public static int getFirstWeekdayOfMonth(int year, int month) {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.SATURDAY); // 星期天为第一天
        c.set(year, month - 1, 1);
        return c.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * Get the last week of the month
     *
     * @param year
     * @param month
     * @return
     * @author Jatin Patel
     */
    public static int getLastWeekdayOfMonth(int year, int month) {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.SATURDAY); // 星期天为第一天
        c.set(year, month - 1, getDaysOfMonth(year, month));
        return c.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * Get the current date string in the format "yyyy_MM_dd_HH_mm_ss"
     *
     * @return
     */
    public static String getCurrent() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        StringBuffer sb = new StringBuffer();
        sb.append(year).append("_").append(addzero(month, 2))
                .append("_").append(addzero(day, 2)).append("_")
                .append(addzero(hour, 2)).append("_").append(
                addzero(minute, 2)).append("_").append(
                addzero(second, 2));
        return sb.toString();
    }

    /**
     * Get the current date string in the format "yyyy-MM-dd HH:mm:ss"
     *
     * @return
     */
    public static String getNow() {
        Calendar today = Calendar.getInstance();
        return dateToString(today.getTime(), FORMAT_ONE);
    }

    /**
     * Get a constellation based on birthday
     *
     * @param birth YYYY-mm-dd
     * @return
     */
    public static String getAstro(String birth) {
        if (!isDate(birth)) {
            birth = "2000" + birth;
        }
        if (!isDate(birth)) {
            return "";
        }
        int month = Integer.parseInt(birth.substring(birth.indexOf("-") + 1,
                birth.lastIndexOf("-")));
        int day = Integer.parseInt(birth.substring(birth.lastIndexOf("-") + 1));
        String s = "Konjac water bottle Pisces mutton Taurus Gemini Cancer lion Virgin Libra Scorpio Shooter Konjac";
        int[] arr = {20, 19, 21, 21, 21, 22, 23, 23, 23, 23, 22, 22};
        int start = month * 2 - (day < arr[month - 1] ? 2 : 0);
        return s.substring(start, start + 2) + "seat";
    }

    /**
     * Determine if the date is valid, including the leap year
     *
     * @param date YYYY-mm-dd
     * @return
     */
    public static boolean isDate(String date) {
        StringBuffer reg = new StringBuffer(
                "^((\\d{2}(([02468][048])|([13579][26]))-?((((0?");
        reg.append("[13578])|(1[02]))-?((0?[1-9])|([1-2][0-9])|(3[01])))");
        reg.append("|(((0?[469])|(11))-?((0?[1-9])|([1-2][0-9])|(30)))|");
        reg.append("(0?2-?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][12");
        reg.append("35679])|([13579][01345789]))-?((((0?[13578])|(1[02]))");
        reg.append("-?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))");
        reg.append("-?((0?[1-9])|([1-2][0-9])|(30)))|(0?2-?((0?[");
        reg.append("1-9])|(1[0-9])|(2[0-8]))))))");
        Pattern p = Pattern.compile(reg.toString());
        return p.matcher(date).matches();
    }

    /**
     * Get the date after the specified date has passed months (when months are negative for the specified month);
     *
     * @param date   When the date is null, it means the same day.
     * @param months Number of months added (subtracted)
     */
    public static Date nextMonth(Date date, int months) {
        Calendar cal = Calendar.getInstance();
        if (date != null) {
            cal.setTime(date);
        }
        cal.add(Calendar.MONTH, months);
        return cal.getTime();
    }

    /**
     * Get the date after the specified date has passed day days (when day is negative, it means before the date);
     *
     * @param date When the date is null, it means the same day.
     * @param day  Number of months added (subtracted)
     */
    public static Date nextDay(Date date, int day) {
        Calendar cal = Calendar.getInstance();
        if (date != null) {
            cal.setTime(date);
        }
        cal.add(Calendar.DAY_OF_YEAR, day);
        return cal.getTime();
    }

    /**
     * Get the date from today day
     *
     * @param day
     * @param format
     * @return
     * @author Jatin Patel
     */
    public static String nextDay(int day, String format) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, day);
        return dateToString(cal.getTime(), format);
    }

    /**
     * Get the date after the specified date has passed day (when day is negative for the specified month)
     *
     * @param date 日期 When it is null, it means the same day.
     */
    public static Date nextWeek(Date date, int week) {
        Calendar cal = Calendar.getInstance();
        if (date != null) {
            cal.setTime(date);
        }
        cal.add(Calendar.WEEK_OF_MONTH, week);
        return cal.getTime();
    }

    /**
     * Get the current date (yyyy-MM-dd)
     */
    public static String currDay() {
        return DateUtils.dateToString(new Date(), DateUtils.LONG_DATE_FORMAT);
    }

    /**
     * Get yesterday's date
     *
     * @return
     */
    public static String befoDay() {
        return befoDay(DateUtils.LONG_DATE_FORMAT);
    }

    /**
     * Get yesterday's date based on time type
     *
     * @param format
     * @return
     * @author Jatin Patel
     */
    public static String befoDay(String format) {
        return DateUtils.dateToString(DateUtils.nextDay(new Date(), -1), format);
    }

    /**
     * Get tomorrow's date
     */
    public static String afterDay() {
        return DateUtils.dateToString(DateUtils.nextDay(new Date(), 1),
                DateUtils.LONG_DATE_FORMAT);
    }

    /**
     * Get the current time distance from 1900/1/1
     *
     * @return
     */
    public static int getDayNum() {
        int daynum = 0;
        GregorianCalendar gd = new GregorianCalendar();
        Date dt = gd.getTime();
        GregorianCalendar gd1 = new GregorianCalendar(1900, 1, 1);
        Date dt1 = gd1.getTime();
        daynum = (int) ((dt.getTime() - dt1.getTime()) / (24 * 60 * 60 * 1000));
        return daynum;
    }

    /**
     * The inverse method of getDayNum (used to process date format data extracted by Excel, etc.)
     *
     * @param day
     * @return
     */
    public static Date getDateByNum(int day) {
        GregorianCalendar gd = new GregorianCalendar(1900, 1, 1);
        Date date = gd.getTime();
        date = nextDay(date, day);
        return date;
    }

    /**
     * For yyyy-MM-dd HH:mm:ss format, display yyyymmdd
     */
    public static String getYmdDateCN(String datestr) {
        if (datestr == null)
            return "";
        if (datestr.length() < 10)
            return "";
        StringBuffer buf = new StringBuffer();
        buf.append(datestr.substring(0, 4)).append(datestr.substring(5, 7))
                .append(datestr.substring(8, 10));
        return buf.toString();
    }

    /**
     * Get the first day of the month
     *
     * @param format
     * @return
     */
    public static String getFirstDayOfMonth(String format) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, 1);
        return dateToString(cal.getTime(), format);
    }

    /**
     * Get the last day of the month
     *
     * @param format
     * @return
     */
    public static String getLastDayOfMonth(String format) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, 1);
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DATE, -1);
        return dateToString(cal.getTime(), format);
    }

    /**
     * The metadata is padded with zeros, and the total length after the complement is the specified length, which is returned as a string.
     *
     * @param sourceDate
     * @param formatLength
     * @return Restructured data
     */
    public static String addzero(int sourceDate, int formatLength) {
        /*
         * 0 means the front is supplemented with zero
         * The total length of the formatLength character is formatLength
         * d represents a positive number.
         */
        String newString = String.format("%0" + formatLength + "d", sourceDate);
        return newString;
    }


    /**
     * Get the current day of the week
     *
     * @return Day of the week
     */
    public static String getWeek() {
        Calendar cal = Calendar.getInstance();
        return dayNames[cal.get(Calendar.DAY_OF_WEEK)];
    }

    /**
     * Get time according to the 12-hour or 24-hour system
     *
     * @return time
     */
    public static String getCurrentTimeBy12_24(Context context) {
        if (android.text.format.DateFormat.is24HourFormat(context)) {
            return getCurrDate(LONG_TIME_FORMAT);
        } else {
            StringBuilder sb = new StringBuilder();
            int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            int minute = Calendar.getInstance().get(Calendar.MINUTE);
            if (hour >= 12) {
                sb.append(hour - 12).append(":").append(minute).append(" PM");
            } else {
                sb.append(hour).append(":").append(minute).append(" AM");
            }
            return sb.toString();
        }
    }
}
