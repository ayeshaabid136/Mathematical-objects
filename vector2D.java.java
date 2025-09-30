public class Vector2D{
    private double x;
    private double y;

    //parameterized constructor
    public vector2D(double:x,double:y){
        this.x=x;
        this.y=y;
    }

    //copy contructor
    public vetor2D(other vector2D){
        this.x=other.x;
        this.y=y;
    }

    //getter
public double getx(){
    return x;
}
public double gety(){
    return y;
} 

//get the dimension of vector2d(dimension for vector2d is always 2)
public int getdimension(){
    return 2;
}

//Addition
public vector2D add(vector2D v){
    return new vector2D(this.x+vther.x,this.y+v.y);
}

//substraction
public vector2D sub(vector2D v){
    return new vector2D(this.x-v.x,this.y-v.y);
}

//Dotproduct
public double dot(vector2D v){
    return(this.x*v.x+this.y*v.y);
}

//Crossproduct
public double cross(vector2D){
    return(this.x*v.x-this.y*v.y);
}

//Magnitude(length of vector)
public double magnitude(){
    return math.sqrt(x*x+y*y);
}

//clone
public Vector2D clone(){
    return Vector2D(this.x,this.y);
}

//tostring @override
public string tosting(){
    return(x,y);
}



    public static void main(string[]args){
        Vector2D v1 =new Vector2D(3,4);
        vector2D v2 =new vector2D(1,2);

        system.out.println("v1="+v1);
        system.out.println("v2="+v2);

        v1.add(v2);
        system.out.println("v1+v2="+add);

        v2.substract(v2);
        system.out.println("v1-v2="+substract);

        v1.dot(v2);
        system.out.println("v1*v2="+Dotproduct);

        v1.cross(v2);
        system.out.println("v1*v2="+crossproduct);

        double mag1=v1.magnitude();
        double mag2=v2.magnitude();
        system.out.println("magnitude of v1="+mag1);
        system.out.println("magintude of v2="+mag2);

        //Test getter
        system.out.println("v1.x="+v1.getx());
        system.out.println("v1.y="+v1.gety());
        system.out.println("demension of v1="+v1.getdimension());

        //Test clone
        v1.clone();
        system.out.println("clone of v1="=v3);

    }
}
