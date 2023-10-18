package lucas.dio.service;

import lucas.dio.streamAPIDIOProject.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
