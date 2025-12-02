package com.ahmedworkspace.casahub.user.mapper;

import com.ahmedworkspace.casahub.user.application.dto.ReadUserDTO;
import com.ahmedworkspace.casahub.user.domain.Authority;
import com.ahmedworkspace.casahub.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}
