public class Impressora{
//1.1
    public void exibir ( float b){
        System.out.print(b);
    }

//1.2

public float exibir (float a, float c){
        return a + c;
}

// 1.3

public float exibir (float d, String e){
    return exibir (d, Integer.parseInt(e));
}

// 1.4
public float exibir (String f, float g){
    return exibir (Integer.parseInt(f), g);
}

}

