interface pizza{
	String info();
}
class jalapeno implements pizza{
	String extra_layer;
	jalapeno(String extra_layer){
		this.extra_layer = extra_layer;
	}
	@Override
	public String info() {
		return (" Pizza Decorated with Jalapeno and "+ extra_layer);
	}
	public String getExtra_layer() {
		return extra_layer;
	}
	public void setExtra_layer(String extra_layer) {
		this.extra_layer = extra_layer;
	}
}
class onion implements pizza{
	String extra_layer;
	String extra_layer2;
	onion(String extra_layer,String extra_layer2){
		this.extra_layer = extra_layer;
		this.extra_layer2 = extra_layer2;
	}
	@Override
	public String info() {
		return (" Pizza Decorated with Onion and "+extra_layer+ "with another layer of" +extra_layer2);}
		public String getExtra_layer() {
			return extra_layer;
		}
		public void setExtra_layer(String extra_layer) {
			this.extra_layer = extra_layer;
		}
		public String getExtra_layer2() {
			return extra_layer2;
		}
		public void setExtra_layer2(String extra_layer2) {
			this.extra_layer2 = extra_layer2;
		}
	}
	class capsicum implements pizza{
		String extra_layer;
		capsicum(String extra_layer){
			this.extra_layer = extra_layer;
		}
		@Override
		public String info() {
			return (" Pizza Decorated with Capsicum "+extra_layer);
		}
		public String getExtra_layer() {
			return extra_layer;
		}
		public void setExtra_layer(String extra_layer) {
			this.extra_layer = extra_layer;
		}
	}
	class cheeseBasePizza implements pizza{
		pizza pizzas;
		String cheesyBase;
		cheeseBasePizza(pizza pizzas,String cheesyBase){
			this.pizzas = pizzas;
			this.cheesyBase = cheesyBase;
		}
		@Override
		public String info() {
			return pizzas.info()+" with chesse base of "+cheesyBase;
		}
		public pizza getPizzas() {
			return pizzas;
		}
		public void setPizzas(pizza pizzas) {
			this.pizzas = pizzas;
		}
		public String getCheesyBase() {
			return cheesyBase;
		}
		public void setCheesyBase(String cheesyBase) {
			this.cheesyBase = cheesyBase;
		}
	}
	class chocolateBasePizza implements pizza{
		pizza pizzas;
		String chocoBase;
		chocolateBasePizza(pizza pizzas,String chocoBase){
			this.pizzas = pizzas;
			this.chocoBase = chocoBase;
		}
		@Override
		public String info() {
			return pizzas.info()+" with choco base of "+chocoBase;}
		public pizza getPizzas() {
			return pizzas;
		}
		public void setPizzas(pizza pizzas) {
			this.pizzas = pizzas;
		}
		public String getChocoBase() {
			return chocoBase;
		}
		public void setChocoBase(String chocoBase) {
			this.chocoBase = chocoBase;
		}
	}
	class qus6 {
		public static void main(String[] args) {
			jalapeno j = new jalapeno("tomato");
			onion o = new onion("ginger","olive");
			capsicum c = new capsicum("chilly");
			System. out .println(j.info());
			System. out .println(o.info());
			System. out .println(c.info());
			cheeseBasePizza cz = new cheeseBasePizza(new onion(
					"grilled potato","fried chicken"),
					"Margretta Cheese");
			System. out .println(cz.info());
			chocolateBasePizza ch = new chocolateBasePizza(
					new cheeseBasePizza(
							new capsicum("spinach"), "Olive cheese"), "Almond choco");
			System. out .println(ch.info());
		}
	}