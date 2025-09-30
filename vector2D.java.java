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
}



