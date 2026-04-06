package com.api.rest.repository;

import com.api.rest.model.TagAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagAcessoRepository extends JpaRepository<TagAcesso, Long> {

}
