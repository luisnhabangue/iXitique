package service;

import dao.GroupDao;
import model.Group;

import java.util.ArrayList;

public class GroupService {

    private final GroupDao groupDao;

    public GroupService(GroupDao groupDao) {
        this.groupDao = groupDao;
    }

    // Criar grupo
    public void createGroup(Group group) {

        if (group == null) {
            throw new IllegalArgumentException(
                    "O grupo não pode ser nulo."
            );
        }

        if (group.getGroupName() == null ||
                group.getGroupName().trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "O nome do grupo é obrigatório."
            );
        }

        if (group.getMonthlyAmount() == null ||
                group.getMonthlyAmount().signum() <= 0) {

            throw new IllegalArgumentException(
                    "O valor mensal deve ser maior que zero."
            );
        }

        if (group.getStartDate() == null) {
            throw new IllegalArgumentException(
                    "A data de início é obrigatória."
            );
        }

        if (group.getStatus() == null) {
            throw new IllegalArgumentException(
                    "O estado do grupo é obrigatório."
            );
        }

        groupDao.save(group);
    }

    // Procurar grupo pelo ID
    public Group findGroupById(Long id) {

        if (id == null || id <= 0) {
            throw new IllegalArgumentException(
                    "ID do grupo inválido."
            );
        }

        Group group = groupDao.findById(id);

        if (group == null) {
            throw new IllegalArgumentException(
                    "Grupo não encontrado."
            );
        }

        return group;
    }

    // Listar grupos
    public ArrayList<Group> listGroups() {
        return groupDao.findAll();
    }

    // Atualizar grupo
    public void updateGroup(Group group) {

        if (group == null) {
            throw new IllegalArgumentException(
                    "O grupo não pode ser nulo."
            );
        }

        if (group.getGroupId() == null ||
                group.getGroupId() <= 0) {

            throw new IllegalArgumentException(
                    "ID do grupo inválido."
            );
        }

        if (group.getGroupName() == null ||
                group.getGroupName().trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "O nome do grupo é obrigatório."
            );
        }

        if (group.getMonthlyAmount() == null ||
                group.getMonthlyAmount().signum() <= 0) {

            throw new IllegalArgumentException(
                    "O valor mensal deve ser maior que zero."
            );
        }

        if (group.getStartDate() == null) {
            throw new IllegalArgumentException(
                    "A data de início é obrigatória."
            );
        }

        if (group.getStatus() == null) {
            throw new IllegalArgumentException(
                    "O estado do grupo é obrigatório."
            );
        }

        // Verifica se o grupo existe
        findGroupById(group.getGroupId());

        groupDao.update(group);
    }

    // Eliminar grupo
    public void deleteGroup(Long id) {

        Group group = findGroupById(id);

        groupDao.delete(group);
    }
}

