public class Main{
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
