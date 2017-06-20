package laicode_java;

public class Solution10 {
	//复制java文件
	//for i in {3..100}; do cp Solution2.java "Solution$i.java"; done
	//分离某一行然后替换
	//for i in {3..100}; do head -3 "Solution$i.java" | tail -1 $1 | awk '{split($0, a, ' '); print a[3]' ; done
	//sed -i ' ' 's/hi/hello/' file1
	//更改后复制到新文件
	//awk 'NR==2{gsub("hi", "Hello", $1)}; {print $0}' file1 > newfile
	//代变量就必须要用“”双引号
	//for i in {3..100}; do sed -i " " "3s/Solution/Solution$i/" Solution$i.java ; done
	public int firstOccur(int[] array, int target) {
		if(array==null || array.length==0) {
			return -1;
		}
		int left=0, right=array.length-1;
		while(left<right-1) {
			int mid=left+(right-left)/2;
			if(array[mid]>=target) {
				right=mid;
			}
			else {
				left=mid;
			}
		}
		if(array[left]==target) {
			return left;
		}
		else if(array[right]==target) {
			return right;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution10 s10 = new Solution10();
		int[] matrix={1,2,2,3,5,5,6,7,8,2000000};
		int result=s10.firstOccur(matrix, 2000000);
		System.out.println(result);
		return;
	}
}
