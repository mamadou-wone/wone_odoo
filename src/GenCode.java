public class GenCode {
   
    public int PositionNum(int max_num){
        int NumeroPosion = (int) Math.round(Math.random() * max_num);
        return NumeroPosion;
    }


    public void ChooseLetter(String prenom, String nom, String numero){

        try {
            char[] prenom_list = prenom.toCharArray();
            char[] nom_list = nom.toCharArray();
            char[] num_list = numero.toCharArray();

            int max_num_prenom = prenom_list.length + 1;
            int max_num_nom = nom_list.length + 1;
            int max_num = num_list.length;

            int NomPosition = (int) Math.round(Math.random() * max_num_nom);
            int PrenomPosition = (int) Math.round(Math.random() * max_num_prenom);
            String num = "";
            String code ="";
            int NumeroPosion;
            for (int i = 0; i < 6; i++) {
                NumeroPosion = PositionNum(max_num);
                num += num_list[NumeroPosion];

            }
            code += num + prenom_list[PrenomPosition] + nom_list[NomPosition];
            System.out.println(code);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
//474722KD