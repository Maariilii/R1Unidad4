package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Hat;

public interface HatRepository extends CrudRepository<Hat,Integer>{

}
