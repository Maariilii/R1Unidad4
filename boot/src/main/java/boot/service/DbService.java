package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.DbRepository;
import boot.model.Db;

@Service @Transactional
public class DbService {
	private final DbRepository dbRepository;
	
	public DbService(DbRepository dbRepository){
		super();
		this.dbRepository = dbRepository;
	}
	
	public List<Db>findAll(){
		List<Db> dbs = new ArrayList<Db>();
		for (Db db : dbRepository.findAll()){
			dbs.add(db);
		}
		return dbs;
	}
	
	public void save(Db db){
		dbRepository.save(db);
	}
	
	public void delete(int id){
		dbRepository.delete(id);
	}
	
	public Db findDb(int id){
		return dbRepository.findOne(id);
	}

}
