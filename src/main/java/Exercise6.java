public class Exercise6 {
    public String equation_2nd(double a,double b, double c) {
        double x1,x2;
        if(a==0)
        {
            if(b==0) {
                if (c == 0)
                    return "Phuong trinh vo so nghiem";
                else
                    return "Phuong trinh vo nghiem";
            }
            else {
                return "Nghiem phuong trinh x = " +-c/b;
            }
        }
        double delta = b*b -4*a*c;
        if (delta > 0)
        {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            return "Phuong trinh co 2 nghiem phan biet: x1= "+x1+", x2= "+x2;
        }
        else if(delta == 0 )
            return "Phuong trinh co nghiem kep: x1 = x2 = "+(-b/(2*a));
        else
            return "Phuong trinh vo nghiem";
    }
}