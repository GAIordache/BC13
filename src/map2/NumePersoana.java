package map2;

public class NumePersoana {
	private final String mNume;
	private final String mPrenume;

	public NumePersoana(String pNume, String pPrenume) {
		super();
		mNume = pNume;
		mPrenume = pPrenume;
	}

	public String getNume() {
		return mNume;
	}

	

	public String getPrenume() {
		return mPrenume;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mNume == null) ? 0 : mNume.hashCode());
		result = prime * result + ((mPrenume == null) ? 0 : mPrenume.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof NumePersoana))
			return false;
		NumePersoana other = (NumePersoana) obj;
		if (mNume == null) {
			if (other.mNume != null)
				return false;
		} else if (!mNume.equals(other.mNume))
			return false;
		if (mPrenume == null) {
			if (other.mPrenume != null)
				return false;
		} else if (!mPrenume.equals(other.mPrenume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NumePersoana [mNume=" + mNume + ", mPrenume=" + mPrenume + "]";
	}

	
}
