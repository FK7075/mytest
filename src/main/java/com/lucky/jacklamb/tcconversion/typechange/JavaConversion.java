package com.lucky.jacklamb.tcconversion.typechange;

import java.sql.Time;
import java.sql.Timestamp;

import com.lucky.jacklamb.expression.ExpressionEngine;
import com.lucky.jacklamb.utils.LuckyUtils;

public class JavaConversion {
	
	public static Object strToBasic(String expression, Object type,boolean isCalculate) {
		String strtype;
		if(type instanceof Class) {
			Class<?> clzz=(Class<?>)type;
			if("java.util.Date".equals(clzz.getName())) {
				strtype="java.util.Date";
			}else if("java.sql.Date".equals(clzz.getName())) {
				strtype="java.sql.Date";
			}else{
				strtype=((Class<?>)type).getSimpleName();
			}
		}
		else {
			strtype=(String) type;
		}
		String data=expression;
		if(isCalculate) {
			data=ExpressionEngine.calculate(expression);
		}
		if("String".equalsIgnoreCase(strtype))
			return data;
		if("int".equals(strtype)||"Integer".equals(strtype))
			return Integer.parseInt(data);
		if("double".equalsIgnoreCase(strtype))
			return Double.parseDouble(data);
		if("boolean".equalsIgnoreCase(strtype))
			return Boolean.parseBoolean(data);
		if("long".equalsIgnoreCase(strtype))
			return Long.parseLong(data);
		if("float".equalsIgnoreCase(strtype))
			return Float.parseFloat(data);
		if("byte".equalsIgnoreCase(strtype))
			return Byte.parseByte(data);
		if("short".equalsIgnoreCase(strtype))
			return Short.parseShort(data);
		if("char".equalsIgnoreCase(strtype))
			return data.charAt(0);
		if("java.util.Date".equalsIgnoreCase(strtype))
			return LuckyUtils.getDate(data);
		if("java.sql.Date".equalsIgnoreCase(strtype))
			return LuckyUtils.getSqlDate(data);
		if("Time".equalsIgnoreCase(strtype))
			return LuckyUtils.getSqlTime(data);
		if("Timestamp".equalsIgnoreCase(strtype))
			return Timestamp.valueOf(data);
		return strtype;
		
	}
	
	/**
	 * String类型转化为其他的基本类型
	 * @param expression String类型表达式
	 * @param type 转换目标类型的Class或String表示
	 * @return
	 */
	public static Object strToBasic(String expression, Object type) {
		return strToBasic(expression,type,false);
	}
	
