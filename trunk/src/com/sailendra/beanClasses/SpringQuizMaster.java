package com.sailendra.beanClasses;

/**
 * @author Sailendra.Jena
 *
 */
public class SpringQuizMaster implements QuizMaster
{
	@Override
	public String popQuestion()
	{
		return "Are you a Spring Developer??";
	}
}
