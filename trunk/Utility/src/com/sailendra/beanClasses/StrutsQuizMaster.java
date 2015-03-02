package com.sailendra.beanClasses;

/**
 * @author Sailendra.Jena
 *
 */
public class StrutsQuizMaster implements QuizMaster
{

	@Override
	public String popQuestion()
	{
		return "Are you a Struts Developer??";
	}

}
