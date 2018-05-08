package map2;

public class Persoana {
	private NumePersoana mNume;
	private int mVarsta;
	
	

	public Persoana(NumePersoana pNume, int pVarsta) {
		super();
		mNume = pNume;
		mVarsta = pVarsta;
	}

	public NumePersoana getNume() {
		return mNume;
	}

	public void setNume(NumePersoana pNume) {
		mNume = pNume;
	}

	public int getVarsta() {
		return mVarsta;
	}

	public void setVarsta(int pVarsta) {
		mVarsta = pVarsta;
	}

	@Override
	public String toString() {
		return "Persoana [mNume=" + mNume + ", mVarsta=" + mVarsta + "]";
	}

	
}
