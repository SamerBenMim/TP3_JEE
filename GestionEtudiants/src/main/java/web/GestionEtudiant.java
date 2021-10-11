package web;
import java.util.ArrayList;
import java.util.List;
public class GestionEtudiant {
	public static List<Etudiant> etudiants=new ArrayList<Etudiant>();
	public static void add(Etudiant e)
	{
		etudiants.add(e);
	}
	public static void  remove(int cin)
	{
		
		for(int i=0;i<etudiants.size();i++)
		{
			if (cin==etudiants.get(i).cin)
			{
				etudiants.remove(cin);
				break;
			}
		}
	}
	public static int getSize()
	{
		return etudiants.size();
	}
	

}
