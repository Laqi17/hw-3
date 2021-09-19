class ATM {
  
   public int countBanknotes(int sum) {
        int result = 0;
        int[] bank = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        while (i < bank.length) {
            if (sum >= bank[i]) {
                sum -= bank[i];
                result++;
            } else i++;

        }

        return result;
    }
}
