/**
* Authors: Austin Anderson and Clement Dikoko
* Date: February 22,2016
* Purpose: This program will ready a text file of names and output the names in alphabetical order by last name
* in their own individual files.
**/ 

import java.util.*;
import java.io.*;

public class project1{
    private String firstname;
    private String lastname;

    project1(String first, String last){
        this.firstname = first;
        this.lastname = last;
    }

    public String getFirstName(){
        return this.firstname;
    }
    
    public String getLastName(){
        return this.lastname;
    }
    
    public void setFirstName(String name){
        this.firstname = name;
    }
    
    public void setLastName(String name){
        this.lastname = name;
    }

	/**
	*Function to compare last names
	**/
    public int compare(project1 name){
        int comparedLastName = this.lastname.compareTo(name.getLastName());
        if (comparedLastName == 0) {//if lastname are same then compare by firstname
            return this.firstname.compareTo(name.getFirstName());
        }
        return comparedLastName;
    }


    public static void main(String[] args) throws IOException, FileNotFoundException{
		
        Scanner input = new Scanner(new File("names.txt"));            
        
        ArrayList<project1> names = new ArrayList();

        String line;
        
		//adds names to ArrayList
        while(input.hasNextLine()){
            line = input.nextLine();
            String[] name = line.split(" ");
            project1 temp = new project1(name[0], name[1]);
            
            names.add(temp);
        }
        //Bubblesorter     
        for(int i = 0; i < names.size(); i++){
            for(int j = i + 1; j < names.size(); j++){
                int x = names.get(i).compare(names.get(j));
                
				//Set first and last names
                if(x > 0){
                    project1 temp = new project1(names.get(i).getFirstName(), names.get(i).getLastName());
                    names.get(i).setFirstName(names.get(j).getFirstName());
                    names.get(i).setLastName(names.get(j).getLastName());
                    names.get(j).setFirstName(temp.getFirstName());
                    names.get(j).setLastName(temp.getLastName());
                }
                else{
                    // this else is hit, it means they are in the right place or the same name
                }
            }
        }      
        
        char char_at = 'A';

		//Creates new text file to write to
        for(int j = 0; j < 26; j++){
            File file = new File("names" + char_at + ".txt");
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            
			//Writes names to the new file alphabetically
            for(int i = 0; i < names.size(); i++){
                String nameToCompare = names.get(i).getLastName();
                char firstLetter = nameToCompare.charAt(0);
                if(firstLetter == char_at){
                   writer.write(names.get(i).getFirstName() + " " + names.get(i).getLastName() + "\r\n");
                }
            }
            char_at++;
            writer.flush();
            writer.close();
         }
            

    }
}