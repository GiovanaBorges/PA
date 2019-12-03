import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int Vetor[] = new int [10];
	int Quantidade=0,j,i;
	
	
	for(  i=0;i<Vetor.length;i++) {
		System.out.println("Digite o valor da posição " +(i+1)  );
		Vetor[i]=in.nextInt();
	}
	for( i=Vetor[i],j=Vetor[i];j<Vetor.length;i--,j++) {
	if(Vetor[j]/i==0) {
		Quantidade++;
	}else if(Quantidade>2){
	
	
	}

}

//Para sabemos se um número é primo ou não devemos dividir ele da sua base inicial (1)
//até o seu final (no caso o número que você quer descobrir se é prmo ou não)
// exemplo: queremos descobrir se 7 é primo
// entao pegaremos de sua base inicial e dividiremos ele ate seu fim
// 7/i ; 7/i ; 7/i ; 7/i ;.... 7/7(7/i).
// se o 7 for dividido por algum número nesse intervalo e de 0 então ele não é primo
// mas se ao fazermos isso e observamos que ele so foi dividido por 1 e ele mesmo entao é primo 