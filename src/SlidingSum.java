import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;


public class SlidingSum {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
//		#include<iostream>
//		#include<algorithm>
//		using namespace std;
//		int main()
//		{
//			int a[100]={0},n;
//			int i;
//			int maxy[10]={0};
//
//			//cout<<ÓEnter number of elements in arrayÓ;
//
//			cin >> n;
//
//			for(i=0; i<n;i++)
//				cin >> a[i];
//
//			for(i=n-1; i>=0 ; i--)
//				maxy[i] = a[i] +max( maxy[i+2],maxy[i+3]);
//
//			cout<<max(maxy[0], maxy[1]);
//			return 0;
//		}
		
		FileInputStream a = new FileInputStream("s.txt");
		DataInputStream a2 = new DataInputStream(a);
		BufferedReader a3 = new BufferedReader(new InputStreamReader(a2));
	}

}
