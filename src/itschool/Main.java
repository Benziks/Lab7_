package itschool;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(1, 2, 3);
        System.out.println(v1.lengthModuleVector());
        System.out.println(v1.addVector(v2));

    }

    static class Vector {
        private double x, y, z;

        public Vector() {
            setX(0);
            setY(0);
            setZ(0);
        }

        public Vector(double x, double y, double z) {
            this.setX(x);
            this.setY(y);
            this.setZ(z);
        }

        public Vector(Vector v) {
            this.setX(v.getX());
            this.setY(v.getY());
            this.setZ(v.getZ());
        }


        public double lengthModuleVector() {
            return Math.sqrt(x * x + y * y + z * z);
        }


        public Vector addVector(Vector v) {
            return new Vector(getX() + v.getX(), getY() + v.getY(), getZ() + v.getZ());
        }




        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getZ() {
            return z;
        }

        public void setZ(double z) {
            this.z = z;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            long temp;
            temp = Double.doubleToLongBits(x);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            temp = Double.doubleToLongBits(y);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            temp = Double.doubleToLongBits(z);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Vector other = (Vector) obj;
            if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
                return false;
            if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
                return false;
            if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
                return false;
            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Vector [x=");
            builder.append(x);
            builder.append(", y=");
            builder.append(y);
            builder.append(", z=");
            builder.append(z);
            builder.append("]");
            return builder.toString();
        }

    }
}
