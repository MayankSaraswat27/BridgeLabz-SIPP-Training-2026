class MathWizard {

    int instanceVar = 100;

    boolean isPrime(int n) {
        if(n < 2) return false;

        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;

        return true;
    }

    long factorial(int n) {
        long fact = 1;
        for(int i=1;i<=n;i++)
            fact *= i;
        return fact;
    }

    double factorial(double n) {
        double fact = 1;
        for(int i=1;i<=n;i++)
            fact *= i;
        return fact;
    }

    int fibonacci(int n) {
        if(n<=1) return n;

        int a=0,b=1,c=0;

        for(int i=2;i<=n;i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    int gcd(int a,int b) {
        while(b!=0) {
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    int lcm(int a,int b) {
        return (a*b)/gcd(a,b);
    }

    long power(int base,int exp) {
        long ans=1;

        for(int i=1;i<=exp;i++)
            ans*=base;

        return ans;
    }

    void scopeDemo() {
        int localVar = 50;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {

        MathWizard m = new MathWizard();

        System.out.println(m.isPrime(13));
        System.out.println(m.factorial(5));
        System.out.println(m.factorial(5.0));
        System.out.println(m.fibonacci(7));
        System.out.println(m.gcd(24,36));
        System.out.println(m.lcm(24,36));
        System.out.println(m.power(2,5));

        m.scopeDemo();
    }
}