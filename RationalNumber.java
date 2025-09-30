

public class RationalNumber{
    private int numerator;
    private int denominator;

    //parameterized constructor
    public RationalNumber(int numerator,int denominator){
        if(denominator==0){
            throw new
             IllegalArgumentException("Denominator can not be zero");
            this.numerator= numerator;
            this.denominator= denominator;
            Simplify(); 

            //setter
            public void set(int numerator,int denominator){
                this.numerator=numerator;
                this.denominator=denominator;
            }

            //getter
            public int getNumerator(){
                return numerator;

                public int getDenominator(){
                    return denominator;
                }
            }

            //gcd[Greatest common factor]
            private int gcd(int a,int b){
                return b==0?a:gcd(b,a%b);
            }

            //simplify the fraction
            public void simplify(){
                int g = gcd(math.abs(numerator) , math.abs(denominator));
                numerator/ = g;
                denominator/ = g;

                //for keeping denominator positive
                if(denominator<0){
                    numerator = -numerator;
                    denominator = -denominator;
                }

                //LCM
                public int LCM(int a , int b){
                    return((a*b)/gcd(int a , int b)); 
                }

                //Addition
                public RationalNumber add(RationalNumber other){
                    int lcm = LCM(this.denominator, other.denominator);
                    int newNum = this.numerator*(lcm/this.denominator) + other.numerator*(lcm/other.denominator);
                    return new RelationalNumber(newNum,lcm);
                }

                //Substraction
                public RationalNumber sub(RationalNumber other){
                    int lcm = lcm(this.denominator,other.denominator);
                    int newNum = this.numerator*(lcm/this.denominator) - other.numerator*(lcm/other.denominator);
                    return new RationalNumber(lcm,newNum);

                    //multiplication
                    public RationalNumber mul(RationalNumber other){
                        int num = this.numerator*other.numerator;
                        int den = this.denominator*other.denominator;
                        return new RationalNumber(num,den);

                        //Division
                        public RationalNumber div(RationalNumber){
                            if(other.numeratortor==0){
                                throw new 
                                IllegalArgumentException("Division by zero");
                            }
                            int num = this.numerator*other.denominator;
                            int den = this.denominator*other.numerator;
                            return new RationalNumber(num , den);
                        }

                        //@override
                        public String toString(){
                            return(numerator + "/" +denominator);

                            //clone
                            public RationalNumber clone(){
                                return newRationalNumber(this.numerator , this.denominator);
                            }
                        }

                    }


                }
            }
        }

    }
}