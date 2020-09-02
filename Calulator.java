public class Calculator {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(expression(str));
        System.out.println(convertToAnswer(expression(str)));
    }

    public static String expression(String express) {
        String current = "";
        Stack<Character> stack = new Stack<>();
        int priority;
        for (int i = 0; i < express.length(); i++) {
            priority = getPriority(express.charAt(i));

            if (priority == 0)
                current += express.charAt(i);

            if (priority == 1)
                stack.push(express.charAt(i));

            if (priority > 1) {
                current += ' ';
                while (!stack.empty()) {
                    if (getPriority(stack.peek()) >= priority) {
                        current += stack.pop();
                        current += ' ';
                    }
                    else
                        break;
                }
                stack.push(express.charAt(i));
            }

            if (priority == -1) {
                current += ' ';
                while (getPriority(stack.peek()) != 1) {
                    current += stack.pop();
                }
                stack.pop();
            }
        }
        while (!stack.empty()) {
            current += ' ';
            current += stack.pop();
        }
        return current;
    }

    public static double convertToAnswer(String rpn) {
        String operand = new String();
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < rpn.length(); i++) {
            if (rpn.charAt(i) == ' ')
                continue;
            if (getPriority(rpn.charAt(i)) == 0) {
                while (rpn.charAt(i) != ' ' && getPriority(rpn.charAt(i)) == 0) {
                    operand += rpn.charAt(i++);
                    if (i == rpn.length())
                        break;
                }
                stack.push(Double.parseDouble(operand));
                operand = new String();
            }
            if (getPriority(rpn.charAt(i)) > 1) {
                double a = stack.pop();
                double b = stack.pop();
                if (rpn.charAt(i) == '+')
                    stack.push(b + a);
                if (rpn.charAt(i) == '-')
                    stack.push(b - a);
                if (rpn.charAt(i) == '*')
                    stack.push(b * a);
                if (rpn.charAt(i) == '/')
                    stack.push(b / a);
            }
        }
        return stack.pop();
    }

    public static int getPriority(char symbol) {
        if(symbol == '*' || symbol == '/')
            return 3;
        else if (symbol == '+' || symbol == '-')
            return 2;
        else if (symbol == '(')
            return 1;
        else if (symbol == ')')
            return -1;
        else
            return 0;
    }
}
