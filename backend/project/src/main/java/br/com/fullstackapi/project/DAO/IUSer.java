package br.com.fullstackapi.project.DAO;

import br.com.fullstackapi.project.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUSer extends CrudRepository<User, Integer> {
}
