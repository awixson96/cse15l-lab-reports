class MainExample1 {
	public static void main(String[] args) {
    int current = 0;
    while(current < args.length) {
      System.out.println(args[current]);
    }
  }
}

class MainExample2 {
	public static void main(String[] args) {
    int length = args.length;
    for(int i = 0; i < length; length += 1) {
      System.out.println(args[i]);
    }
  }
}

class EvensExample {
  static int sumEvenIndices(int[] nums) {
    int sum = 0;
    for(int i = 0; i < nums.length; i += 2) {
      sum += nums[i + 1];
    }
    return sum;
  }
}

class NumsExample {
  static double reciprocal(int n) {
    return 1 / n;
  }
  static double ratio(int n, int d) {
    return n / d;
  }
  static double formula(int a, int b, int c) {
    return ratio(a, b) * reciprocal(c);
  }
}
