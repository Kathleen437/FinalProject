
import java.awt.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DS extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static JFrame frame = new JFrame();
	
		private static ArrayList<Question> Q = new ArrayList<Question>();

		public static void main(String[] args)
			{
				intro();
				setQuestions();
				explain();
				
				
				exit();
				

			}
		static void setQuestions()
		{
			Q.add(new Question("Saudi Arabia imports camels from Australia.", "True"));
			Q.add(new Question("The closest state to Africa is Florida.", "False"));
			Q.add(new Question("When you get a kidney transplant, they leave both your original kidneys.", "True"));
			Q.add(new Question("The lines that separate lanes on the highways are 2 feet long.", "False"));
			Q.add(new Question("North Korea and Finland are separated by one country", "True"));
			Q.add(new Question("The continent with the highest average education level is Antarctica", "True"));
			Q.add(new Question("It rains diamonds on Saturn", "True"));
			Q.add(new Question("In Australia you get a $200 fine if you touch an electrified wire that causes instant death.", "True"));
			Q.add(new Question("The founder of match.com lost his girlfriend to a man she met on match.com.", "True"));
			Q.add(new Question("The sticker on fruit is poisonous", "False"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			Q.add(new Question("Q", "A"));
			
		}
		
		public static void intro()
		{
			JOptionPane.showMessageDialog(frame, "You are going to take a journey.");
		}
		
		public static void explain()
		{
			JOptionPane.showMessageDialog(null, "<html>There are 3 episodes 10 questions each. <br> "
					+ "At the end of each round you will recieve a score,<br> "
					+ "if you get 7 or more out of the 10 correct you move onto the next episode.<br> "
					+ "if you get less than 7 then you must repeat the episode until you recieve a 7 or above. <html>");
			Object [] mood = {"Yes", "Explain again"};
			int greenLight = JOptionPane.showOptionDialog(frame, "Are you ready to begin?",
			"Message",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			mood,
			mood);
			while(greenLight == 1)
				{
					explain();
				}
			if(greenLight == 0)
				{
					episode3();
				}
			
			
			}
		public static void exit()
		{
			JOptionPane.showMessageDialog(frame, "Your program ends early.");
		}
		
		static void episode1()
		{
			
		}
		static void episode3()
		{
			int counter=0;
		
			Object [] E3Q1= {"True", "False"};
			int answerE1Q1 = JOptionPane.showOptionDialog(frame, Q.get(0).getFact(),
			"Question 1",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			E3Q1,
			E3Q1);
			if(answerE3Q1== Q.get(0).getAnswer()))
				{
					counter++;
				}
			else if(!E3Q1.equals(Q.get(0).getAnswer()))
				{
					JOptionPane.showMessageDialog(frame, "Wrong.");
				}
			
			Object [] E3Q2= {"True", "False"};
			int answerE3Q2 = JOptionPane.showOptionDialog(frame, Q.get(1).getFact(),
			"Question 2",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			E3Q2,
			E3Q2);
			if(E3Q2.equals(Q.get(1).getAnswer()))
				{
					counter++;
				}
			if(!E3Q2.equals(Q.get(1).getAnswer()))
				{
					JOptionPane.showMessageDialog(frame, "Wrong.");
				}
			Object [] E3Q3= {"True", "False"};
			int answerE3Q3 = JOptionPane.showOptionDialog(frame, Q.get(2).getFact(),
			"Question 3",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			E3Q3,
			E3Q3);
			if(E3Q3.equals(Q.get(2).getAnswer()))
				{
					counter++;
				}
			if(!E3Q3.equals(Q.get(2).getAnswer()))
				{
					JOptionPane.showMessageDialog(frame, "Wrong.");
				}
			Object [] E3Q4= {"True", "False"};
			int answerE3Q4 = JOptionPane.showOptionDialog(frame, Q.get(3).getFact(),
			"Question 4",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			E3Q4,
			E3Q4);
			if(E3Q4.equals(Q.get(3).getAnswer()))
				{
					counter++;
				}
			if(!E3Q4.equals(Q.get(3).getAnswer()))
				{
					JOptionPane.showMessageDialog(frame, "Wrong.");
				}
			Object [] E3Q5= {"True", "False"};
			int answerE3Q5 = JOptionPane.showOptionDialog(frame, Q.get(4).getFact(),
			"Question 1",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			E3Q5,
			E3Q5);
			if(E3Q5.equals(Q.get(4).getAnswer()))
				{
					counter++;
				}
			if(!E3Q5.equals(Q.get(4).getAnswer()))
				{
					JOptionPane.showMessageDialog(frame, "Wrong.");
				}
			Object [] E3Q6= {"True", "False"};
			int answerE3Q6 = JOptionPane.showOptionDialog(frame, Q.get(5).getFact(),
			"Question 1",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			E3Q6,
			E3Q6);
			if(E3Q6.equals(Q.get(5).getAnswer()))
				{
					counter++;
				}
			if(!E3Q6.equals(Q.get(5).getAnswer()))
				{
					JOptionPane.showMessageDialog(frame, "Wrong.");
				}
			Object [] E3Q7= {"True", "False"};
			int answerE3Q7 = JOptionPane.showOptionDialog(frame, Q.get(6).getFact(),
			"Question 1",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			E3Q7,
			E3Q7);
			if(E3Q7.equals(Q.get(6).getAnswer()))
				{
					counter++;
				}
			if(!E3Q7.equals(Q.get(6).getAnswer()))
				{
					JOptionPane.showMessageDialog(frame, "Wrong.");
				}
			Object [] E3Q8= {"True", "False"};
			int answerE3Q8 = JOptionPane.showOptionDialog(frame, Q.get(7).getFact(),
			"Question 1",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			E3Q8,
			E3Q8);
			if(E3Q1.equals(Q.get(7).getAnswer()))
				{
					counter++;
				}
			if(!E3Q1.equals(Q.get(7).getAnswer()))
				{
					JOptionPane.showMessageDialog(frame, "Wrong.");
				}
			Object [] E3Q9= {"True", "False"};
			int answerE3Q9 = JOptionPane.showOptionDialog(frame, Q.get(8).getFact(),
			"Question 1",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			E3Q9,
			E3Q9);
			if(E3Q9.equals(Q.get(8).getAnswer()))
				{
					counter++;
				}
			if(!E3Q9.equals(Q.get(8).getAnswer()))
				{
					JOptionPane.showMessageDialog(frame, "Wrong.");
				}
			Object [] E3Q10= {"True", "False"};
			int answerE3Q10 = JOptionPane.showOptionDialog(frame, Q.get(9).getFact(),
			"Question 1",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			E3Q10,
			E3Q10);
			if(E3Q10.equals(Q.get(9).getAnswer()))
				{
					counter++;
				}
			if(!E3Q10.equals(Q.get(9).getAnswer()))
				{
					JOptionPane.showMessageDialog(frame, "Wrong.");
				}
			
		}

	}
