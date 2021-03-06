package ComponentBase.user;

import ComponentBase.message.Message;
import ComponentBase.repository.RoleRepository;
import ComponentBase.role.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by waiti on 5/1/2016.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public List<User> findByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    public List<User> findBySurname(String surname) {
        return userDao.findBySurname(surname);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public List<User> findByPhoneNumber(String phoneNumber) {
        return userDao.findByPhoneNumber(phoneNumber);
    }

    @Override
    public List<User> findByAddresses(Address address) {
        return userDao.findByAddresses(address);
    }

    @Override
    public List<User> findByDob(Date dob) {
        return userDao.findByDob(dob);
    }

    @Override
    public List<User> findByRoles(Set<Role> roles) {
        return userDao.findByRoles(roles);
    }

    @Override
    public User create(User user) {
        Set<Role> roles = new HashSet<>();
        roles.add(roleRepository.findByRoleName("customer"));
        Message newUser = new Message("Welcome","Welcome to Watphasom Online Shop");
        user.getMessages().add(newUser);
        user.setRoles(roles);
        return userDao.create(user);
    }
    public User addAddress(Address address,String id){
        User user = getUser(id);
        user.getAddresses().add(address);
        Message userAddAddress = new Message("User add address","your Account has added new address");
        user.getMessages().add(userAddAddress);
        return userDao.edit(user);
    }

    @Override
    public User edit(User user) {
        Message userEdit = new Message("User update","Your Account Has been Update");
        user.getMessages().add(userEdit);
        return userDao.edit(user);
    }

    @Override
    public User delete(String id) {
        User user = getUser(id);
        return userDao.delete(user);
    }

    @Override
    public User getUser(String id) {
        return userDao.getUser(id);
    }
}
