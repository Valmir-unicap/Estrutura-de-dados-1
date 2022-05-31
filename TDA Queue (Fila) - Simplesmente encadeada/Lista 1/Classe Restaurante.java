public class Restaurante {
    private String nome;
    private String pedido;
    private int mesa;
        public Restaurante(String nome, String pedido, int mesa){
            this.nome=nome;
            this.pedido=pedido;
            this.mesa=mesa;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome(){
            return this.nome;
        }
        public void setPedido(String pedido) {
            this.pedido = pedido;
        }
        public String getPedido(){
            return this.pedido;
        }
        public void setMesa(int mesa) {
            this.mesa = mesa;
        }
        public int getMesa(){
            return this.mesa;
        }
        public String toString(){
            return "O cliente: "+this.nome+", do pedido: "+this.pedido+", da mesa: "+this.mesa;
        }
    }
