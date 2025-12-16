class complex{
    double real;
    double imag;
    complex(double r,double i){
        real = r;
        imag = i;
    }
    complex add(complex a){
        return new complex(real+a.real,imag+a.imag);
    }
    complex sub(complex a){
        return new complex(real-a.real,imag-a.imag);
    }
    boolean comp(complex c){
        return (real==c.real && imag==c.imag);
    }
}
class prog3{
    public static void main(String[] args){
        complex c = new complex(1,1);
        complex d = new complex(1,1);
        complex sum = c.add(d);
        complex diff = c.sub(d);
        System.out.println("Sum: " + sum.real + "+" + sum.imag + "i");
        System.out.println("Difference: " + diff.real + "+" + diff.imag + "i");
        System.out.println("Equal or not: "+c.comp(d));
    }
}