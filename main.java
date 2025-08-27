class Main {
    static int generate() {
        return (int)(Math.random()*9000)+1000;
    }

    static int countDigits(int num) {
        int cnt = 0;
        while (num > 0) {
            num /= 10;
            cnt++;
        }
        return cnt;
    }

    static int[] numberToArray(int num ,int cnt) {
        //int cnt = countDigits(num);
        int[] arr = new int[cnt];
        for (int i=cnt-1;i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }
        return arr;
    }

    static int sumArray(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = generate();
        System.out.println(num);
        int cnt = countDigits(num);
        System.out.println(cnt);

        int[] arr = numberToArray(num ,cnt);

        for (int x: arr) System.out.print(x + " ");
        System.out.println();

        System.out.println(sumArray(arr));
    }
}