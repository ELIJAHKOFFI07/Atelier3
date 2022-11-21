package atelier3;

import java.util.HashMap;




public class Caractere  {
	
	public Caractere(String c) {
		
	}
	public static int compteur (String s,  String a) {
		int o=0;
		for (int i=0;i<s.length();i++) {
			if ( String.valueOf(s.charAt(i)). contains( a)  ){
				o++;
			}
		}
		return o;
		
	}
	

	public static String verification(String chaine) {
		 HashMap<String  ,String  >map=new HashMap<>();
		 map.put("{","}");
			map.put("(", ")");
			map.put("[", "]");
			
if(    ((compteur(chaine, "\"")%2==0 ) && (compteur(chaine,"\'")%2==0 ))) {
for (String caractere : map.keySet()) {
	if (compteur(chaine, caractere)!=compteur(chaine, map.get(caractere) )) {
		
		return String.format( "%s  n'est  pas une phrase  équilibrée",chaine );
	}
	
}
return String.format( "%s  est  une phrase  équilibrée",chaine );	
		}
else {
	return String.format( "%s  n'est  pas une phrase  équilibrée",chaine );
}
	}
	
	
	

	}

