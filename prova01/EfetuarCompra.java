package prova01;

public class EfetuarCompra {
	public static void main(String[] args) {
		Itens item1 = new Itens("Coca", 7);
		Itens item2 = new Itens("Fanta", 5.5);
		Itens item3 = new Itens("Bolo", 55);
		Itens item4 = new Itens("Pudim", 30);
		
		Produto p1 = new Produto("Refrigerante", 4, item1);
		Produto p2 = new Produto("Refrigerante", 2, item2);
		Produto p3 = new Produto("Doces", 1, item3);
		Produto p4 = new Produto("Doces", 1, item4);
		
		Compra c1 = new Compra();		
		c1.Comprar(p1);
		c1.Comprar(p2);
		c1.Comprar(p3);
		c1.Comprar(p4);
		c1.ValorDaCompra();
		
		Carrinho s1 = new Carrinho(p1);
		s1.AddTo(p2);
		s1.AddTo(p3);
		s1.AddTo(p4);
		s1.DysplayProducts();
	}
}
