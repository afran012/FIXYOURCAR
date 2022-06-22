/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.DTO.ManoDeObraDTO;
import com.carcenter.api.mapper.ManoDeObraMapper;
//import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.ManoDeObra;
import com.carcenter.api.repository.ManoDeObraRepository;
import com.carcenter.api.service.iService.IManoDeObraService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class ManoDeObraService implements IManoDeObraService {
    
    
	@Autowired
	private ManoDeObraRepository manoDeObraRepository;
	@Autowired
	private ManoDeObraMapper manoDeObraMap;
	/*@Autowired
	private TipoIdentificacionMapper tipoIdMap;*/

	@Override
	public List<ManoDeObraDTO> findAllManoDeObras() {
		// TODO Auto-generated method stub
		return manoDeObraMap.mappAllManoDeObrasToManoDeObrasDTOs(
				manoDeObraRepository.findManoDeObras());
	}

	public Optional<ManoDeObraDTO> findManoDeObraById(Long id) {
		Optional<ManoDeObra> oManoDeObra = manoDeObraRepository
				.findManoDeObraById(id);
		return Optional.of(manoDeObraMap.mapManoDeObraToDTO(oManoDeObra.get()));
	}

	@Override
	public ManoDeObraDTO updateManoDeObra(ManoDeObraDTO manoDeObraDTO, Long id) {

		Optional<ManoDeObra> oManoDeObra = manoDeObraRepository
				.findManoDeObraById(id);
		if (oManoDeObra.isPresent()) {

			if (manoDeObraDTO.getServicio()!= null) {
				oManoDeObra.get().setServicio(manoDeObraDTO.getServicio());
			}
                        
                        if (manoDeObraDTO.getDescripcion()!= null) {
				oManoDeObra.get().setDescripcion(manoDeObraDTO.getDescripcion());
			}
                        
                        if (manoDeObraDTO.getPrecioMaximo()!= null) {
				oManoDeObra.get().setPrecioMaximo(manoDeObraDTO.getPrecioMaximo());
			}
                        
                        if (manoDeObraDTO.getPrecioMinimo()!= null) {
				oManoDeObra.get().setPrecioMinimo(manoDeObraDTO.getPrecioMinimo());
			}
                        
                        if (manoDeObraDTO.getPrecioTotal()!= null) {
				oManoDeObra.get().setPrecioTotal(manoDeObraDTO.getPrecioTotal());
			}
                        
                        
                        

			return manoDeObraMap.mapManoDeObraToDTO(
					manoDeObraRepository.saveManoDeObra(oManoDeObra.get()));
		}
		return null;
	}

	@Override
	public ManoDeObraDTO deleteManoDeObraById(Long id) {
		// TODO Auto-generated method stub
		Optional<ManoDeObra> manoDeObraDeleted = manoDeObraRepository
				.findManoDeObraById(id);
		if (manoDeObraDeleted.isPresent()) {
			manoDeObraRepository.deleteManoDeObraById(id);
			return manoDeObraMap.mapManoDeObraToDTO(manoDeObraDeleted.get());
		}
		return null;
	}

	@Override
	public ManoDeObra saveManoDeObra(ManoDeObra manoDeObra) {
		// TODO Auto-generated method stub
		manoDeObraRepository.saveManoDeObra(manoDeObra);
		return manoDeObra;
	}
    
}
