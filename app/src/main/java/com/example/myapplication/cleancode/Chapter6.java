package com.example.myapplication.cleancode;

public class Chapter6 {

//    public class Point {
//        public double x;
//        public double y;
//    }
//
//    public interface Point {
//        double getX();
//        double getY();
//        void setCartesian(double x, double y);
//        double getR();
//        double getTheta();
//        void setPolar(double r, double theta);
//    }
//
//
//    public interface Vehicle {
//        double getFuelTankCapacityInGallons();
//        double getGallonsOfGasoline();
//    }
//
//    public interface Vehicle {
//        double getPercentFuelRemaining();
//    }


//    public class Square {
//        public Point topLeft;
//        public double side;
//    }
//
//    public class Rectangle {
//        public Point topLeft;
//        public double height;
//        public double width;
//    }
//
//    public class Circle {
//        public Point center;
//        public double radius;
//    }
//
//    public class Geometry {
//        public final double PI = 3.141592653589793;
//
//        public double area(Object shape) throws NoSuchShapeException {
//            if (shape instanceof Square) {
//                Square s = (Square) shape;
//                return s.side * s.side;
//            } else if (shape instanceof Rectangle) {
//                Rectangle r = (Rectangle) shape;
//                return r.height * r.width;
//            } else if (shape instanceof Circle) {
//                Circle c = (Circle) shape;
//                return PI * c.radius * c.radius;
//            } else {
//                throw new NoSuchShapeException();
//            }
//        }
//    }

//    final String outputDir = ctxt.getOptions(),getScratchDir().getAbsolutePath();
//    public class Square implements Shape {
//        private Point topLeft;
//        private double side;
//
//        public double area() {
//            return side * side;
//        }
//    }
//
//    public class Rectangle implements Shape {
//        private Point topLeft;
//        private double height;
//        private double width;
//
//        public double area() {
//            return height * width;
//        }
//
//    }
//
//    public class Circle implements Shape {
//        private Point center;
//        private double radius;
//        public final double PI = 3.141592653589793;
//
//        public double area() {
//            return PI * radius * radius;
//        }
//    }



//    Options opts = ctxt.getOptions();
//    File scratchDir = opts.getScratchDir();
//    final String outputDir = scratchDir.getAbsolutePath();

//
//    ctxt.getAbsolutePathOfSc ratchDirecto ryOption();
//ctx.getScratchDirectoryOption().getAbsolutePath()


//    String outFile = outputDir + "/" + className.replace('.', '/') + ".class";
//    FileOutputStream tout = new FileOutputStream(outFile);
//    BufferedOutputStream bos = new B니fferedOutputStream(fout);
//
//
//    BufferedOutputStream bos = ctxt.createScratchFileStream(classFileName);

}