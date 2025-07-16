public class Estoque{

    String name;
    double price;
    int quant;

    public String mensagem(){
        //para exibir precisa chamar com o System.***
         String exib = "Produto.: "+nome+"R$ "+preco+", "+quant+"unidades!\n total.:"+total; 
        
    }
    public double totalValueInEstoque(){
          double total = price * quant;
          return total;
    }

    public void addProducts(int quantAdd){
         quant+= quantAdd;
    }

    public void removeProducts(int quantRemove){
         quant -= quantRemove;  
          }
}