package agencia_bancaria;

public class Conta{

		public int id;
		public float saldo;
		public String idCliente;
		public String type;
		
		public Conta(int id, String idCliente) {
			this.id = id;
			this.idCliente = idCliente;
			this.saldo = 0;
			this.type = "";
		}
		
		public void sacar(float value) {
			if(this.saldo - value < 0) {
				System.out.println("Fail: saldo insuficiente");
			}
			else {
				this.saldo = saldo - value;
			}
			
		}
		
		public void depositar(float value) {
			this.saldo = saldo + value;
		}
		
		public void transferir(Conta other, float value) {
			if(this.saldo - value >=  0) {
				this.saldo -= value;
				other.depositar(value);
			}
		}
		public interface atualizar{
            public void atualizarMensal();
        }

		@Override
		public String toString() {
			return "" + id + ":" + idCliente + ":" + saldo + "0:" + type;
		}
}
