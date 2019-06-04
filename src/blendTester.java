
public class blendTester {

	public static void main(String[] args) {
		ConsonantBlends a = new BlendMaker('b', 'l');
		System.out.println(a); // bl

		a.getNextBlend();
		System.out.println(a); // br

		a.getNextBlend();
		System.out.println(a); // ch

		ConsonantBlends e = new BlendMaker('s', 'c');
		System.out.println(e); // sc

		e.getNextBlend();
		e.getNextBlend();
		e.getNextBlend();
		System.out.println(e); // sl

		ConsonantBlends i = new BlendMaker('w', 'r');
		System.out.println(i); // wr

		i.getNextBlend();
		System.out.println(i); // null

		ConsonantBlends u = new BlendMaker('q', 'u');
		System.out.println(u); // qu

		u.getNextBlend();
		System.out.println(u); // null

	}

}


//Output

/*
bl
br
ch
sc
sl
wr
null
qu
null
*/