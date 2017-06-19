package hellloworld;

public class GetMean {
    public int getMean(int[] array) {
    	int sum=0;
    	int cnt=0;
    	for(int i:array) {
    		cnt++;
    		sum+=i;
    	}
    	return sum/cnt;
    }

    public static void main(String[] args) {
        int x[] = {1,2,3,4,5,6,7,8,9,10};
        GetMean getMean = new GetMean();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}

