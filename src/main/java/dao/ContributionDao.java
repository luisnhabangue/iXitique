package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import model.Contribution;
import java.util.ArrayList;

public class ContributionDao {

    private final EntityManager entityManager;

    public ContributionDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Contribution contribution) {

        EntityTransaction transaction =
                entityManager.getTransaction();

        try {
            transaction.begin();

            entityManager.persist(contribution);

            transaction.commit();

        } catch (Exception e) {

            if (transaction.isActive()) {
                transaction.rollback();
            }

            throw new RuntimeException(
                    "Erro ao guardar a contribuição.",
                    e
            );
        }
    }


    public Contribution findById(Long contributionId) {

        try {
            return entityManager.find(
                    Contribution.class,
                    contributionId
            );

        } catch (Exception e) {

            throw new RuntimeException(
                    "Erro ao procurar a contribuição.",
                    e
            );
        }
    }

    public ArrayList<Contribution> findAll() {

        try {

            return new ArrayList<>(
                    entityManager.createQuery(
                            "SELECT c FROM Contribution c", Contribution.class
                    ).getResultList()
            );

        } catch (Exception e) {
            // dont forget
            throw new RuntimeException(
                    "Erro ao listar as contribuições.",
                    e
            );
        }
    }


    public void update(Contribution contribution) {

        EntityTransaction transaction =
                entityManager.getTransaction();

        try {
            transaction.begin();

            entityManager.merge(contribution);

            transaction.commit();

        } catch (Exception e) {

            if (transaction.isActive()) {
                transaction.rollback();
            }

            throw new RuntimeException(
                    "Erro ao atualizar a contribuição.",
                    e
            );
        }
    }


    public void delete(Contribution contribution) {

        EntityTransaction transaction =
                entityManager.getTransaction();

        try {
            transaction.begin();

            Contribution contributionToDelete =
                    entityManager.find(
                            Contribution.class,
                            contribution.getContributionId()
                    );

            if (contributionToDelete == null) {
                throw new RuntimeException(
                        "Contribuição não encontrada."
                );
            }

            entityManager.remove(contributionToDelete);

            transaction.commit();

        } catch (Exception e) {

            if (transaction.isActive()) {
                transaction.rollback();
            }

            throw new RuntimeException(
                    "Erro ao eliminar a contribuição.",
                    e
            );
        }
    }
}
