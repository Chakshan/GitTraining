public class JChallenges {
    public static void main(String args[]){

        Challenges hi = new Challenges();
        int bye = hi.primeSum();
        int arr[] = {1,2,3,4,5,6,7};
        //hi.pairSum(arr, 5);
        System.out.println(bye);
    }
}

class Challenges{
    void helloWorld(){
        System.out.println("Hello World!");
    }

    int primeSum(){
        int sum = 2;
        int count = 1;
        int k = 3;

        while(count<100){
            boolean temp = true;
            for(int j=3;j<k/2;j+=2){
                if(k%j ==0){
                    temp = false;
                    break;
                }
            }
            if(temp){
                sum+= k;
                count++;
            }
            k+=2;
        }

        return sum;
    }

    void pairSum(int arr[], int n){
        int left = 0;
        int right = arr.length-1;
        boolean done= false;
        for(int i=0;i<(arr.length-1)+1;i++){
            if((arr[left]+arr[right]) > n){
                right--;
            }else if((arr[left]+arr[right]) < n){
                left++;
            }else{
                System.out.println(arr[left]+ ", "+arr[right]);
                done =true;
                break;
            }
        }
        if(!done){
            System.out.println("No Pairs Found");
        }
    }

    

}

class Calculator{
    double a;
    double b;
    Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }
    double add(){
        return a+b;
    }
    double subtract(){
        return a-b;
    }

    double multiply(){
        return a*b;
    }

    double divide(){
        return a/b;
    }
}
