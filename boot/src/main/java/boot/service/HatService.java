package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.HatRepository;
import boot.model.Hat;


	@Service @Transactional
	public class HatService {
		private final HatRepository hatRepository;

		public HatService(HatRepository hatRepository) {
			super();
			this.hatRepository = hatRepository;
		}
		public List<Hat> findAll(){
			List<Hat> hats = new ArrayList<Hat>();
			for (Hat hat : hatRepository.findAll()){
				hats.add(hat);
			}
			return hats;
		}
		
		public void save(Hat hat){
			hatRepository.save(hat);
		}
		
		public void delete(int id){
			hatRepository.delete(id);
		}
		
		public Hat findHat(int id){
			return hatRepository.findOne(id);
		}
	}

		
	