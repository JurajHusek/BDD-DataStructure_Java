package bdd;

public class Uzol {
	public Uzol LeftChild;
	public Uzol RightChild;
	public Uzol Parent;
	public String Udef;
	int Ustatus;
	Uzol(Uzol parent, String def, int status)
	{
		this.Parent = parent;
		this.Udef = def;
		this.Ustatus = status;
	}
}
