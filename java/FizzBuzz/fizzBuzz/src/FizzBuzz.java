public class FizzBuzz {
    
    public String run(int[] numbers) {
        String result = "";
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 15 == 0) {
                result+= "FizzBuzz ";
            } else if (numbers[i] % 3 == 0) {
                result+= "Fizz ";
            } else if (numbers[i] % 5 == 0) {
                result+= "Buzz ";
            } else {
                result+= numbers[i] + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int[] numbers = new int[100];
        for(int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }

        String fizzBuzzedNumbers = fizzBuzz.run(numbers);
        System.out.println(fizzBuzzedNumbers);
    }
}