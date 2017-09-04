package com.tuodao.bp.useraccount.utils;


import org.apache.commons.lang.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期工具
 *
 * @author <a href="mailto:shenwei@ancun.com">ShenWei</a>
 * @version Date: 2010-10-16 上午11:23:38
 */
public class DateUtils {

    /**
     * 获取当前Date
     *
     * @return date
     */
    public static Date getCurrentDate() {
        Date today = new Date();
        return today;
    }

    /**
     * 获取当前Calendar
     *
     * @return 当前Calendar
     */
    public static Calendar getCurrentCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar;
    }

    /**
     * @param date
     * @return Calendar
     */
    public static Calendar getCalendar(Date date) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        return cal;
    }

    /**
     * <p>
     * author: <a href="mailto:shenwei@ancun.com">ShenWei</a><br>
     * version: 2011-3-6 下午03:32:25 <br>
     *
     * @param formatString
     * @param strDate
     */
    public static Date convertStringToDate(String formatString, String strDate) {
        if (StringUtils.isBlank(strDate)) {
            throw new IllegalArgumentException("arg strDate[" + strDate + "] format is wrong");
        }
        if (StringUtils.isBlank(formatString)) {
            throw new IllegalArgumentException("arg formatString[" + formatString + "] format is wrong");
        }

        SimpleDateFormat df = new SimpleDateFormat(formatString);
        Date date = null;

        try {
            date = df.parse(strDate);
        } catch (ParseException ex) {
            throw new IllegalArgumentException("arg formatString[" + formatString + "] format is wrong", ex);
        }

        return (date);
    }

    /**
     * <p>
     * author: <a href="mailto:shenwei@ancun.com">ShenWei</a><br>
     * version: 2011-3-6 下午03:32:35 <br>
     *
     * @param formatString
     * @param date
     */
    public static String formatDate(String formatString, Date date) {
        SimpleDateFormat df = null;
        String returnValue = null;

        if (date != null) {
            df = new SimpleDateFormat(formatString);
            returnValue = df.format(date);
        }

        return returnValue;
    }

    /**
     * 根据当前时间得到一个月前的时间 只包括 年月日
     *
     * @return <p>
     * author: xuyuanyang<br>
     * create at: 2014年4月16日上午12:34:54
     */
    public static String getDateBefore1M() {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int date = now.get(Calendar.DAY_OF_MONTH);
        int[] smallMonths = {2, 4, 6, 9, 11};
        if (month - 1 <= 0) { //跨年
            year = year - 1;
            month = 12;
        }
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0) && month == 3) { //如果1月前是闰年的2月，那么该月的最大天数是28
            month = 2;
            date = date > 28 ? 28 : date;
        } else if (Arrays.asList(smallMonths).contains(month - 1)) {//如果1月前是小月，那么最大的天数是30
            month = month - 1;
            date = date > 30 ? 30 : date;
        } else {
            month = month - 1;
        }
        String months = String.valueOf(month).length() == 1 ? "0" + month : "" + month;
        String dates = String.valueOf(date).length() == 1 ? "0" + date : "" + date;
        return year + "-" + months + "-" + dates;
    }


    /**
     * 获取日期
     *
     * @param date Date
     * @return int
     */
    public static final int getDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DATE);
    }

    /**
     * 计算两个日期的月份
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static int getMonthsBetweenDates(Date startDate, Date endDate) {
        if (startDate.getTime() > endDate.getTime()) {
            Date temp = startDate;
            startDate = endDate;
            endDate = temp;
        }
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(startDate);
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(endDate);

        int yearDiff = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
        int monthsBetween = endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH) + 12 * yearDiff;

        if (endCalendar.get(Calendar.DAY_OF_MONTH) >= startCalendar.get(Calendar.DAY_OF_MONTH))
            monthsBetween = monthsBetween + 1;
        return monthsBetween;

    }

    public static int getIntervalDays(Date firstDate, Date lastDate) {
        if (null == firstDate || null == lastDate) {
            return -1;
        }

        long intervalMilli = lastDate.getTime() - firstDate.getTime();
        return (int) (intervalMilli / (24 * 60 * 60 * 1000));
    }

    /**
     * 两个时间间隔除以24小时
     *
     * @param firstDate
     * @param lastDate
     * @return
     */
    public static int daysOfTwo(Date firstDate, Date lastDate) {
        return getIntervalDays(firstDate, lastDate);
    }

    /**
     * 增加月数
     *
     * @param date
     * @param month 需要增加的月数，比如需要增加2个月，就传入2
     * @return
     */

    public static Date addMonth(Date date, int month) {
        if (null == date) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (month != 0) {
            calendar.add(Calendar.MONTH, month);
        }
        return calendar.getTime();
    }

    /**
     * 日期转字串
     *
     * @param date
     * @return
     */
    public static String getDateStrFromDate(Date date) {
        return getStrFromDate(date, "yyyy-MM-dd");
    }

    public static String getStrFromDate(Date date, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        if (date == null) {
            return "";
        }
        String s = df.format(date);
        return s;
    }

    public static int calDiffMonth(String startDate, String endDate) {
        int result = 0;
        try {
            SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
            Date start = sfd.parse(startDate);
            Date end = sfd.parse(endDate);
            int startYear = getYear(start);
            int startMonth = getMonth(start);
            int startDay = getDay(start);
            int endYear = getYear(end);
            int endMonth = getMonth(end);
            int endDay = getDay(end);
            if (startDay > endDay) { //1月17  大于 2月28
                if (endDay == getDaysOfMonth(getYear(new Date()), 2)) {   //也满足一月
                    result = (endYear - startYear) * 12 + endMonth - startMonth;
                } else {
                    result = (endYear - startYear) * 12 + endMonth - startMonth - 1;
                }
            } else {
                result = (endYear - startYear) * 12 + endMonth - startMonth;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static int getDaysOfMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    public static int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DATE);
    }

    /**
     * 增加天数
     *
     * @param date
     * @param day  需要增加的天数，比如需要增加2天，就传入2
     * @return
     */

    public static Date addDay(Date date, int day) {
        if (null == date) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (day != 0) {
            calendar.add(Calendar.DATE, day);
        }
        return calendar.getTime();
    }

    /**
     * @param date
     * @param day
     * @return
     * @Description:指定时间的上个月
     * @author: chaisen
     * @time:2017年4月11日 下午2:01:14
     */
    public static Date lastMonth(Date date, int month) {
        if (null == date) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (month != 0) {
            calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - month);
        }
        return calendar.getTime();
    }

    /**
     * @param date
     * @return
     * @Description:时间格式化
     * @author: chaisen
     * @time:2017年4月11日 下午2:02:27
     */
    public static String getDateStrFromDateYM(Date date) {
        return getStrFromDate(date, "yyyy-MM");
    }

    /**
     * @param firstDate
     * @param lastDate
     * @return
     * @Description:比较时间大小
     * @author: chaisen
     * @time:2017年4月11日 下午2:24:22
     */
    public static int compareDate(Date firstDate, Date lastDate) {
        firstDate = getDateFromString(formatDatetoString(firstDate, "yyyy-MM-dd"));
        lastDate = getDateFromString(formatDatetoString(lastDate, "yyyy-MM-dd"));
        long first = firstDate.getTime();
        long last = lastDate.getTime();
        if (first == last) {
            return 0;
        } else {
            return (first > last) ? 1 : 2;
        }
    }

    /**
     * 字串转为日期
     *
     * @param dateStr
     * @return
     */
    public static Date getDateFromString(String dateStr) {
        return getDateFromString(dateStr, null);
    }

    /**
     * 字串转为日期
     *
     * @param dateStr
     * @param pattern
     * @return
     */
    public static Date getDateFromString(String dateStr, String pattern) {
        if ((pattern == null) || ("".equals(pattern))) {
            pattern = "yyyy-MM-dd";
        }
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        return date;
    }

    public static String formatDatetoString(Date d, String pattern) {
        if (null == d || StringUtils.isBlank(pattern)) {
            return null;
        }

        SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getDateInstance();

        formatter.applyPattern(pattern);
        return formatter.format(d);
    }

    /**
     * 计算两个日期的月份(不考虑天)
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static int getMonthsBetweenDatesNoDay(Date startDate, Date endDate) {
        if (startDate.getTime() > endDate.getTime()) {
            Date temp = startDate;
            startDate = endDate;
            endDate = temp;
        }
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(startDate);
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(endDate);

        int yearDiff = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
        int monthsBetween = endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH) + 12 * yearDiff;

		/*if(endCalendar.get(Calendar.DAY_OF_MONTH) >= startCalendar.get(Calendar.DAY_OF_MONTH))
            monthsBetween = monthsBetween + 1;*/
        return monthsBetween;

    }

    public static final Date zerolizedTime(Date fullDate) {
        Calendar cal = Calendar.getInstance();

        cal.setTime(fullDate);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }


    public static final Date getSpecialTime(Date date, int day) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.MINUTE, 00);
        cal.set(Calendar.SECOND, 00);
        cal.set(Calendar.MILLISECOND, 00);
        return cal.getTime();
    }

    public static boolean isWeekBetween(int start, int end) {
        Calendar calender = Calendar.getInstance();
        Date date = new Date();
        calender.setTime(date);
        int w = calender.get(Calendar.DAY_OF_WEEK);
        if (start < w && w > end) {
            return true;
        }
        return false;
    }

    public static boolean isHourBetween(int start, int end) {
        Calendar calender = Calendar.getInstance();
        Date date = new Date();
        calender.setTime(date);
        int h = calender.get(Calendar.HOUR_OF_DAY);
        if (start < h && h > end) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Calendar calender = Calendar.getInstance();
        Date date = new Date();
        calender.setTime(date);
        int h = calender.get(Calendar.HOUR_OF_DAY);
        System.out.println(h);
    }

}
