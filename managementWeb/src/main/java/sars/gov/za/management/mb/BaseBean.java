/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sars.gov.za.management.mb;

;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 *
 * @author S2028873
 */
public class BaseBean<T> extends SpringBeanAutowiringSupport {

    private List<String> errorCollectMag = new ArrayList<>();
    private boolean list;
    private boolean add;
    private boolean update;
    private boolean search;
    private List<T> collections = new ArrayList<>();
    
    T entity;
    private String comfirmMassage;
    private String panelTitleName;
    
    final Logger LOG = Logger.getLogger(BaseBean.class.getName());

    public List<String> getErrorCollectMag() {
        return errorCollectMag;
    }

    public void setErrorCollectMag(List<String> errorCollectMag) {
        this.errorCollectMag = errorCollectMag;
    }

    public boolean isList() {
        return list;
    }

    public void setList(boolean list) {
        this.list = list;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isSearch() {
        return search;
    }

    public void setSearch(boolean search) {
        this.search = search;
    }

    public List<T> getCollections() {
        return collections;
    }

    public void setCollections(List<T> collections) {
        this.collections = collections;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public String getComfirmMassage() {
        return comfirmMassage;
    }

    public void setComfirmMassage(String comfirmMassage) {
        this.comfirmMassage = comfirmMassage;
    }

    public String getPanelTitleName() {
        return panelTitleName;
    }

    public void setPanelTitleName(String panelTitleName) {
        this.panelTitleName = panelTitleName;
    }
    
}
