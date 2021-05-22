import javax.swing.*;  
import javax.swing.tree.*;  
public class jtree extends JFrame{  
  
   jtree(){  
      
    DefaultMutableTreeNode world=new DefaultMutableTreeNode("World");  
    DefaultMutableTreeNode Europe=new DefaultMutableTreeNode("Europe");  
    DefaultMutableTreeNode Asia=new DefaultMutableTreeNode("Asia");  
    world.add(Europe);  
    world.add(Asia);  
    DefaultMutableTreeNode France=new DefaultMutableTreeNode("France");  
    DefaultMutableTreeNode Germany=new DefaultMutableTreeNode("Germany");  
    DefaultMutableTreeNode India=new DefaultMutableTreeNode("India");  
    DefaultMutableTreeNode China=new DefaultMutableTreeNode("China");  
    Europe.add(France); 
	Europe.add(Germany); 
	Asia.add(India); 
	Asia.add(China);      
    JTree jt=new JTree(world);  
    add(jt);  
    setSize(200,200);  
    setVisible(true);  
}  
public static void main(String[] args) {  
    new jtree();  
}}  
