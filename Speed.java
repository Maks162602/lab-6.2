package Package;
public class Speed {
        public Speed(){

        }
        void compareSpeed(int c) {
                if (c<250 && c<240 ) {
                        System.out.println("Volvo їде повільніше ніж BMW і Passat");
                }else if (c<250 && c>200) {
                        System.out.println("Passat їде швидше ніж Volvo, але повільніше ніж BMW");
                }else if(c>240 && c>200) {
                        System.out.println("BMW їде швидше ніж Passat i Volvo");
                }
        }
}
