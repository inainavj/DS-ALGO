   public boolean isValid(String s) {
        if(s.length() == 1){
            return false;
        }
        
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i< s.length(); i++){
                char c =s.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else if(c == '}' || c == ']' || c == ')'){
                if(stack.empty()){
                    return false;
                }else{
                    if(c == ')' &&  stack.peek()  == '('){
                         stack.pop();
                    }else  if(c == ']' &&  stack.peek()  == '['){ 
                        stack.pop();
                    }else  if(c == '}' &&  stack.peek()  == '{'){ 
                         stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return stack.empty()?true:false;
   
