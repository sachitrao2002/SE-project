/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sachit Rao
 */
class pac1 {
   
    int id;
    String ph;
    
    pac1()
    {
        id=-1;
        ph="not specified";
        
    }
    
    void student2(int id)
    {
        this.id=id;
        
    }
    void student2(String phonenum)
    {
        this.ph=phonenum;
        
    }
    
    void display()
    {
        System.out.println("id is  "+id);
        System.out.println("ph is "+ph);
        System.out.println();
    }

    public static void main(String args[])
    {
        pac1 stu2= new pac1();
        stu2.student2(20);
        stu2.student2("sachit");
        stu2.display();
    }
}
