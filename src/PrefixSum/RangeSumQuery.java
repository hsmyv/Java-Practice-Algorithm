package PrefixSum;

public class RangeSumQuery {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 3};

        int left = 1;
        int right = 3;

        System.out.println(rangeSumQuery(arr,left, right));


    }






    public static int rangeSumQuery(int[] arr, int left, int right){
        int[] prefix = new int[arr.length];
        int sum = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefix[i] = sum;
        }

        if(left == 0){
            result =  prefix[right];
        }else{
            result = prefix[right] - prefix[left - 1];
        }
        return result;
    }


}



//    static void main() {
//        int[] arr = {2, 4, 1, 5, 3};
//        int left = 1;
//        int right = 3;
//
//        System.out.println(rangeSumQuery(arr, left, right));
//
//    }
//
//    public static int rangeSumQuery(int[] arr, int left, int right){
//        int sum = 0;
//
//        while (left < right + 1){
//            sum += arr[left];
//            left++;
//        }
//
//        return sum;
//    }



//Hansı daha sürətlidir?
//Prefix Sum daha sürətlidir.
//
//Real layihələrdə və alqoritmlərdə biz adətən verilənlər üzərində təkrar-təkrar sorğular edirik.
// Məsələn, 1 milyon elementi olan massivdə 10.000 dəfə fərqli aralıqların cəmini soruşsan:
//
//İterativ metodda: 10.000 dəfə dövr (loop) qurulacaq (milyonlarla əməliyyat).
//
//Prefix Sum-da: 1 dəfə dövr (hazırlıq üçün) və 10.000 dənə sadə çıxma əməliyyatı.
//
//Nəticə: Praktiki olaraq Prefix Sum (birinci kod) hər zaman daha effektiv yanaşma hesab olunur.