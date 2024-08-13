package baitaptonghop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //mảng cho trước
        int [] advanceArray= {2, 3, 5, 7, 11, 13, -4, 0, 8, 15};
        int[] array = new int[0];
        List<Integer> list = new ArrayList<>();
        while (true) {
            System.out.println("======================================MENU======================================");
            System.out.println("1. Tính tổng các phần tử lẻ trong một mảng các số nguyên");
            System.out.println("2. Đếm số lần xuất hiện của một phần tử trong mảng");
            System.out.println("3. Xóa một phần tử khỏi mảng các số nguyên");
            System.out.println("4. Đếm số lượng số âm, số dương và số không");
            System.out.println("5. Thêm, xóa, cập nhật giá trị của một mảng/danh sách");
            System.out.println("6. Tính lãi suất đơn giản");
            System.out.println("7. In bảng nhân từ 1 đến 10");
            System.out.println("8. Xóa các phần tử trùng lặp trong một mảng các số nguyên");
            System.out.println("9. Đếm số lượng phần tử trong mảng lớn hơn một giá trị cho trước");
            System.out.println("10. Tính tổng các số nguyên tố nhỏ hơn n trong mảng cho trước");
            System.out.println("0. Thoát");
            System.out.println("======================================MENU======================================");
            System.out.print("Chọn một tùy chọn: ");
            
            int choice = scanner.nextInt();
           
            if (choice >= 1 && choice <= 8 && array.length==0 && choice!=5 && choice!=7 && choice!=6) {
                System.out.print("Nhập số lượng phần tử của mảng: ");
                int n = scanner.nextInt();
                array = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                }
            }
            
            
            if (choice == 5 && list.isEmpty()) {
                System.out.print("Nhập số lượng phần tử của danh sách: ");
                int n = scanner.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                    list.add(scanner.nextInt());
                }
            }

            switch (choice) {
                case 1:
                	System.out.println("Mảng gồm có: ");
                	for (int ele : array) {
						System.out.print(ele+"\t");
					}
                	System.out.println();
                    sumOddNumbers(array);
                    break;
                case 2:
                	System.out.println("Mảng gồm có: ");
                	for (int ele : array) {
						System.out.print(ele+"\t");
					}
                	System.out.println();
                    countOccurrences(array, scanner);
                    break;
                case 3:
                	System.out.println("Mảng gồm có: ");
                	for (int ele : array) {
						System.out.print(ele+"\t");
					}
                	System.out.println();
                    array = removeElement(array, scanner);
                    System.out.println("Mảng sau khi xóa: ");
                	for (int ele : array) {
						System.out.print(ele+"\t");
					}
                	System.out.println();
                    break;
                case 4:
                	System.out.println("Mảng gồm có: ");
                	for (int ele : array) {
						System.out.print(ele+"\t");
					}
                	System.out.println();
                    countNumbers(array);
                    break;
                case 5:
                	System.out.println("Danh sách gồm có: ");
                	for (int ele : list) {
						System.out.print(ele+"\t");
					}
                	System.out.println();
                    list = listOperations(list, scanner);
                    System.out.println("Danh sách sau khi thay đổi gồm có: ");
                	for (int ele : list) {
						System.out.print(ele+"\t");
					}
                	System.out.println();
                    break;
                case 6:
                    calculateSimpleInterest(scanner);
                    break;
                case 7:
                    printMultiplicationTable();
                    break;
                case 8:
                	System.out.println("Mảng gồm có: ");
                	for (int ele : array) {
						System.out.print(ele+"\t");
					}
                	System.out.println();
                    array = removeDuplicates(array);
                    System.out.println("Mảng sau khi xóa các phần tử trùng lặp: ");
                	for (int ele : array) {
						System.out.print(ele+"\t");
					}
                	System.out.println();
                    break;
                case 9:
                	System.out.println("Mảng cho trước: ");
                	for (int ele : advanceArray) {
						System.out.print(ele+"\t");
					}
                	System.out.println();
                    countGreaterThan(advanceArray, scanner);
                    break;
                case 10:
                	System.out.println("Mảng cho trước: ");
                	for (int ele : advanceArray) {
						System.out.print(ele+"\t");
					}
                	System.out.println();
                    sumOfPrimes(advanceArray, scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    // 1. Tính tổng các phần tử lẻ
    public static void sumOddNumbers(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        System.out.println("Tổng các phần tử lẻ: " + sum);
    }

    // 2. Đếm số lần xuất hiện của một phần tử
    public static void countOccurrences(int[] array, Scanner scanner) {
        System.out.print("Nhập giá trị cần đếm: ");
        int value = scanner.nextInt();
        int count = 0;
        for (int num : array) {
            if (num == value) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của " + value + ": " + count);
    }

    // 3. Xóa một phần tử khỏi mảng
    public static int[] removeElement(int[] array, Scanner scanner) {
        System.out.print("Nhập giá trị cần xóa: ");
        int valueToRemove = scanner.nextInt();
        return Arrays.stream(array)
                .filter(num -> num != valueToRemove)
                .toArray();
    }

    // 4. Đếm số lượng số âm, số dương và số không
    public static void countNumbers(int[] array) {
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        for (int num : array) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Số lượng số dương: " + positiveCount);
        System.out.println("Số lượng số âm: " + negativeCount);
        System.out.println("Số lượng số không: " + zeroCount);
    }

    // 5. Thêm, xóa, cập nhật giá trị của một mảng/danh sách
    public static List<Integer> listOperations(List<Integer> list, Scanner scanner) {
    	System.out.println("0. Thoát");
        System.out.println("1. Thêm phần tử");
        System.out.println("2. Xóa phần tử");
        System.out.println("3. Cập nhật phần tử");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhập phần tử cần thêm: ");
                int elementToAdd = scanner.nextInt();
                list.add(elementToAdd);
                break;
            case 2:
                System.out.print("Nhập phần tử cần xóa: ");
                int indexToRemove = scanner.nextInt();
                boolean result=list.removeIf(integer->integer==indexToRemove);
                if (result) {
                    System.out.println("Xóa thành công! ");
                } else {
                    System.out.println("Phần tử không có");
                }
                break;
            case 3:
                System.out.print("Nhập giá trị phần tử cần cập nhật: ");
                int oldValue = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == oldValue) {
                        System.out.print("Nhập giá trị mới: ");
                        int newValue = scanner.nextInt();
                        list.set(i, newValue);
                        found = true;
                        
                    }
                }

                if (!found) {
                    System.out.println("Không tìm thấy phần tử có giá trị " + oldValue);
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }

        return list;
    }

    // 6. Tính lãi suất đơn giản
    public static void calculateSimpleInterest(Scanner scanner) {
        System.out.print("Nhập số tiền gốc (P): ");
        double principal = scanner.nextDouble();
        System.out.print("Nhập lãi suất hàng năm (r): ");
        double rate = scanner.nextDouble();
        System.out.print("Nhập thời gian (t) tính theo năm: ");
        double time = scanner.nextDouble();

        double amount = principal * (1 + rate * time);
        System.out.println("Số tiền sau thời gian " + time + " năm là: " + amount);
    }

    // 7. In bảng nhân từ 1 đến 10
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    // 8. Xóa các phần tử trùng lặp trong một mảng
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    // 9. Đếm số lượng phần tử trong mảng lớn hơn một giá trị cho trước
    public static void countGreaterThan(int[] array, Scanner scanner) {
        System.out.print("Nhập giá trị để so sánh: ");
        int value = scanner.nextInt();
        int count = 0;
        for (int num : array) {
            if (num > value) {
                count++;
            }
        }
        System.out.println("Số lượng phần tử lớn hơn " + value + " là: " + count);
    }

    // 10. Tính tổng các số nguyên tố nhỏ hơn n
    public static void sumOfPrimes(int[] array, Scanner scanner) {
        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();
        int sum = 0;
        
        for (int num : array) {
            if (num < n && isPrime(num)) {
                sum += num;
            }
        }
        
        System.out.println("Tổng các số nguyên tố nhỏ hơn " + n + " là: " + sum);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
