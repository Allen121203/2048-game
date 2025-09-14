package sample2048game;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.KeyEvent;

public class sample2048gui extends java.awt.Frame {


    public sample2048gui() {
        initComponents();
        sam=new Sample2048game();
    }

    Sample2048game sam;



    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panel1 = new java.awt.Panel();
        b00 = new java.awt.Label();
        b01 = new java.awt.Label();
        b02 = new java.awt.Label();
        b03 = new java.awt.Label();
        b10 = new java.awt.Label();
        b11 = new java.awt.Label();
        b12 = new java.awt.Label();
        b13 = new java.awt.Label();
        b20 = new java.awt.Label();
        b21 = new java.awt.Label();
        b22 = new java.awt.Label();
        b23 = new java.awt.Label();
        b30 = new java.awt.Label();
        b31 = new java.awt.Label();
        b32 = new java.awt.Label();
        b33 = new java.awt.Label();
        label17 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        button2 = new java.awt.Button();
        label2 = new java.awt.Label();
        highestl = new java.awt.Label();
        bestl = new java.awt.Label();
        button3 = new java.awt.Button();
        label3 = new java.awt.Label();
        highest = new java.awt.Label();
        label5 = new java.awt.Label();
        scorel = new java.awt.Label();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(107, 48, 116));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(114, 104, 166));
        panel1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panel1KeyPressed(evt);
            }
        });

        b00.setAlignment(java.awt.Label.CENTER);
        b00.setBackground(new java.awt.Color(255, 255, 255));
        b00.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b01.setAlignment(java.awt.Label.CENTER);
        b01.setBackground(new java.awt.Color(255, 255, 255));
        b01.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b02.setAlignment(java.awt.Label.CENTER);
        b02.setBackground(new java.awt.Color(255, 255, 255));
        b02.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b03.setAlignment(java.awt.Label.CENTER);
        b03.setBackground(new java.awt.Color(255, 255, 255));
        b03.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b10.setAlignment(java.awt.Label.CENTER);
        b10.setBackground(new java.awt.Color(255, 255, 255));
        b10.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b11.setAlignment(java.awt.Label.CENTER);
        b11.setBackground(new java.awt.Color(255, 255, 255));
        b11.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b12.setAlignment(java.awt.Label.CENTER);
        b12.setBackground(new java.awt.Color(255, 255, 255));
        b12.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b13.setAlignment(java.awt.Label.CENTER);
        b13.setBackground(new java.awt.Color(255, 255, 255));
        b13.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b20.setAlignment(java.awt.Label.CENTER);
        b20.setBackground(new java.awt.Color(255, 255, 255));
        b20.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b21.setAlignment(java.awt.Label.CENTER);
        b21.setBackground(new java.awt.Color(255, 255, 255));
        b21.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b22.setAlignment(java.awt.Label.CENTER);
        b22.setBackground(new java.awt.Color(255, 255, 255));
        b22.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b23.setAlignment(java.awt.Label.CENTER);
        b23.setBackground(new java.awt.Color(255, 255, 255));
        b23.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b30.setAlignment(java.awt.Label.CENTER);
        b30.setBackground(new java.awt.Color(255, 255, 255));
        b30.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b31.setAlignment(java.awt.Label.CENTER);
        b31.setBackground(new java.awt.Color(255, 255, 255));
        b31.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b32.setAlignment(java.awt.Label.CENTER);
        b32.setBackground(new java.awt.Color(255, 255, 255));
        b32.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b33.setAlignment(java.awt.Label.CENTER);
        b33.setBackground(new java.awt.Color(255, 255, 255));
        b33.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b03, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(b30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b03, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label17.setAlignment(java.awt.Label.CENTER);
        label17.setBackground(new java.awt.Color(114, 104, 172));
        label17.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        label17.setForeground(new java.awt.Color(153, 51, 0));
        label17.setText("2048!");

        textField1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField1KeyPressed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(134, 163, 195));
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setLabel("Exit");
        button2.addActionListener(this::button2ActionPerformed);

        label2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        label2.setText("Best");

        highestl.setAlignment(java.awt.Label.CENTER);
        highestl.setBackground(new java.awt.Color(0, 0, 0));
        highestl.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        highestl.setForeground(new java.awt.Color(153, 153, 0));
        highestl.setText("0");

        bestl.setAlignment(java.awt.Label.CENTER);
        bestl.setBackground(new java.awt.Color(0, 0, 0));
        bestl.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        bestl.setForeground(new java.awt.Color(153, 153, 0));
        bestl.setText("0");

        button3.setActionCommand("Start New Game");
        button3.setBackground(new java.awt.Color(134, 163, 195));
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setLabel("Start New Game");
        button3.addActionListener(this::button3ActionPerformed);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(107, 48, 116));
        label3.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(216, 224, 189));
        label3.setText("TRY TO REACH");

        highest.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        highest.setText("Highest Cell");

        label5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        label5.setText("Score");

        scorel.setAlignment(java.awt.Label.CENTER);
        scorel.setBackground(new java.awt.Color(0, 0, 0));
        scorel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        scorel.setForeground(new java.awt.Color(153, 153, 0));
        scorel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(highest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(highestl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bestl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(scorel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(179, 179, 179))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 81, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bestl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scorel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(highest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highestl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jButton1))
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        label17.getAccessibleContext().setAccessibleName("\n2048!"); // NOI18N
        button3.getAccessibleContext().setAccessibleName("Start New Game");
        highest.getAccessibleContext().setAccessibleName("Highest\n");

        pack();
    }// </editor-fold>                        


    
    
    
 public void update(int score, int best, int highest, int[][] board) {
    // Update the game board labels
    updateLabel(b00, board[0][0]);
    updateLabel(b01, board[0][1]);
    updateLabel(b02, board[0][2]);
    updateLabel(b03, board[0][3]);

    updateLabel(b10, board[1][0]);
    updateLabel(b11, board[1][1]);
    updateLabel(b12, board[1][2]);
    updateLabel(b13, board[1][3]);

    updateLabel(b20, board[2][0]);
    updateLabel(b21, board[2][1]);
    updateLabel(b22, board[2][2]);
    updateLabel(b23, board[2][3]);

    updateLabel(b30, board[3][0]);
    updateLabel(b31, board[3][1]);
    updateLabel(b32, board[3][2]);
    updateLabel(b33, board[3][3]);

    // Check if the current game board contains the best and highest values
    if (boardContainsValue(board, 2048)) {
        win();
    }

    // Update scores
    highestl.setText(String.valueOf(highest));
    bestl.setText(String.valueOf(best));
    scorel.setText(String.valueOf(score));
}

