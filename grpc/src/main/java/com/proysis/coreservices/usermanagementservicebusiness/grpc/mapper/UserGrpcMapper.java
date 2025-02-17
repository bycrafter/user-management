package com.proysis.coreservices.usermanagementservicebusiness.grpc.mapper;

import com.bycrafter.core.usermanagement.proto.UpdateUserRequest;
import com.bycrafter.core.usermanagement.proto.UserRequest;
import com.bycrafter.core.usermanagement.proto.UserResponse;
import com.proysis.coreservices.usermanagementservicebusiness.service.model.UserAddModel;
import com.proysis.coreservices.usermanagementservicebusiness.service.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserGrpcMapper {
    UserAddModel toUserAddModel(UserRequest source);
    UserModel toUserModel(UpdateUserRequest source);
    UserResponse toUserDetailResponse(UserModel source);
    List<UserResponse> toUserListResponse(List<UserModel> source);

}
