package com.api.rest.service.mapper;

import com.api.rest.model.TagAcesso;
import com.api.rest.service.dto.TagAcessoDTO;
import org.springframework.stereotype.Component;

@Component
public class TagAcessoMapper {

    public static TagAcesso dtoToEntity(TagAcessoDTO tagAcessoDTO) {
        TagAcesso tagAcesso = new TagAcesso();

        tagAcesso.setId(tagAcessoDTO.getId());
        tagAcesso.setNumTag(tagAcessoDTO.getNumTag());
        tagAcesso.setAtiva(tagAcessoDTO.getAtiva());
        tagAcesso.setDataCadastro(tagAcessoDTO.getDataCadastro());
        tagAcesso.setPessoa(tagAcessoDTO.getPessoa());

        return tagAcesso;
    }

    public static TagAcessoDTO entityToDto(TagAcesso tagAcesso) {
        TagAcessoDTO tagAcessoDTO = new TagAcessoDTO();

        tagAcessoDTO.setId(tagAcesso.getId());
        tagAcessoDTO.setNumTag(tagAcesso.getNumTag());
        tagAcessoDTO.setAtiva(tagAcesso.getAtiva());
        tagAcessoDTO.setDataCadastro(tagAcesso.getDataCadastro());
        tagAcessoDTO.setPessoa(tagAcesso.getPessoa());

        return tagAcessoDTO;
    }

}