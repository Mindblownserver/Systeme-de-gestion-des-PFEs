package methodes;

public class CopierTableaux {
        //taille(tabDst)>=taille(tabSrc)
        public static <E> void copierTableaux(E tabDst[], E tabSrc[],int capaciteSrc){
            for(int i=0;i<capaciteSrc;i++)
                tabDst[i]=tabSrc[i];
            
        }
        public static <E> void copierTableaux(double tabDst[], double tabSrc[],int capaciteSrc){
            for(int i=0;i<capaciteSrc;i++)
                tabDst[i]=tabSrc[i];
            
        }
}
