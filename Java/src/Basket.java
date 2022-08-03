
class Basket<E> {
  private E elem;

  Basket(E e) {
    elem = e;
  }

  void replace(E e) {
    elem = e;
  }

  E get() {
    return elem;
  }	
  
  class Apple {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ"));
		
		public void main(String[] args)  {
			appleBasket.replace(new Apple("紅玉"));
//			System.out.println(appleBasket.get().getName());
			System.out.println(appleBasket.get().getName());
		}
		
		private String name;
		
		Apple(String name) {
			this.name = name;
		}
		
		String getName() {
			return name;
		}
	} 

	class Peach {
		private String name;
		
		Peach(String name) {
			this.name = name;
		}
		
		String getName() {
			return name;
		}
	}
}

