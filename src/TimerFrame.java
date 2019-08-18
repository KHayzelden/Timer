
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerFrame extends javax.swing.JFrame {

    public TimerFrame() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        digitValue = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        showDigit = new javax.swing.JButton();
        addOne = new javax.swing.JButton();
        oneSecsDisplay = new javax.swing.JButton();
        showOneSecs = new javax.swing.JButton();
        oneSecs = new javax.swing.JTextField();
        tenSecsDisplay = new javax.swing.JButton();
        showTenSecs = new javax.swing.JButton();
        tenSecs = new javax.swing.JTextField();
        stop = new javax.swing.JButton();
        startTimer = new javax.swing.JButton();
        oneMinsDisplay = new javax.swing.JButton();
        showOneMins = new javax.swing.JButton();
        oneMins = new javax.swing.JTextField();
        tenMinsDisplay = new javax.swing.JButton();
        showTenMins = new javax.swing.JButton();
        tenMins = new javax.swing.JTextField();
        showTime = new javax.swing.JCheckBox();
        reset = new javax.swing.JButton();
        setStopTime = new javax.swing.JCheckBox();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        clicks = new javax.swing.JTextField();
        stopTimeOneSecs = new javax.swing.JTextField();
        stopTimeTenMins = new javax.swing.JTextField();
        stopTimeOneMins = new javax.swing.JTextField();
        stopTimeTenSecs = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Digital Timer");
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(153, 153, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        digitValue.setText("0");
        getContentPane().add(digitValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 70, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setText(" ");
        jTextField1.setPreferredSize(new java.awt.Dimension(100, 10));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 110, 10));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setText(" ");
        jTextField2.setPreferredSize(new java.awt.Dimension(15, 100));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 10, 100));

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setText("  ");
        jTextField3.setPreferredSize(new java.awt.Dimension(15, 100));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 10, -1));

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setText("  ");
        jTextField4.setPreferredSize(new java.awt.Dimension(100, 10));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 110, -1));

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setText("  ");
        jTextField5.setPreferredSize(new java.awt.Dimension(15, 100));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 10, -1));

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setText("  ");
        jTextField6.setPreferredSize(new java.awt.Dimension(15, 100));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 10, -1));

        jTextField7.setBackground(new java.awt.Color(0, 0, 0));
        jTextField7.setText("  ");
        jTextField7.setPreferredSize(new java.awt.Dimension(100, 10));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 110, -1));

        showDigit.setText("Show Digit");
        showDigit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDigitActionPerformed(evt);
            }
        });
        getContentPane().add(showDigit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        addOne.setText("Add One");
        addOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOneActionPerformed(evt);
            }
        });
        getContentPane().add(addOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        oneSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number0.png"))); // NOI18N
        getContentPane().add(oneSecsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 124, 243));

        showOneSecs.setText("Show Digit");
        showOneSecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showOneSecsActionPerformed(evt);
            }
        });
        getContentPane().add(showOneSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 100, -1));

        oneSecs.setText("0");
        getContentPane().add(oneSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 60, -1));

        tenSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number0.png"))); // NOI18N
        getContentPane().add(tenSecsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 124, 243));

        showTenSecs.setText("Show Digit");
        showTenSecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTenSecsActionPerformed(evt);
            }
        });
        getContentPane().add(showTenSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 100, -1));

        tenSecs.setText("0");
        getContentPane().add(tenSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 60, -1));

        stop.setText("Stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });
        getContentPane().add(stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        startTimer.setText("Start Timer");
        startTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimerActionPerformed(evt);
            }
        });
        getContentPane().add(startTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, -1));

        oneMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number0.png"))); // NOI18N
        getContentPane().add(oneMinsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 124, 243));

        showOneMins.setText("Show Digit");
        showOneMins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showOneMinsActionPerformed(evt);
            }
        });
        getContentPane().add(showOneMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 100, -1));

        oneMins.setText("0");
        getContentPane().add(oneMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 60, -1));

        tenMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number0.png"))); // NOI18N
        getContentPane().add(tenMinsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 124, 243));

        showTenMins.setText("Show Digit");
        showTenMins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTenMinsActionPerformed(evt);
            }
        });
        getContentPane().add(showTenMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 100, -1));

        tenMins.setText("0");
        getContentPane().add(tenMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 60, -1));

        showTime.setText("Show Actual Time");
        showTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTimeActionPerformed(evt);
            }
        });
        getContentPane().add(showTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        setStopTime.setText("Set Stop Time ->");
        setStopTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStopTimeActionPerformed(evt);
            }
        });
        getContentPane().add(setStopTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jTextField8.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 10, -1));

        jTextField9.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 10, -1));

        clicks.setText("0");
        getContentPane().add(clicks, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 20, -1));

        stopTimeOneSecs.setText("0");
        getContentPane().add(stopTimeOneSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 20, -1));

        stopTimeTenMins.setText("0");
        getContentPane().add(stopTimeTenMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 20, -1));

        stopTimeOneMins.setText("0");
        getContentPane().add(stopTimeOneMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 20, -1));

        stopTimeTenSecs.setText("0");
        getContentPane().add(stopTimeTenSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 20, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText(":");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showDigitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDigitActionPerformed

        int digit1 = Integer.parseInt(digitValue.getText());
        // reads in the value of digit value, converting it into an integer
        // then determined based on the value 0-9, what boxes should be visible
        if (digit1 == 0)
        {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(false);
        }

        if (digit1 == 1)
        {
            jTextField1.setVisible(false);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jTextField7.setVisible(false);
        }

        if (digit1 == 2)
        {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(false);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(false);
            jTextField7.setVisible(true);
        }

        if (digit1 == 3)
        {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jTextField7.setVisible(true);
        }

        if (digit1 == 4)
        {
            jTextField1.setVisible(false);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }

        if (digit1 == 5)
        {
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }

        if (digit1 == 6)
        {
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }

        if (digit1 == 7)
        {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jTextField7.setVisible(false);
        }

        if (digit1 == 8)
        {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }

        if (digit1 == 9)
        {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }

    }//GEN-LAST:event_showDigitActionPerformed

    private void addOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOneActionPerformed
        
        int digit1 = Integer.parseInt(digitValue.getText()); //reads in the value of digitValue as an integer
        
        if(showTime.isSelected() == false)
        {
            digit1 += 1 ; //adds one to digit value
            
            if (digit1 > 9) //checks if digit1 is greater than 9 and if so resets it back to 0 and adds one to the one secs
            {
                digit1 = 0 ;

                oneSecs.setText(Integer.toString(Integer.parseInt(oneSecs.getText())+1));
            }

            digitValue.setText(Integer.toString(digit1)); //updates the digit value to the new value

            if (Integer.parseInt(oneSecs.getText()) > 9) //checks if the value of one secs is greater than 9 and if so resets it to 0 and adds one to the ten secs
            {
                oneSecs.setText(Integer.toString(0));
                tenSecs.setText(Integer.toString(Integer.parseInt(tenSecs.getText())+1));
            }

            if (Integer.parseInt(tenSecs.getText()) > 5) //checks if the value of ten secs is greater than 5 and if so resets it to 0 and adds one to the one mins
            {
                tenSecs.setText(Integer.toString(0));
                oneMins.setText(Integer.toString(Integer.parseInt(oneMins.getText())+1));
            }

            if (Integer.parseInt(oneMins.getText()) > 9) //checks if the value of one mins is greater than 9 and if so resets it to 0 and adds one to the ten  mins
            {
                oneMins.setText(Integer.toString(0));
                tenMins.setText(Integer.toString(Integer.parseInt(tenMins.getText())+1));
            }

            if (setStopTime.isSelected()) //checks if the set stop time option is on, and if so sets the program to end at the inputted value
            {
                if (Integer.parseInt(tenMins.getText()) == Integer.parseInt(stopTimeTenMins.getText()) && 
                    Integer.parseInt(oneMins.getText()) == Integer.parseInt(stopTimeOneMins.getText()) &&
                    Integer.parseInt(tenSecs.getText()) == Integer.parseInt(stopTimeTenSecs.getText()) &&
                    Integer.parseInt(oneSecs.getText()) == Integer.parseInt(stopTimeOneSecs.getText()))
                {
                    this.dispose();
                    System.exit(0);
                }
            }
        }
        else 
        {   
            DateFormat minsFormat = new SimpleDateFormat("mm");
            DateFormat hoursFormat = new SimpleDateFormat("hh");
            Date time = new Date();

            oneSecs.setText(Integer.toString(Integer.parseInt(minsFormat.format(time)) % 10));
            tenSecs.setText(Integer.toString(( Integer.parseInt(minsFormat.format(time)) - Integer.parseInt(oneSecs.getText())) / 10 ));
            oneMins.setText(Integer.toString(Integer.parseInt(hoursFormat.format(time)) % 10));
            tenMins.setText(Integer.toString(( Integer.parseInt(hoursFormat.format(time)) - Integer.parseInt(oneMins.getText())) / 10 ));
        }

        showDigitActionPerformed(evt); //updates the display for the 1/10 sec digit
        showOneSecsActionPerformed(evt); //updates the display for one secs
        showTenSecsActionPerformed(evt); //updates the display for ten secs
        showOneMinsActionPerformed(evt); //updates the display for one mins
        showTenMinsActionPerformed(evt); //updates the display for ten mins
        
    }//GEN-LAST:event_addOneActionPerformed

    private void showOneSecsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showOneSecsActionPerformed
       
        int valueOneSecs = Integer.parseInt(oneSecs.getText());
        
        //checks the value of one secs then changes the one secs display to match
        
        if (valueOneSecs == 0)
        {
            oneSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number0.png")));
        }
        else if (valueOneSecs == 1)
        {
            oneSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number1.png")));
        }
        else if (valueOneSecs == 2)
        {
            oneSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number2.png")));
        }
        else if (valueOneSecs == 3)
        {
            oneSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number3.png")));
        }
        else if (valueOneSecs == 4)
        {
            oneSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number4.png")));
        }
        else if (valueOneSecs == 5)
        {
            oneSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number5.png")));
        }
        else if (valueOneSecs == 6)
        {
            oneSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number6.png")));
        }
        else if (valueOneSecs == 7)
        {
            oneSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number7.png")));
        }
        else if (valueOneSecs == 8)
        {
            oneSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number8.png")));
        }
        else if (valueOneSecs == 9)
        {
            oneSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number9.png")));
        }
            
        
        
    }//GEN-LAST:event_showOneSecsActionPerformed

    private void showTenSecsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTenSecsActionPerformed
        
        int valueTenSecs = Integer.parseInt(tenSecs.getText());
        
        //checks the value of ten secs then changes ten secs display to match the value
        
        if (valueTenSecs == 0) 
        {
            tenSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number0.png")));
        }
        else if (valueTenSecs == 1)
        {
            tenSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number1.png")));
        }
        else if (valueTenSecs == 2)
        {
            tenSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number2.png")));
        }
        else if (valueTenSecs == 3)
        {
            tenSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number3.png")));
        }
        else if (valueTenSecs == 4)
        {
            tenSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number4.png")));
        }
        else if (valueTenSecs == 5)
        {
            tenSecsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number5.png")));
        }
        
    }//GEN-LAST:event_showTenSecsActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        
        //on click closes the program
        
        this.dispose();
        System.exit(0);
        
    }//GEN-LAST:event_stopActionPerformed

    private void startTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimerActionPerformed
        
        //on click starts a timer that automatically presses the buttons
        
        javax.swing.Timer tm = new javax.swing.Timer(100, new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    addOneActionPerformed(evt); 
                }
            });
        
        tm.start(); 
        
