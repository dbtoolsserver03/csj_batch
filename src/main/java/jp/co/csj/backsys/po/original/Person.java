package jp.co.csj.backsys.po.original;

import java.util.Date;

/**
 * person()
 * @author Think 
 */
public class Person {
    /**
     *  id
     */
    private Integer id;

    /**
     *  name
     */
    private String name;

    /**
     *  updatetime
     */
    private Date updatetime;

    /**
     * 
     * @author Think
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @author Think
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @author Think
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @author Think
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @author Think
     * @return updatetime 
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 
     * @author Think
     * @param updatetime 
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     *
     * @mbg.generated 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", updatetime=").append(updatetime);
        sb.append("]");
        return sb.toString();
    }
}