	/**
	 * String[]类型转化为其他的基本类型的数组
	 * @param arrdata String[]类型数据
	 * @param strtype 转换目标类型的Class或者String表示
	 * @return
	 */
	public static Object[] strArrToBasicArr(String[] arrdata, Object type) {
		String strtype;
		if(type instanceof Class)
			strtype=((Class<?>)type).getSimpleName();
		else
			strtype=(String) type;
		if (arrdata == null)
			return null;
		switch (strtype) {
		case "int": {
			Integer[] ints = new Integer[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				ints[i] = Integer.parseInt(arrdata[i]);
			}
			return ints;
		}
		case "Integer": {
			Integer[] Ints = new Integer[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				Ints[i] = Integer.parseInt(arrdata[i]);
			}
			return Ints;
		}
		case "Double": {
			Double[] Doubs = new Double[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				Doubs[i] = Double.parseDouble(arrdata[i]);
			}
			return Doubs;

		}
		case "double": {
			Double[] doubs = new Double[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				doubs[i] = Double.parseDouble(arrdata[i]);
			}
			return doubs;
		}
		case "long": {
			Long[] Longs = new Long[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				Longs[i] = Long.parseLong(arrdata[i]);
			}
			return Longs;
		}
		case "Long": {
			Long[] Longs = new Long[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				Longs[i] = Long.parseLong(arrdata[i]);
			}
			return Longs;
		}
		case "float": {
			Float[] floats = new Float[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				floats[i] = Float.parseFloat(arrdata[i]);
			}
			return floats;
		}
		case "Float": {
			Float[] floats = new Float[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				floats[i] = Float.parseFloat(arrdata[i]);
			}
			return floats;
		}
		case "byte": {
			Byte[] bytes = new Byte[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				bytes[i] = Byte.parseByte(arrdata[i]);
			}
			return bytes;
		}
		case "Byte": {
			Byte[] bytes = new Byte[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				bytes[i] = Byte.parseByte(arrdata[i]);
			}
			return bytes;
		}
		case "boolean": {
			Boolean[] booleans = new Boolean[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				booleans[i] = Boolean.parseBoolean(arrdata[i]);
			}
			return booleans;
		}
		case "Boolean": {
			Boolean[] booleans = new Boolean[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				booleans[i] = Boolean.parseBoolean(arrdata[i]);
			}
			return booleans;
		}
		case "short": {
			Short[] shorts = new Short[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				shorts[i] = Short.parseShort(arrdata[i]);
			}
			return shorts;
		}
		case "Short": {
			Short[] shorts = new Short[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				shorts[i] = Short.parseShort(arrdata[i]);
			}
			return shorts;
		}
		case "Timestamp": {
			Timestamp[] timestamps = new Timestamp[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				timestamps[i] = Timestamp.valueOf(arrdata[i]);
			}
			return timestamps;
		}
		case "Time": {
			Time[] times = new Time[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				times[i] = Time.valueOf(arrdata[i]);
			}
			return times;
		}
		case "int[]": {
			Integer[] ints = new Integer[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				ints[i] = Integer.parseInt(arrdata[i]);
			}
			return ints;
		}
		case "Integer[]": {
			Integer[] Ints = new Integer[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				Ints[i] = Integer.parseInt(arrdata[i]);
			}
			return Ints;
		}
		case "Double[]": {
			Double[] Doubs = new Double[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				Doubs[i] = Double.parseDouble(arrdata[i]);
			}
			return Doubs;

		}
		case "double[]": {
			Double[] doubs = new Double[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				doubs[i] = Double.parseDouble(arrdata[i]);
			}
			return doubs;
		}
		case "long[]": {
			Long[] Longs = new Long[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				Longs[i] = Long.parseLong(arrdata[i]);
			}
			return Longs;
		}
		case "Long[]": {
			Long[] Longs = new Long[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				Longs[i] = Long.parseLong(arrdata[i]);
			}
			return Longs;
		}
		case "float[]": {
			Float[] floats = new Float[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				floats[i] = Float.parseFloat(arrdata[i]);
			}
			return floats;
		}
		case "Float[]": {
			Float[] floats = new Float[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				floats[i] = Float.parseFloat(arrdata[i]);
			}
			return floats;
		}
		case "byte[]": {
			Byte[] bytes = new Byte[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				bytes[i] = Byte.parseByte(arrdata[i]);
			}
			return bytes;
		}
		case "Byte[]": {
			Byte[] bytes = new Byte[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				bytes[i] = Byte.parseByte(arrdata[i]);
			}
			return bytes;
		}
		case "boolean[]": {
			Boolean[] booleans = new Boolean[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				booleans[i] = Boolean.parseBoolean(arrdata[i]);
			}
			return booleans;
		}
		case "Boolean[]": {
			Boolean[] booleans = new Boolean[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				booleans[i] = Boolean.parseBoolean(arrdata[i]);
			}
			return booleans;
		}
		case "short[]": {
			Short[] short1 = new Short[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				short1[i] = Short.parseShort(arrdata[i]);
			}
			return short1;
		}
		case "Short[]": {
			Short[] short1 = new Short[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				short1[i] = Short.parseShort(arrdata[i]);
			}
			return short1;
		}
		case "Time[]": {
			Time[] short1 = new Time[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				short1[i] = Time.valueOf(arrdata[i]);
			}
			return short1;
		}
		case "Timestamp[]": {
			Timestamp[] short1 = new Timestamp[arrdata.length];
			for (int i = 0; i < arrdata.length; i++) {
				short1[i] = Timestamp.valueOf(arrdata[i]);
			}
			return short1;
		}
		default:
			return arrdata;
		}
	}

}
