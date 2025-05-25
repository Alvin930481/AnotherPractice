public class ArrayUtils {
    private ArrayUtils() {
    }

    /**
     * 整數陣列輸出成字串
     *
     * @param arr 要轉換成字串的陣列
     * @return 回傳元陣列轉換成字串陣列
     */
    public static String toString(int[] arr) {
        if(arr==null){
            return null;
        }
        String arrayList = "";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                arrayList += arr[i] + ", ";
            } else {
                arrayList += arr[i];
            }
        }
        arrayList = "[" + arrayList + "]";
        return arrayList;
    }

    /**
     * 計算陣列去掉最低及最高分的平均
     *
     * @param doubles 小數陣列
     * @return 回傳平均值
     */
    public static double getAerage(double[] doubles) {
    double max=doubles[0];
    double min=doubles[0];
    double sum=0;
    double avg;

        for (int i = 1; i < doubles.length; i++) {
            if(max<doubles[i]){
                max=doubles[i];
            }
            if(min>doubles[i]){
                min=doubles[i];
            }
        }
        for (int i = 0; i < doubles.length; i++) {
            sum+=doubles[i];
        }
        avg=(sum-max-min)/doubles.length-2;
        return avg;
    }

}
