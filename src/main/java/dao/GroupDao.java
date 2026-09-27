package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import model.Group;

import java.util.ArrayList;

public class GroupDao {
    private final EntityManager entityManager;

    public GroupDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public void save(Group group) {

        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            entityManager.persist(group);

            transaction.commit();

        } catch (Exception e) {

            if (transaction.isActive()) {
                transaction.rollback();
            }

            throw new RuntimeException(
                    "Erro ao guardar o grupo.",
                    e
            );
        }
    }


    public Group findById(int id) {

        try {
            return entityManager.find(Group.class, id);

        } catch (Exception e) {

            throw new RuntimeException(
                    "Erro ao procurar o grupo.",
                    e
            );
        }
    }


    public ArrayList<Group> findAll() {

        try {

            return new ArrayList<>(
                    entityManager
                            .createQuery(
                                    "SELECT g FROM Group g",
                                    Group.class
                            )
                            .getResultList()
            );

        } catch (Exception e) {

            throw new RuntimeException(
                    "Erro ao listar os grupos.",
                    e
            );
        }
    }

    public void update(Group group) {

        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            entityManager.merge(group);

            transaction.commit();

        } catch (Exception e) {

            if (transaction.isActive()) {
                transaction.rollback();
            }

            throw new RuntimeException(
                    "Erro ao atualizar o grupo.",
                    e
            );
        }
    }

    public void delete(Group group) {

        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Group groupToDelete =
                    entityManager.find(Group.class, group.getId());

            if (groupToDelete == null) {
                throw new RuntimeException(
                        "Grupo não encontrado."
                );
            }

            entityManager.remove(groupToDelete);

            transaction.commit();

        } catch (Exception e) {

            if (transaction.isActive()) {
                transaction.rollback();
            }

            throw new RuntimeException(
                    "Erro ao eliminar o grupo.",
                    e
            );
        }
    }
}
