package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Db;

public interface DbRepository extends CrudRepository<Db,Integer> {

}
