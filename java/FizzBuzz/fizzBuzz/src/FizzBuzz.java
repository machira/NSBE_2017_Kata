public class FizzBuzz {
    
    public String run(int[] numbers) {
        String result = "";
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