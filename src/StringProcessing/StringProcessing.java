package StringProcessing;

public class StringProcessing {

    // http://stackoverflow.com/questions/73883/string-vs-stringbuilder
    public static void main(String[] args) {
//        hamlet();
//        ifPoem();
//	  comparingStrings();
//        System.out.println(usingStrings());
        interning();
    }

    public static void hamlet() {
        StringBuilder sb = new StringBuilder();

        // the monologue from Hamlet(given)
        sb.append("To be, or not to be--that is the question: \n");
        sb.append("Whether 'tis nobler in the mind to suffer \n");
        sb.append("The slings and arrows of outrageous fortune \n");
        sb.append("Or to take arms against a sea of troubles \n");
        sb.append("And by opposing end them. To die, to sleep--\n");
        sb.append("No more--and by a sleep to say we end \n");
        sb.append("The heartache, and the thousand natural shocks \n");
//        sb.append("That flesh is heir to.\n");
        sb.append("That flesh is air to.\n");

        //System.out.println(sb);
        // a. Replace the "." AT THE END with a "!". Note that there are two "."
        // so I dont want to get the first one. Do not hardcode the index.
        int indexOfLastLine = sb.indexOf("That flesh is air to.");
        int indexOfLastFullStop = sb.indexOf(".", indexOfLastLine);
        sb.setCharAt(indexOfLastFullStop, '!');
        System.out.println("(a)\n" + sb);

        // b. replace air with heir
        int indexOfAir = sb.indexOf("air");
        // delete(startIndex, endIndex-1)
        // Thus, if "That flesh is air to" was the only line:
        //  delete(14, 14+3-1=16)
        sb.delete(indexOfAir, indexOfAir + "air".length());
        sb.insert(indexOfAir, "heir");
        System.out.println("(b)\n" + sb);

//        // c. extract the 3rd line
        int whereToStart
                = // 87
                sb.indexOf("The slings and arrows of outrageous fortune");
        int whereToEnd
                = // 130
                whereToStart
                + "The slings and arrows of outrageous fortune".length();

        // substring(start, end-1) = (87, 130-1=129)
        // or extract 130-87=43 chars starting at index 87
        //System.out.println(whereToStart);
        //System.out.println(whereToEnd);
        String thirdLine = sb.substring(whereToStart, whereToEnd);
        System.out.println("(c)\n" + thirdLine);

        //System.out.println(sb);
    }

    public static void ifPoem() {
        StringBuffer sb = new StringBuffer();
        sb.append("If you can keep your head when all about you \n");//1
        sb.append("Are losing theirs and blaming it on you;\n");//2
        sb.append("If you can trust yourself when all men doubt you,\n");//3
        sb.append("But make allowance for their doubting too;\n");//4
        sb.append("If you can wait and not be tired by waiting,\n");//5
        sb.append("Or, being lied about, don't deal in lies,\n");//6
        sb.append("Or, being hated, don't give way to hating,\n");//7
        sb.append("And yet don't look too good, nor talk too wise;\n");//8
        //System.out.println(sb);

        // a. insert line numbers
        sb.insert(0, "1.");
        sb.insert(sb.indexOf("Are losing theirs and blaming it on you"), "2.");
        sb.insert(sb.indexOf("If you can trust yourself when all men doubt you"),
                "3.");
        sb.insert(sb.indexOf("But make allowance for their doubting too;"), "4.");
        sb.insert(
                sb.indexOf("If you can wait and not be tired by waiting,",sb.indexOf("4.")),// where to start search
                "5.");
        sb.insert(sb.indexOf("Or, being lied about, don't deal in lies,", sb.indexOf("5.")),// where to start search
                "6.");
        sb.insert(sb.indexOf("Or, being hated, don't give way to hating,", sb.indexOf("6.")),// where to start search
                "7.");
        sb.insert(sb.indexOf("And yet don't look too good, nor talk too wise;", sb.indexOf("7.")),// where to start search
                "8.");

        System.out.println(sb);

        // b. output the 10th character
        System.out.println("The character at [10] is " + sb.charAt(10));

//        // Replacing the ";" at the end with a ".". Note that there are two ";"
//        // so I dont want to get the first one...
//        sb.setCharAt(sb.indexOf(";", sb.indexOf("8.")), '.');
//        System.out.println(sb);

//     	// replace hated with disliked
//    	int indexOfHated = sb.indexOf("hated");
//    	sb.delete(indexOfHated, indexOfHated+"hated".length()); // incl, excl
//    	sb.insert(indexOfHated, "disliked");
    	
//        // replace hating with disliking
//    	int indexOfHating = sb.indexOf("hating");
//    	// delete(startIndex, endIndex-1)
//    	sb.delete(indexOfHating, indexOfHating+"hating".length());
//    	sb.insert(indexOfHating, "disliking");
//     	System.out.println(sb);
//      	
//        // extract the last 3 lines
//     	System.out.println("Last three lines == \n"+sb.substring(sb.indexOf("6.")));
        // c. replace "trust" with "TRUST" (one occurrence)
        // replace(startIndex, endIndex-1, newString)
        sb.replace(sb.indexOf("trust"),
                sb.indexOf("trust") + "trust".length(),
                "TRUST");
        System.out.println(sb);

        // d. replace "don't" with "do not" (multiple occurrences)
        while (sb.indexOf("don't") != -1) {
            // first the chars are removed and then the new
            // string is inserted
            sb.replace(sb.indexOf("don't"),						// incl n
                       sb.indexOf("don't") + "don't".length(),	// excl n-1
                       "do not");
        }
        System.out.println(sb);

    }

    public static void interning() {
        String a = "abc";
        String b = "abc";
        // == is the same as Object::equals() which means :
        //   return true if the references are the same!
        System.out.println(a == b);       // true

        String c = new String("abc");
        String d = new String("abc");
        System.out.println(c == d);       // false

        String e = new String("abc").intern();
        String f = new String("abc").intern();
        System.out.println(e == f);       // true
    }

    public static String usingStrings() {
    /*What happens in memory? By adding those six numbers to the end of the string 
    we created 13 string objects! And 12 of them were useless!
    
            1 - "The numbers are: "
            2 - "0"
            3 - "The numbers are: 0"
            4 - "1"
            5 - "The numbers are: 01"
            6 - "2"
            7 - "The numbers are: 012"
            8 - "3"
            9 - "The numbers are: 0123"
            10 - "4"
            11 - "The numbers are: 01234"
            12 - "5"
            13 - "The numbers are: 012345" 		*/
        String s = "The numbers are: ";
        for (int i = 0; i <= 5; i++) {
//            s += Integer.toString(i);
            s+=i;
        }
        return s;
    }

    public static void comparingStrings() {
        String name = "alan";				// 'a' in ASCII is 97
        int res = "sean".compareTo(name);	// 's' in ASCII is 115
        System.out.println(res);			// 18 (115-97)

        System.out.println("jack".compareTo("paul"));	// -6 = 'j' - 'p' (106-112)
        System.out.println("tom".compareTo("tim"));	// 6  = 'o' - 'i' (111-105) 

    }
}
