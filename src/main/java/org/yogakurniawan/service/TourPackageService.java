package org.yogakurniawan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yogakurniawan.domain.TourPackage;
import org.yogakurniawan.repository.TourPackageRepository;

/**
 * Tour Package Service
 *
 * Created by Mary Ellen Bowman
 */
@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    public TourPackage createTourPackage(String code, String name) {
        if (tourPackageRepository.findOne(code) == null) {
            return tourPackageRepository.save(new TourPackage(code, name));
        } else {
            return null;
        }
    }
    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }
    public long total() {
        return tourPackageRepository.count();
    }
}

