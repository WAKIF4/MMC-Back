package com.eclipse.mmc.services;

import com.eclipse.mmc.entities.Sponsor;

import java.util.List;
import java.util.Optional;

public interface ISponsorService {
    public List<Sponsor> getAllSponsor();
    public Optional<Sponsor> getSponsorById(long id);
    public Sponsor saveSponsor(Sponsor sponsor);
    public Sponsor updateSponsor(long id, Sponsor updateSponsor);
    public void deleteSponsor(long id);
}
