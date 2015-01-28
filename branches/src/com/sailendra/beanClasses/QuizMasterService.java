package com.sailendra.beanClasses;

public class QuizMasterService
{
//	private QuizMaster quizMaster = new SpringQuizMaster();
//	
//	public void askQuestion()
//	{
//		System.out.println(quizMaster.popQuestion());
//	}
	QuizMaster quizMaster;
	
	public void setQuizMaster(QuizMaster quizMaster)
	{
		this.quizMaster = quizMaster;
	}
	
	public void askQuestion()
	{
		System.out.println("Are you a Spring Developer??");
	}
}