public boolean boardContainsValue(int[][] board, int value) {
    for (int[] row : board) {
        for (int cellValue : row) {
            if (cellValue == value) {
                return true;
            }
        }
    }
    return false;
}
private void updateLabel(java.awt.Label label, int value) {
    label.setText(value == 0 ? "" : String.valueOf(value));
    setColor(label, value);
}    
    public void setColor(Label l,int value)
    {
        l.setText(value+"");
        l.setFont(new java.awt.Font("Arial", 1, 60));
        
        
        switch (value) {
            case 0:
                l.setText("");
                l.setBackground(Color.white);
                break;
            case 2:
                l.setBackground(new java.awt.Color(252, 244, 221));
                break;
            case 4:
                l.setBackground(new java.awt.Color(255, 200, 162));
                break;
            case 8:
                l.setBackground(new java.awt.Color(212, 240, 240));
                break;
            case 16:
                l.setBackground(new java.awt.Color(255, 255, 181));
                break;
            case 32:
                l.setBackground(new java.awt.Color(243, 176, 195));
                break;
            case 64:
                l.setBackground(new java.awt.Color(252, 185, 170));
                break;
            case 128:
                l.setBackground(new java.awt.Color(142, 202, 202));
                break;
            case 256:
                l.setBackground(new java.awt.Color(203, 170, 203));
                break;
            case 512:
                l.setBackground(new java.awt.Color(85, 203, 205));
                break;
            case 1024:
                l.setBackground(new java.awt.Color(255, 204, 182));
                break;
            case 2048:
                l.setBackground(Color.yellow);
                break;
            default:
                break;
        }
        
        if(value>64)
            l.setFont(new java.awt.Font("Arial", 1, 45));
        if(value>512)
            l.setFont(new java.awt.Font("Arial", 1, 30));
                
    }
    
    
    

    private void exitForm(java.awt.event.WindowEvent evt) {                          
        System.exit(0);
    }                         

    private void panel1KeyPressed(java.awt.event.KeyEvent evt) {                                  
        
    }                                 

    private void textField1KeyPressed(java.awt.event.KeyEvent evt) {                                      
    int choice = evt.getKeyCode();
    System.out.println("This key is pressed: " + KeyEvent.getKeyText(choice));
    boolean go;
    switch (choice) {
        case java.awt.event.KeyEvent.VK_UP:
        case java.awt.event.KeyEvent.VK_DOWN:
        case java.awt.event.KeyEvent.VK_LEFT:
        case java.awt.event.KeyEvent.VK_RIGHT:
            sam.slide(getDirection(choice));
            sam.adding(getDirection(choice));
            sam.slide(getDirection(choice));
            go = sam.random();
            if (go) {
                update(sam.score, sam.best, sam.highest, sam.getBoard());
            } 
            else {
                gameOver();
            }
            break;
    }
}

