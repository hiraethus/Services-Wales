package com.clackjones.cymraeg;

import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.Collection;

@Repository
public class CategoriDao extends JpaDao<Long, CategoriEntity> implements Dao<Long, CategoriEntity>  {

    public Collection<CategoriEntity> findAll() {
        TypedQuery<CategoriEntity> query = entityManager.createNamedQuery("CategoriEntity.findAll", CategoriEntity.class);
        return query.getResultList();
    }
}
