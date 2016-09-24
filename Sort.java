import java.util.Arrays;

public class Sort{ 
        public static void main(String args[]) {
                //Bubble Sort
                Integer[] numbersBubbleSort = {50,3,8,40,49, 2 ,6};
                Integer[] numbersSelectionSort = {50,3,8,40,49, 2 ,6};
                Integer[] numbersInsertionSort = {50,3,8,40,49, 2 ,6};
                Integer numberLength = numbersBubbleSort.length;
                Integer temporalNumber = 0;

                for(Integer i=0; i < numberLength; i++){
                        for(Integer j=1; j < (numberLength-i); j++){                               
                                if(numbersBubbleSort[j-1] > numbersBubbleSort[j]){
                                        temporalNumber = numbersBubbleSort[j-1];
                                        numbersBubbleSort[j-1] = numbersBubbleSort[j];
                                        numbersBubbleSort[j] = temporalNumber;
                                }
                                else{
                                        //
                                }
                        }
                }
                System.out.println(Arrays.toString(numbersBubbleSort));

                //Selection Sort
                numberLength = numbersSelectionSort.length;
                Integer index = 0;
                for (Integer i=0; i < numberLength - 1; i++){
                        index = i;
                        for (Integer j = i + 1; j < numberLength; j++){
                                if (numbersSelectionSort[j] < numbersSelectionSort[index]){
                                        index = j;
                                }
                                else
                                {
                                        //
                                }
                        }
      
                        temporalNumber = numbersSelectionSort[index]; 
                        numbersSelectionSort[index] = numbersSelectionSort[i];
                        numbersSelectionSort[i] = temporalNumber;
                }

                System.out.println(Arrays.toString(numbersSelectionSort));

                //Insertion Sort
                temporalNumber = 0;
                numberLength = numbersInsertionSort.length;
                for (Integer i=1; i < numberLength; i++) {
                        for(Integer j=i ; j > 0 ; j--){
                                if(numbersInsertionSort[j] < numbersInsertionSort[j-1]){
                                        temporalNumber = numbersInsertionSort[j];
                                        numbersInsertionSort[j] = numbersInsertionSort[j-1];
                                         numbersInsertionSort[j-1] = temporalNumber;
                                }
                        }
                }

                System.out.println(Arrays.toString(numbersInsertionSort));

        }
}