package service;

import dao.ContributionDao;
import model.Contribution;
import java.util.ArrayList;

public class ContributionService {
    private final ContributionDao contributionDao;

    public ContributionService(ContributionDao contributionDao) {
        this.contributionDao = contributionDao;
    }
    public void createContribution(Contribution contribution) {

        if (contribution == null) {
            throw new IllegalArgumentException(
                    "A contribuicao nao pode ser nula."
            );
        }

        if (contribution.getMember() == null) {
            throw new IllegalArgumentException(
                    "O membro e obrigatorio."
            );
        }

        if (contribution.getGroup() == null) {
            throw new IllegalArgumentException(
                    "O grupo e obrigatorio."
            );
        }

        if (contribution.getCycle() == null) {
            throw new IllegalArgumentException(
                    "O ciclo e obrigatorio."
            );
        }

        if (contribution.getAmount() == null ||
                contribution.getAmount().signum() <= 0) {

            throw new IllegalArgumentException(
                    "O valor da contribuicao deve ser maior que zero."
            );
        }

        if (contribution.getPaymentDate() == null) {
            throw new IllegalArgumentException(
                    "A data de pagamento e obrigatoria."
            );
        }

        if (contribution.getPaymentMethod() == null) {
            throw new IllegalArgumentException(
                    "O metodo de pagamento e obrigatorio."
            );
        }

        if (contribution.getContributionStatus() == null) {
            throw new IllegalArgumentException(
                    "O estado da contribuicao e obrigatorio."
            );
        }

        contributionDao.save(contribution);
    }

    public Contribution findContributionById(Long contributionId) {

        if (contributionId == null || contributionId <= 0) {
            throw new IllegalArgumentException(
                    "ID da contribuicao invalido."
            );
        }

        Contribution contribution =
                contributionDao.findById(contributionId);

        if (contribution == null) {
            throw new IllegalArgumentException(
                    "Contribuicao nao encontrada."
            );
        }

        return contribution;
    }


    public ArrayList<Contribution> listContributions() {

        return contributionDao.findAll();
    }


    public void updateContribution(Contribution contribution) {

        if (contribution == null) {
            throw new IllegalArgumentException(
                    "A contribuicao nao pode ser nula."
            );
        }

        if (contribution.getContributionId() == null ||
                contribution.getContributionId() <= 0) {

            throw new IllegalArgumentException(
                    "ID da contribuicao invalido."
            );
        }

        if (contribution.getMember() == null) {
            throw new IllegalArgumentException(
                    "O membro e obrigatorio."
            );
        }

        if (contribution.getGroup() == null) {
            throw new IllegalArgumentException(
                    "O grupo e obrigatorio."
            );
        }

        if (contribution.getCycle() == null) {
            throw new IllegalArgumentException(
                    "O ciclo e obrigatorio."
            );
        }

        if (contribution.getAmount() == null ||
                contribution.getAmount().signum() <= 0) {

            throw new IllegalArgumentException(
                    "O valor da contribuicao deve ser maior que zero."
            );
        }

        if (contribution.getPaymentDate() == null) {
            throw new IllegalArgumentException(
                    "A data de pagamento e obrigatoria."
            );
        }

        if (contribution.getPaymentMethod() == null) {
            throw new IllegalArgumentException(
                    "O metodo de pagamento e obrigatorio."
            );
        }

        if (contribution.getContributionStatus() == null) {
            throw new IllegalArgumentException(
                    "O estado da contribuicao é obrigatorio."
            );
        }


        findContributionById(
                contribution.getContributionId()
        );

        contributionDao.update(contribution);
    }


    public void deleteContribution(Long contributionId) {

        Contribution contribution =
                findContributionById(contributionId);

        contributionDao.delete(contribution);
    }
}

