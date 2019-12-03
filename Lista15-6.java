import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in)
	int VetorA[] = new int [11];
		int f;
	for(int i=0;i<VetorA.length;i++) {
		System.out.println(" Digite um número para a posição " +(i+1));
		VetorA[i]=in.nextInt();
	}for(int i=0;i<VetorA.length;) {
		aux=2*2;
		f++;
		if(f==VetorA[i]) {
		System.out.println(" o fatorial da posição " +(i+1) + " = " +VetorA[i]);
		i++;
		}
	}

	}

}
