class sup{//string builder
    public static void main(String[] args) {
        
    int one = 1;
String color = "red";
StringBuilder sb = new StringBuilder();
sb.append("One=").append(one).append(", Color=").append(color).append('\n');
System.out.print(sb);

/////String buffer
System.out.println("\n");
 String str = "study";
 str.concat("tonight");
 System.out.println(str); // Output: study
 StringBuffer strB = new StringBuffer("study");
 strB.append("tonight");
 System.out.println(strB); // Output: studytonight
    }
}

