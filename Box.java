class Box {
    double width;
    double height;
    double depth;
   
    Box(double w, double h, double d) {
      width =w;
      height = h;
      depth = d;
    }
   
    double volume()
    { 
      double v;
      v=width * height * depth;
      return v;
    }
  }
  class Main {
    public static void main(String args[]) {
      Box b1 = new Box(4,3,2);
      double vol;
      vol = b1.volume();
      System.out.println("Volume is " + vol);
    }
  }