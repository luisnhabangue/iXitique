package service;

import dao.GroupDao;
import model.Group;

import java.util.ArrayList;

    public class GroupService {

        private final GroupDao groupDao;

        public GroupService(GroupDao groupDao) {
            this.groupDao = groupDao;
        }

        // Criar um novo grupo
        public void createGroup(Group group) {

            if (group == null) {
                throw new IllegalArgumentException(
                        "O grupo não pode ser nulo."
                );
            }

            if (group.getName() == null ||
                    group.getName().trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "O nome do grupo é obrigatório."
                );
            }

            groupDao.save(group);
        }

        // Procurar grupo pelo ID
        public Group findGroupById(int id) {

            if (id <= 0) {
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

        // Listar todos os grupos
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

            if (group.getName() == null ||
                    group.getName().trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "O nome do grupo é obrigatório."
                );
            }

            // Verifica se o grupo existe
            findGroupById(group.getId());

            groupDao.update(group);
        }

        // Eliminar grupo
        public void deleteGroup(int id) {

            // Primeiro verifica se existe
            Group group = findGroupById(id);

            groupDao.delete(group);
        }


}
