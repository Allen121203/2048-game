package sample2048game;

import java.util.Random;


public class Sample2048game {

    //-------------------Initialize zero to all--------------------------------
    public Sample2048game()
    {
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                a[i][j]=0;
        
    }
    //-------------------------------------------------------------------------
        // Add this method to Sample2048 class
    public int[][] getBoard() {
        return a;
    }

    
    
    
    int a[][]=new int[4][4];
    int score=0;
    int best=0;
    int highest =0;
    
   
    //----------------------For showing----------------------------------------
    public void show()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println("");
        }
        System.out.println("");
    }
    //-------------------------------------------------------------------------
    
    
    
    
    
    
    
    //--------------For Slideing-----------------------------------------------
    public void slide(String dir)
    {
        switch(dir)
        {
            case "up":
                for(int j=0;j<4;j++)
                {
                    for(int k=0;k<4;k++)
                    for(int i=0;i<3;i++)
                    {
                        if(a[i][j]==0)
                        {
                            a[i][j]=a[i+1][j];
                            a[i+1][j]=0;
                        }
                    }
                }
                break;
            
            case "down":
                for(int j=0;j<4;j++)
                {
                    for(int k=0;k<4;k++)
                    for(int i=3;i>0;i--)
                    {
                        if(a[i][j]==0)
                        {
                            a[i][j]=a[i-1][j];
                            a[i-1][j]=0;
                        }
                    }
                }
                break;
            
            case "left":
                for(int i=0;i<4;i++)
                {
                    for(int k=0;k<4;k++)
                    for(int j=0;j<3;j++)
                    {
                        if(a[i][j]==0)
                        {
                            a[i][j]=a[i][j+1];
                            a[i][j+1]=0;
                        }
                    }
                }
                break;
                
            case "right":
                for(int i=0;i<4;i++)
                {
                    for(int k=0;k<4;k++)
                    for(int j=3;j>0;j--)
                    {
                        if(a[i][j]==0)
                        {
                            a[i][j]=a[i][j-1];
                            a[i][j-1]=0;
                        }
                    }
                }
                break;
                
            default:
                break;
        }
    }
    //-------------------------------------------------------------------------




    //-----------------For adding----------------------------------------------
    public void adding(String dir)
    {
        switch(dir)
        {
            case "down":
                for(int j=0;j<4;j++)
                {
                    for(int i=3;i>0;i--)
                    {
                        if(a[i][j]==a[i-1][j])
                        {
                            score=score+(a[i][j]*=2);
                            a[i-1][j]=0;
                            if(score>best)
                                best=score;
                            if(a[i][j]>highest)
                                highest = a[i][j];
                        }
                    }
                }
                
                break;
                
            case "up":
                for(int j=0;j<4;j++)
                {
                    for(int i=0;i<3;i++)
                    {
                        if(a[i][j]==a[i+1][j])
                        {
                            score=score+(a[i][j]*=2);
                            a[i+1][j]=0;
                            if(score>best)
                                best=score;
                            if(a[i][j]>highest)
                                highest = a[i][j];
                        }
                    }
                }
                break;
                
            case "left":
                for(int i=0;i<4;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        if(a[i][j]==a[i][j+1])
                        {
                            score=score+(a[i][j]*=2);
                            a[i][j+1]=0;
                            if(score>best)
                                best=score;
                            if(a[i][j]>highest)
                                highest = a[i][j];
                        }
                    }
                }
                break;
                
            case "right":
                for(int i=0;i<4;i++)
                {
                    for(int j=3;j>0;j--)
                    {
                        if(a[i][j]==a[i][j-1])
                        {
                            score=score+(a[i][j]*=2);
                            a[i][j-1]=0;
                            if(score>best)
                                best=score;
                            if(a[i][j]>highest)
                                highest = a[i][j];
                        }
                    }
                }
                break;
                
            default:
                
                break;
        }
        
                    
    }
    
    //-------------------Reset the game state----------------------------------
    public void resetGame() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                a[i][j] = 0;

        score = 0;
    }
    //-------------------------------------------------------------------------


    
    //-------------------Generating at random position-------------------------
    public boolean random()
    {
        int count=0;
        int b[]=new int[16];
        
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
            {
                if(a[i][j]==0)
                {
                    b[count]=i*10+j;
                    count++;
                }
            }
        if(count==0)
            return false;
        
        Random ran=new Random();
        int tval=ran.nextInt(count);
        int rval=b[tval];
        int aa=rval/10;
        int bb=rval%10;
        boolean bbb=ran.nextBoolean();
        if(bbb)
            a[aa][bb]=256;
        else
            a[aa][bb]=4;
        
            return true;
    }
}

