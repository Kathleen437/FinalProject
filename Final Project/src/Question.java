

public class Question
	{
		String fact;
		String answer;

		public static void main(String[] args)
			{
			}
		
		public Question (String f, String a)
		{	
			fact = f;
			answer = a;
		}

		public String getFact()
			{
				return fact;
			}

		public void setFact(String fact)
			{
				this.fact = fact;
			}

		public String getAnswer()
			{
				return answer;
			}

		public void setAnswer(String answer)
			{
				this.answer = answer;
			}

	}