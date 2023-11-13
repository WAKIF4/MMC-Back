package com.eclipse.mmc.services;

import com.eclipse.mmc.entities.Partenaire;

import java.util.List;
import java.util.Optional;

public interface IPartenaireService {
    public List<Partenaire> getAllPartenaire();
    public Optional<Partenaire> getPartenaireById(long id);
    public Partenaire savePartenaire(Partenaire partenaire);
    public Partenaire updatePartenaire(long id, Partenaire updatePartenaire);
    public void deletePartenaire(long id);
}