private String getDirection(int keyCode) {
    switch (keyCode) {
        case java.awt.event.KeyEvent.VK_UP:
            return "up";
        case java.awt.event.KeyEvent.VK_DOWN:
            return "down";
        case java.awt.event.KeyEvent.VK_LEFT:
            return "left";
        case java.awt.event.KeyEvent.VK_RIGHT:
            return "right";
        default:
            return "";
    }
}


    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        System.exit(0);
    }                                       
    
    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        startNewGame();
    }                                       
     public void startNewGame() {
    // Clear the game over labels
    b10.setText("");
    b11.setText("");
    b12.setText("");
    b13.setText("");

    b20.setText("");
    b21.setText("");
    b22.setText("");
    b23.setText("");

    // Reset the game state
    sam.resetGame();

    // Update the display
    update(sam.score, sam.best, sam.highest, sam.getBoard());

    // Make sure the text field is focusable
    textField1.setFocusable(true);
    textField1.requestFocusInWindow();
}
    
    
     void gameOver()
        {
            b10.setText('G'+"");
            b11.setText('A'+"");
            b12.setText('M'+"");
            b13.setText('E'+"");
            
            b20.setText('O'+"");
            b21.setText('V'+"");
            b22.setText('E'+"");
            b23.setText('R'+"");
            
            b00.setText("");
            b01.setText("");
            b02.setText("");
            b03.setText("");
            b30.setText("");
            b31.setText("");
            b32.setText("");
            b33.setText("");
            
            textField1.setFocusable(false);
        }
        
          void win()
        {
            b10.setText('Y'+"");
            b11.setText('O'+"");
            b12.setText('U'+"");
            b13.setText('*'+"");
            
            b20.setText('*'+"");
            b21.setText('W'+"");
            b22.setText('I'+"");
            b23.setText('N'+"");
            
            b00.setText("");
            b01.setText("");
            b02.setText("");
            b03.setText("");
            b30.setText("");
            b31.setText("");
            b32.setText("");
            b33.setText("");
            
            textField1.setFocusable(false);
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new sample2048gui().setVisible(true);
        });
    }


    // Variables declaration - do not modify                     
    private java.awt.Label b00;
    private java.awt.Label b01;
    private java.awt.Label b02;
    private java.awt.Label b03;
    private java.awt.Label b10;
    private java.awt.Label b11;
    private java.awt.Label b12;
    private java.awt.Label b13;
    private java.awt.Label b20;
    private java.awt.Label b21;
    private java.awt.Label b22;
    private java.awt.Label b23;
    private java.awt.Label b30;
    private java.awt.Label b31;
    private java.awt.Label b32;
    private java.awt.Label b33;
    private java.awt.Label bestl;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Label highest;
    private java.awt.Label highestl;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private java.awt.Label label17;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.Panel panel1;
    private java.awt.Label scorel;
    private java.awt.TextField textField1;
    // End of variables declaration                   
}