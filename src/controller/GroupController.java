package controller;

import dao.GroupDao;
import jakarta.persistence.EntityManager;
import model.Group;

import java.util.List;

public class GroupController {

    private List<Group> grupos;
    private GroupDao groupDao;


    public GroupController() {
        //this.groupDao = new GroupDao();
        this.grupos = groupDao.carregarGrupos();

    }

    public void createGroup(Group g){

        grupos.add(g);
        groupDao.save(grupos);

    }

    public boolean deleteGroup(Long id){

        Group g = groupDao.findById(Long id);

        if (g != null){
            grupos.remove(g);
            groupDao.save(grupos);
            return true;
        }
        return false;
    }

    public List<Group> listarGrupos(){
        return grupos;
    }

    public boolean editarGrupos(Long id, Group novo ){

        for (int i = 0; i < grupos.size(); i++){
            if (grupos.get(i).getGroupId() == id){
               grupos.set(i, novo);
               groupDao.save(novo);
               return true;
            }
        }
        return false;
    }

}
