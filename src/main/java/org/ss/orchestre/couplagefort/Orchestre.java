package org.ss.orchestre.couplagefort;

import java.util.ArrayList;
import java.util.List;

public class Orchestre {
	private List<Musicien> listeMusiciens;

	private String morceau;

	public Orchestre(String morceau) {
		listeMusiciens = new ArrayList<>();
		this.morceau = morceau;
	}
	
	public void ajout(Musicien musicien) {
		listeMusiciens.add(musicien);
	}

	public void jouer() {
		for(Musicien musicien: listeMusiciens) {
			musicien.jouerMorceau(morceau);
			}
		}
	}

