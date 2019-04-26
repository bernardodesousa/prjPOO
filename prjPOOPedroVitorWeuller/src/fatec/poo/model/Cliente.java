public class Cliente extends Pessoa {
    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos;

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        pedidos = new ArrayList<Pedidos>();
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public addPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedido.setCliente(this);
    }
}