//        int numberOfClicks = Integer.parseInt(clicks.getText());
//        
//        if (numberOfClicks == 0)
//        {
//            tm.start();
//            startTimer.setText("Pause Timer");
//        }
//        else if ((numberOfClicks%2) == 1)
//        {
//            tm.start();
//            startTimer.setText("Pause Timer");
//        }
//        else
//        {
//            tm.stop();
//            startTimer.setText("Start Timer");
//        }
//        
//        clicks.setText(Integer.toString(Integer.parseInt(clicks.getText())+1));
  
    }//GEN-LAST:event_startTimerActionPerformed

    private void showOneMinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showOneMinsActionPerformed
        
        int valueOneMins = Integer.parseInt(oneMins.getText());

        //checks the value of one mins then changes one mins display to match the value

        if (valueOneMins == 0)
        {
            oneMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number0.png")));
        }
        else if (valueOneMins == 1)
        {
            oneMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number1.png")));
        }
        else if (valueOneMins == 2)
        {
            oneMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number2.png")));
        }
        else if (valueOneMins == 3)
        {
            oneMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number3.png")));
        }
        else if (valueOneMins == 4)
        {
            oneMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number4.png")));
        }
        else if (valueOneMins == 5)
        {
            oneMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number5.png")));
        }
        else if (valueOneMins == 6)
        {
            oneMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number6.png")));
        }
        else if (valueOneMins == 7)
        {
            oneMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number7.png")));
        }
        else if (valueOneMins == 8)
        {
            oneMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number8.png")));
        }
        else if (valueOneMins == 9)
        {
            oneMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number9.png")));
        }
        
    }//GEN-LAST:event_showOneMinsActionPerformed

    private void showTenMinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTenMinsActionPerformed
        
        int valueTenMins = Integer.parseInt(tenMins.getText());

        //checks the value of one mins then changes one mins display to match the value

        if (valueTenMins == 0)
        {
            tenMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number0.png")));
        }
        else if (valueTenMins == 1)
        {
            tenMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number1.png")));
        }
        else if (valueTenMins == 2)
        {
            tenMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number2.png")));
        }
        else if (valueTenMins == 3)
        {
            tenMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number3.png")));
        }
        else if (valueTenMins == 4)
        {
            tenMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number4.png")));
        }
        else if (valueTenMins == 5)
        {
            tenMinsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/number5.png")));
        }

        
    }//GEN-LAST:event_showTenMinsActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        
        //resets all values to 0 and updates displays
        
        digitValue.setText("0");
        oneSecs.setText("0");
        tenSecs.setText("0");
        oneMins.setText("0");
        tenMins.setText("0");
       
        showDigitActionPerformed(evt); //updates the display for the 1/10 sec digit
        showOneSecsActionPerformed(evt); //updates the display for one secs
        showTenSecsActionPerformed(evt); //updates the display for ten secs
        showOneMinsActionPerformed(evt); //updates the display for one mins
        showTenMinsActionPerformed(evt); //updates the display for ten mins
        
    }//GEN-LAST:event_resetActionPerformed

    private void showTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTimeActionPerformed
       
        //code is in the add one button aswell so the time updates properly every minute when the timer is running, this code will show the
        // time only as of when the button is pressed, it will not update (hence the code in the add one) and will set the digit value to 0
        
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
        
        digitValue.setText("0");
        
        DateFormat minsFormat = new SimpleDateFormat("mm");
        DateFormat hoursFormat = new SimpleDateFormat("hh");
        Date time = new Date();
        
        oneSecs.setText(Integer.toString(Integer.parseInt(minsFormat.format(time)) % 10));
        tenSecs.setText(Integer.toString(( Integer.parseInt(minsFormat.format(time)) - Integer.parseInt(oneSecs.getText())) / 10 ));
        oneMins.setText(Integer.toString(Integer.parseInt(hoursFormat.format(time)) % 10));
        tenMins.setText(Integer.toString(( Integer.parseInt(hoursFormat.format(time)) - Integer.parseInt(oneMins.getText())) / 10 ));
   
        
        showDigitActionPerformed(evt); //updates the display for the 1/10 sec digit
        showOneSecsActionPerformed(evt); //updates the display for one secs
        showTenSecsActionPerformed(evt); //updates the display for ten secs
        showOneMinsActionPerformed(evt); //updates the display for one mins
        showTenMinsActionPerformed(evt); //updates the display for ten mins
        
    }//GEN-LAST:event_showTimeActionPerformed

    private void setStopTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setStopTimeActionPerformed
        
        //code is in the add one button, the check box is checked there
        
    }//GEN-LAST:event_setStopTimeActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOne;
    private javax.swing.JTextField clicks;
    private javax.swing.JTextField digitValue;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField oneMins;
    private javax.swing.JButton oneMinsDisplay;
    private javax.swing.JTextField oneSecs;
    private javax.swing.JButton oneSecsDisplay;
    private javax.swing.JButton reset;
    private javax.swing.JCheckBox setStopTime;
    private javax.swing.JButton showDigit;
    private javax.swing.JButton showOneMins;
    private javax.swing.JButton showOneSecs;
    private javax.swing.JButton showTenMins;
    private javax.swing.JButton showTenSecs;
    private javax.swing.JCheckBox showTime;
    private javax.swing.JButton startTimer;
    private javax.swing.JButton stop;
    private javax.swing.JTextField stopTimeOneMins;
    private javax.swing.JTextField stopTimeOneSecs;
    private javax.swing.JTextField stopTimeTenMins;
    private javax.swing.JTextField stopTimeTenSecs;
    private javax.swing.JTextField tenMins;
    private javax.swing.JButton tenMinsDisplay;
    private javax.swing.JTextField tenSecs;
    private javax.swing.JButton tenSecsDisplay;
    // End of variables declaration//GEN-END:variables
}
