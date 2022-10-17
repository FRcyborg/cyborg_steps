public String reverseString {

      public String theMethod(String str) {
            Stack<character> a = new Stack<Character>();
            String res = "";
            for (char b: str.toCharArray()) {
                  a.push(b);
            }
            while (!a.empty()) {
                  res += a.pop();
            }
            return res;
      } // end of method


} // end of class
