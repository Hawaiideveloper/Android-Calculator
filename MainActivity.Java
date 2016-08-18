package com.coreymalbright.mycalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

//Additional imports
import android.view.View;  //Whenever you need to use widgets
import android.widget.Button; //Using Buttons
import android.widget.TextView; //Using Numbers view


public class MainActivity extends AppCompatActivity {

    public String sign = "";  //This method has to return a String at some point,
    // otherwise you will receive an error (StackTrace will be asked for) " 8:26
    public String total = "";
    public Double tempDouble, tempDouble2;  //holds the first number, and the second number after the sign is pushed


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 //Buttons 1 - 0
        Button button1 = (Button)findViewById(R.id.button1);
//reference our buttons  using findViewById(int) to retrieve the widgets in that UI that you need to interact with programmatically
        Button button2 = (Button)findViewById(R.id.button2); //reference our buttons
        Button button3 = (Button)findViewById(R.id.button3); //reference our buttons
        Button button4 = (Button)findViewById(R.id.button4); //reference our buttons
        Button button5 = (Button)findViewById(R.id.button5); //reference our buttons
        Button button6 = (Button)findViewById(R.id.button6); //reference our buttons
        Button button7 = (Button)findViewById(R.id.button7); //reference our buttons
        Button button8 = (Button)findViewById(R.id.button8); //reference our buttons
        Button button9 = (Button)findViewById(R.id.button9); //reference our buttons
        Button button10 = (Button)findViewById(R.id.button10); //reference our buttons


//Clear and Close Buttons
        Button button11 = (Button)findViewById(R.id.button11); //reference our buttons
        Button button12 = (Button)findViewById(R.id.button12); //reference our buttons

//operators (add, subtract, multiply, and divide)
        Button button13 = (Button)findViewById(R.id.button13); //reference our buttons
        Button button14 = (Button)findViewById(R.id.button14); //reference our buttons
        Button button15 = (Button)findViewById(R.id.button15); //reference our buttons
        Button button16 = (Button)findViewById(R.id.button16); //reference our buttons

//equals
        Button button17 = (Button)findViewById(R.id.button17); //reference our buttons

// Button 1 event handler  "the one button"
        button1.setOnClickListener( //this makes it listen to the click for it to open
                //Button 1 Interface
                new Button.OnClickListener() //It is basically a passive data structure holding an abstract description of an action to be performed.
                {
                    //button 1 call back method
                    public void onClick(View v)  //The view that was click (A button, A TextView, etc.)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);  //using findViewById(int) to retrieve the widgets in that UI that you need to interact with programmatically.
                        output.append("1");

                    }
                }
        );
// Button 2 event handler
        button2.setOnClickListener(
                //Button 2 Interface
                new Button.OnClickListener()
                {
                    //button 1 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("2");

                    }
                }
        );


// Button 3 event handler
        button3.setOnClickListener(
                //Button 3 Interface
                new Button.OnClickListener()
                {
                    //button 3 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("3");

                    }
                }
        );

        // Button 4 event handler
        button4.setOnClickListener(
                //Button 4 Interface
                new Button.OnClickListener()
                {
                    //button 4 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("4");

                    }
                }
        );


// Button 5 event handler
        button5.setOnClickListener(
                //Button 1 Interface
                new Button.OnClickListener()
                {
                    //button 5 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("5");

                    }
                }
        );


// Button 6 event handler
        button6.setOnClickListener(
                //Button 6 Interface
                new Button.OnClickListener()
                {
                    //button 6 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("6");

                    }
                }
        );

        // Button 7 event handler
        button7.setOnClickListener(
                //Button 7 Interface
                new Button.OnClickListener()
                {
                    //button 7 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("7");

                    }
                }
        );


// Button 8 event handler
        button8.setOnClickListener(
                //Button 8 Interface
                new Button.OnClickListener()
                {
                    //button 8 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("8");

                    }
                }
        );

// Button 9 event handler
        button9.setOnClickListener(
                //Button 9 Interface
                new Button.OnClickListener()
                {
                    //button 9 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("9");

                    }
                }
        );


// Button 10 "the zero button"  event handler
        button10.setOnClickListener(
                //Button 10 Interface
                new Button.OnClickListener()
                {
                    //button 10 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("0");

                    }
                }
        );


// Button 11 "the clear button"  event handler
        button11.setOnClickListener(
                //Button 11 Interface
                new Button.OnClickListener()
                {
                    //button 11 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.setText("");  //used to turn everything null and not appending anymore

                    }
                }
        );



        // Button 13 "the (+) add button"  event handler
        button13.setOnClickListener(
                //Button 13 Interface
                new Button.OnClickListener()
                {
                    //button 13 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString()); //we need to change to a string first and store
                        //it before we add the second number

                        output.setText("");  //used to turn everything null and not appending anymore
                        sign = "+";

                    }
                }
        );


        // Button 14 "the (-) subtract button"  event handler
        button14.setOnClickListener(
                //Button 14 Interface
                new Button.OnClickListener()
                {
                    //button 14 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString()); //we need to change to a string first

                        output.setText("");  //used to turn everything null and not appending anymore
                        sign = "-";

                    }
                }
        );




        // Button 15 "the (/) divide button"  event handler
        button15.setOnClickListener(
                //Button 15 Interface
                new Button.OnClickListener()
                {
                    //button 15 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString()); //we need to change to a string first

                        output.setText("");  //used to turn everything null and not appending anymore
                        sign = "/";

                    }
                }
        );

// Button 16 "the (*) multiply button"  event handler
        button16.setOnClickListener(
                //Button 16 Interface
                new Button.OnClickListener()
                {
                    //button 16 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString()); //we need to change to a string first

                        output.setText("");  //used to turn everything null and not appending anymore
                        sign = "*";

                    }
                }
        );


// Button 17 "the (=) = button"  event handler 12:59
        button17.setOnClickListener(
                //Button 17 Interface
                new Button.OnClickListener()
                {
                    //button 17 call back method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);  //whatever is in the text box will
                        //now become the tempDouble2 this is known as casting
                        tempDouble2 = Double.parseDouble(output.getText().toString()); //we need to change to a string first



//The Logic operators for conditions are below
                        if (sign == "+")
                        {
                            output.setText(Double.toString(tempDouble + tempDouble2));
                        }
                         else if (sign == "-")
                        {
                            output.setText(Double.toString(tempDouble - tempDouble2));
                        }
                         else if (sign == "*")
                        {
                            output.setText(Double.toString(tempDouble * tempDouble2));
                        }


               //divide requires some logic to be thought out 11:55
                        else if (sign == "/")
                        {
                            if (tempDouble2 == 0)
                            {
                                //Cannot Divide here
                                output.setText("Can not divide by Zero!!!!! ");
                            }
                             else
                            {
                                output.setText(Double.toString(tempDouble / tempDouble2));  //takes tempDouble and divides
                                //by the tempDouble2 and then turns it into a string and
                                //makes it into the output text
                            }
                        }
                        //Reset The Sign Variable
                        sign = "";
                    }
                }
        );  //This is a paraenthsis not a curly bracket




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
