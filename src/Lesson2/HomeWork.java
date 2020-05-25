package Lesson2;

public class HomeWork {
    public static void main(String[] args) {

        String[][] arr = createArray();
        arr[2][2] = "1a";

        try {
            int sum = castArrayStringToIntAndSum(arr);
            System.out.println(sum);
        } catch (MyArraySizeException e) {
            System.out.println("Массив неправильного размера");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    static int castArrayStringToIntAndSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        if (arr.length != 4) throw new MyArraySizeException();

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке массива [" + i + "] [" + j + "] неверные данные.");
                }
            }
        }

        return result;
    }

    static String[][] createArray() {
        String[][] arr = new String[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = "1";
            }
        }
        return arr;
    }
}

