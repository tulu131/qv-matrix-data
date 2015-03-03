package com.myAssets.utils;

import org.apache.log4j.Logger;

public class LogFileUtil
{
	private static Logger log = Logger.getLogger("LogFileUtil");
	
	private LogFileUtil()
	{
		
	}
	
	public static LogFileUtil createInstance()
	{
		return new LogFileUtil();
	}
	
	//For Info Message
	public static void infoMsg(String message)
	{
		log.info(message);
	}
	
	public static void infoMsg(String message, Throwable th)
	{
		log.info(message, th);
	}
	
	public static void infoMsg(String message, Exception ex)
	{
		log.info(message, ex);
	}
	
	//For Warning Message
	public static void warnMsg(String message)
	{
		log.warn(message);
	}
	
	public static void warnMsg(String message, Throwable th)
	{
		log.warn(message, th);
	}
	
	public static void warnMsg(String message, Exception ex)
	{
		log.warn(message, ex);
	}
	
	//For Fatal Message
	public static void fatalMsg(String message)
	{
		log.fatal(message);
	}
	
	public static void fatalMsg(String message, Throwable th)
	{
		log.fatal(message, th);
	}
	
	public static void fatalMsg(String message, Exception ex)
	{
		log.fatal(message, ex);
	}
	
	//For Debug Message
	public static void debugMsg(String message)
	{
		log.debug(message);
	}
	
	public static void debugMsg(String message, Throwable th)
	{
		log.debug(message, th);
	}
	
	public static void debugMsg(String message, Exception ex)
	{
		log.debug(message, ex);
	}
	
	//For Trace Message
	public static void traceMsg(String message)
	{
		log.trace(message);
	}
	
	public static void traceMsg(String message, Throwable th)
	{
		log.trace(message, th);
	}
	
	public static void traceMsg(String message, Exception ex)
	{
		log.trace(message, ex);
	}
	
	//For Error Message
	public static void errorMsg(String message)
	{
		log.error(message);
	}
	
}
