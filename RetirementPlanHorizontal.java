

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Graphics;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
/*
 * Author:Shuang Wu
 * Last Revised:April 23RD 2014
 */

public class RetirementPlanHorizontal extends JPanel{//RetirementPlanHorizontal extends JPanel
	private JTextField txtcurrentprinciple;//creating those JTextFields as instance variables.
	private JTextField txtnowage;
	private JTextField txtdailysaving;
	private JTextField txtretirement;
	private JTextField txtretireincome;
	private JTextField txtlifeexpect;
	private JTextField txtinflation;
	private JTextField txtinterestreturn;
	private int livingyears=0;//those are created to store the value input in JTextFields above.
	private double yearsaving=0.0;
	private double retireincome=0.0;
	private int nowage=0;
	private int deathage=0;;
	private double retireage=0;;
	private double currentprinciple=0;
	private double rateinfla=0;
	private double ratereturn=0;
	private double retireincom=0;
	private double dailysaving=0;
	private double dailyrate=0.0;
	private double monthrate=0.0;
	private double max=0.0;
	private double min=0.0;
	private double end=0.0;
	private int maxindex=0;
	private String message="";

	public RetirementPlanHorizontal() {//constructor
	    //I used Absolute Layout which is basically setting the bounds for each thing.
	    //the bounds will be (X,Y,W,H) which is the x, y,width, height.
	    //I really don't like the system colors of JAVA so I created my own colors
		setBorder(new LineBorder(new Color(211, 211, 211), 4));//creating a line border
		setBackground(new Color(240, 255, 240));
		setLayout(null);
		
		JLabel title = new JLabel("Retirement Plan");
		title.setBounds(363, 30, 224, 33);
		title.setForeground(new Color(0, 139, 139));
		title.setFont(new Font("Lucida Bright", Font.BOLD, 27));//I also set the fonts size and style for different words
		add(title);
		
		JLabel CreatedBy = new JLabel("created by Shuang Wu, CSC 171");
		CreatedBy.setForeground(new Color(128, 128, 128));
		CreatedBy.setFont(new Font("Aparajita", Font.ITALIC, 15));
		CreatedBy.setBounds(778, 515, 162, 15);
		add(CreatedBy);
		
		JLabel currentprinciplelable = new JLabel("Current Principle($)");
		currentprinciplelable.setForeground(Color.LIGHT_GRAY);
		currentprinciplelable.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		currentprinciplelable.setBounds(30, 161, 125, 15);
		add(currentprinciplelable);
		
		JLabel labelcurrentage = new JLabel("Current Age");
		labelcurrentage.setForeground(new Color(192, 192, 192));
		labelcurrentage.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		labelcurrentage.setBounds(30, 108, 81, 15);
		add(labelcurrentage);
		
		JLabel labeldailysaving = new JLabel("Daily Amount of Savings($)");
		labeldailysaving.setForeground(new Color(102, 205, 170));
		labeldailysaving.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		labeldailysaving.setBounds(30, 186, 179, 15);
		add(labeldailysaving);
		
		JLabel labelage = new JLabel("Age of Retirement");
		labelage.setForeground(new Color(95, 158, 160));
		labelage.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		labelage.setBounds(30, 133, 125, 15);
		add(labelage);
		
		JLabel labelAnnualRetirementIncome = new JLabel("Annual Retirement Income($)");
		labelAnnualRetirementIncome.setForeground(new Color(102, 205, 170));
		labelAnnualRetirementIncome.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		labelAnnualRetirementIncome.setBounds(30, 286, 193, 15);
		add(labelAnnualRetirementIncome);
		
		JLabel labelLifeExpectancy = new JLabel("Life Expectancy");
		labelLifeExpectancy.setForeground(Color.LIGHT_GRAY);
		labelLifeExpectancy.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		labelLifeExpectancy.setBounds(30, 211, 105, 15);
		add(labelLifeExpectancy);
		
		JLabel lblEstimatedInterestRate = new JLabel("Estimated Interest rate \r\nof return on savings");
		lblEstimatedInterestRate.setForeground(Color.LIGHT_GRAY);
		lblEstimatedInterestRate.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		lblEstimatedInterestRate.setBounds(30, 261, 277, 15);
		add(lblEstimatedInterestRate);
		
		JLabel lblEstimatedRateOf = new JLabel("Estimated rate of Inflation");
		lblEstimatedRateOf.setForeground(new Color(95, 158, 160));
		lblEstimatedRateOf.setFont(new Font("Estrangelo Edessa", Font.PLAIN, 16));
		lblEstimatedRateOf.setBounds(30, 236, 162, 15);
		add(lblEstimatedRateOf);
		
		txtcurrentprinciple = new JTextField();
		txtcurrentprinciple.setForeground(new Color(0, 0, 0));
		txtcurrentprinciple.setBackground(Color.WHITE);
		txtcurrentprinciple.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtcurrentprinciple.setBounds(317, 156, 66, 21);
		add(txtcurrentprinciple);
		txtcurrentprinciple.setColumns(10);
		
		txtnowage = new JTextField();
		txtnowage.setForeground(new Color(0, 0, 0));
		txtnowage.setBackground(Color.WHITE);
		txtnowage.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtnowage.setBounds(317, 103, 66, 21);
		add(txtnowage);
		txtnowage.setColumns(10);
		
		txtdailysaving = new JTextField();
		txtdailysaving.setForeground(new Color(0, 0, 0));
		txtdailysaving.setBackground(Color.WHITE);
		txtdailysaving.setBounds(317, 182, 66, 21);
		add(txtdailysaving);
		txtdailysaving.setColumns(10);
		
		txtretirement = new JTextField();
		txtretirement.setBackground(Color.WHITE);
		txtretirement.setForeground(new Color(0, 0, 0));
		txtretirement.setBounds(317, 129, 66, 21);
		add(txtretirement);
		txtretirement.setColumns(10);
		
		txtretireincome = new JTextField();
		txtretireincome.setForeground(new Color(0, 0, 0));
		txtretireincome.setBackground(Color.WHITE);
		txtretireincome.setBounds(317, 282, 66, 21);
		add(txtretireincome);
		txtretireincome.setColumns(10);
		
		txtlifeexpect = new JTextField();
		txtlifeexpect.setForeground(new Color(0, 0, 0));
		txtlifeexpect.setBackground(Color.WHITE);
		txtlifeexpect.setBounds(317, 207, 66, 21);
		add(txtlifeexpect);
		txtlifeexpect.setColumns(10);
		
		txtinflation = new JTextField();
		txtinflation.setForeground(new Color(0, 0, 0));
		txtinflation.setBackground(Color.WHITE);
		txtinflation.setBounds(317, 232, 66, 21);
		add(txtinflation);
		txtinflation.setColumns(10);
		
		txtinterestreturn = new JTextField();
		txtinterestreturn.setForeground(new Color(0, 0, 0));
		txtinterestreturn.setBackground(Color.WHITE);
		txtinterestreturn.setBounds(317, 257, 66, 21);
		add(txtinterestreturn);
		txtinterestreturn.setColumns(10);
		
		JLabel lblAccumulatedSavingsBar = new JLabel("Accumulated Savings Bar Chart");
		lblAccumulatedSavingsBar.setForeground(new Color(192, 192, 192));
		lblAccumulatedSavingsBar.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 17));
		lblAccumulatedSavingsBar.setBounds(509, 73, 241, 30);
		add(lblAccumulatedSavingsBar);
		
		JButton btnDrawChart = new JButton("Draw the chart");//I created a JButton, the user has to press it to draw or redraw the graph
		btnDrawChart.addActionListener(new ActionListener() {//when I press the draw chart button--- those actions below will be done
			public void actionPerformed(ActionEvent e) {
				nowage=Integer.parseInt(txtnowage.getText());//get all the filled info in JTextfield
				deathage=Integer.parseInt(txtlifeexpect.getText());
				retireage=Integer.parseInt(txtretirement.getText());
				currentprinciple =Double.parseDouble(txtcurrentprinciple.getText());
				rateinfla=Double.parseDouble(txtinflation.getText());
				ratereturn=Double.parseDouble(txtinterestreturn.getText());
				retireincom=Double.parseDouble(txtretireincome.getText());
				dailysaving=Double.parseDouble(txtdailysaving.getText());
				dailyrate=ratereturn/365.0;//calculate the daily interest rate
				livingyears=deathage-nowage;//calculate the living years
				double dayspermonth=365.0/12.0;
				monthrate=Math.pow((1+dailyrate),dayspermonth)-1;//getting the monthly interest rate
				yearsaving=dailysaving*(Math.pow((1+dailyrate),365)-1)/dailyrate;//get the sum of daily savings in a year
				retireincome=(retireincom/12.0)*(Math.pow((1+monthrate), 12)-1)/monthrate;//get the sum of monthly retireincome in a year
				repaint();//call the paintcomponent method
	      
				JButton btnDetailedDataTable = new JButton("Detailed data table");
				//when the first button is pressed, this button will appear
				//when this button is pressed, a JOptionPane will pop out with all the detailed savings by years.
		btnDetailedDataTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JOptionPane.showMessageDialog(null,"Accumulated savings table\n\n"+ message);
			}
		});
		btnDetailedDataTable.setForeground(new Color(46, 139, 87));
		btnDetailedDataTable.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		btnDetailedDataTable.setBounds(247, 372, 136, 23);
		add(btnDetailedDataTable);
		//instructions
				JOptionPane.showMessageDialog(null,"Press the 'Detailed data table'button to see the detailed savings amount.\n\n"+
				"If you change any data,\n please press the draw graph button to see the changed graph.\n"+
				"And then press the table button to see the changed table.");
				}
		});
		btnDrawChart.setForeground(new Color(0, 128, 128));
		btnDrawChart.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnDrawChart.setBounds(249, 337, 134, 23);
		add(btnDrawChart);
		
		JLabel image = new JLabel("image");//import image and put on the bottom left corner
		image.setIcon(new ImageIcon("tumblr_minbh7OFwy1rl43djo1_500.png"));
		image.setBounds(-172, 346, 484, 242);
		add(image);
		
		JLabel image1 = new JLabel("image1");//import image and put on the top right corner
		image1.setIcon(new ImageIcon("tumblr_minbh7OFwy1rl43djo1_500.png"));
		image1.setBounds(631, -142, 345, 285);
		add(image1);
		
		
		JLabel lblFirstPleaseFill = new JLabel("First, please fill in some information.");
		lblFirstPleaseFill.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblFirstPleaseFill.setForeground(new Color(0, 140, 140));
		lblFirstPleaseFill.setBounds(30, 85, 256, 15);
		add(lblFirstPleaseFill);
		
		
		
	}
	public void paintComponent(Graphics g) {
	    max=0;//have to reset max every time because otherwise the max might not change if the user changed info
	    super.paintComponent(g);
	    g.drawLine(400, 140, 400, 480);//draw the y axes
	    g.drawLine(400, 310, 900, 310);//draw the x axes
	    g.drawString("Y=Accum Savings($)", 395, 135);//label the Y axes
	    g.drawString("X=Age(yrs)", 905, 310);//label the X axes
	    int index=livingyears+1;
	    double[] array=new double[index];//creating a double array filled with the accumulated savings
	    array[0]=currentprinciple;//the index 0 of the array is the current principle
	    int yearsuntilretire=(int)retireage-(int)nowage;//get the number of years between now and retirement
	    for(int i=1;i<=livingyears;i++)
	    {
	    	if(i<=yearsuntilretire)//before retire
	    	{
	    	    double beforeretire=array[i-1]*Math.pow((1+dailyrate),365)+yearsaving;//without the inflation
	    	    double beforeretireinflation=beforeretire/(rateinfla+1);//include the inflation.
	    	    array[i]=beforeretireinflation;//set the next index into the result of the previous one
	    	}
	    	else//after retire
	    	{
	    	    double afterretire=array[i-1]*Math.pow((1+dailyrate),365)-retireincome;//without the inflation
	    	    double afterretireinflation=afterretire/(rateinfla+1);//with the inflation
	    	    array[i]=afterretireinflation;
	    	}
	    	max=Math.max(max,array[i]);//get the maximum amount in the array
	    	min=max;
	    	min=Math.min(min,array[i]);//get the minimum of the array
	    	end=array[livingyears];//the last index of the array will be the ending saving amount
	    }
	    message="";//set the message to "" so the previous ones don't cumulate
	    for(int i=1;i<=livingyears;i++)
	    {
	        message=message+String.format("Year %d:    %.2f dollars\n",i,array[i]);//adding the year and the saving amount to the message
	       }   
	    int startingx=400;//the starting x of the x axes label
	    int startingage=nowage;//start with the current age
	    double space=500.0/livingyears;//dividing the x axes into equal pieces
	    for(int j=1;j<=livingyears;j++)
	    {
	    	 double height=0;
		    if(max>Math.abs(min))
		    	//when min is negative, and max is larger than absolute value of min, then scale the graph by max.
		    	{
		    	height=array[j]/max*170.0;
		    	}
		    else if(max<Math.abs(min))
		    	//when min is negative, and max is smaller than absolute value of min, then scale the graph by min.
		    	{
		    		height=array[j]/Math.abs(min)*170.0;}
	    	if(height>0)
	    	//when the savings are positive, draw the filled rectangle bars with outlines.
	    		{
	    		g.setColor(new Color(145, 240, 145));
	    		g.fillRect((int)(400+(j-1)*space), (int)(310-height), (int)space, (int)height);
	    		g.setColor(Color.WHITE);
	    		g.drawRect((int)(400+(j-1)*space), (int)(310-height), (int)space, (int)height);
	    	}
	    	else if(height<0)
	    	//when the savings are negative, draw the filled rectangle bars with outlines.
	    	{
	    		g.setColor(new Color(220,112,147));
	    		g.fillRect((int)(400+(j-1)*space), 310, (int)space, (int)(-1*height));
	    		g.setColor(Color.DARK_GRAY);
	    		g.drawRect((int)(400+(j-1)*space), 310, (int)space, (int)(-1*height));
	    	}
	    }
	    for(int j=1;j<=livingyears;j++)//label the amount of savings and lavel the y-axes
		       { 
	    	    double height=0;
		    	if(max>Math.abs(min))
		    	//when min is negative, and max is larger than absolute value of min, then scale the graph by max.
		    	{
		    	 height=array[j]/max*170.0;
		    	}
		    	else if(max<Math.abs(min))
		    	//when min is negative, and max is smaller than absolute value of min, then scale the graph by min.
		    	{
		    		height=array[j]/Math.abs(min)*170.0;
		        }
		        if(array[j]==max)
		     
		    		{
		    		    String shorten=String.format("%.2f",array[j]);
		    			g.drawString("max="+shorten+"",(int)(400+(j-1)*space-5),(int)(310-height));
		    			//mark the max
		    		}
		        if(array[j]==end&&height<0)
		    		{
		    		    String shorten=String.format("%.2f",array[j]);
		    			g.drawString("end="+shorten+"", (int)(400+(j-1)*space-10), (int)(320-height));	
		    			//mark the min while the min is negative
		    		}
		        if(array[j]==end&&height>0)
		        {
		                String shorten=String.format("%.2f",array[j]);
		    			g.drawString("end="+shorten+"",(int)(400+(j-1)*space-5),(int)(310-height));
		            //mark the min while the min is positive
		          }
		    	if(height>0)//if the height of the bars are positive(the positive saving)
		    		{g.setColor(Color.GRAY);
		    		g.drawLine(395, (int)(310-height), 400, (int)(310-height));//draw the marks on y axes.
		        }
		    	else if(height<0)//if the height of bars are negative(the negative savings).
		    	{
		    		g.setColor(Color.DARK_GRAY);
		    		g.drawLine(395, (int)(310-height), 400, (int)(310-height));//draw marks on y axes
		    	}
		    }
	   	while(startingx<=900&&startingage<=deathage)//label the x axes
		    {
		    	String I=Integer.toString(startingage);
	    		g.drawString(I, startingx, 320);
	    		startingx+=space;
	    		startingage++;
	   	    }
}
}
