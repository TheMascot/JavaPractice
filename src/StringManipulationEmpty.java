public class StringManipulationEmpty {

        public static void main(String[] args) {

//        LVL 1.
            String input = "Java Is FUN!";

/*      Print the string in all lowercase
        Print the string in all uppercase
        Print the length of the string
        Print the first and last character*/


//        LVL 2.
            String sentence = "String manipulation is powerful";

   /*   Extract the word "manipulation"
        Replace "powerful" with "awesome"
        Check if the sentence contains the word "Java"*/


//        LVL 3. - Decoding

            String payload = "@@@HDR{len=100}:::MSG<<J#a!v#a##_i/s##!_F#U!#N>>:::SEP|||META[msg-decode-requested]|NOISE{1234}##END";

            /* This coded string is our payload to decode.
             * The real message lays between "MSG<<...>>".
             * First isolate this part,
             * then remove the noise (/,#,_,*),
             * make the message content camelCase (first word start with lowercase, others uppercase letters), (no need for spaces between words),
             * rebuild the whole message, paste in your filtered MSG<<...>> part,
             * locate the "msg-decode-requested" tag and change it to "msg-decode-done",
             * correct the length of the decoded message in the part {len=100}. (make it 3 digits)
             * Log each step to the console!
             * */





        }
    }

