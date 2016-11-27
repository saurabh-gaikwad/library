/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinelibrary;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "stulib", catalog = "lib", schema = "")
@NamedQueries({
    @NamedQuery(name = "Stulib.findAll", query = "SELECT s FROM Stulib s"),
    @NamedQuery(name = "Stulib.findById", query = "SELECT s FROM Stulib s WHERE s.id = :id"),
    @NamedQuery(name = "Stulib.findByBookname", query = "SELECT s FROM Stulib s WHERE s.bookname = :bookname"),
    @NamedQuery(name = "Stulib.findByStuid", query = "SELECT s FROM Stulib s WHERE s.stuid = :stuid"),
    @NamedQuery(name = "Stulib.findByStucontact", query = "SELECT s FROM Stulib s WHERE s.stucontact = :stucontact"),
    @NamedQuery(name = "Stulib.findByIssue", query = "SELECT s FROM Stulib s WHERE s.issue = :issue"),
    @NamedQuery(name = "Stulib.findByCopy", query = "SELECT s FROM Stulib s WHERE s.copy = :copy")})
public class Stulib implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "bookname")
    private String bookname;
    @Basic(optional = false)
    @Column(name = "stuid")
    private int stuid;
    @Column(name = "stucontact")
    private Integer stucontact;
    @Column(name = "issue")
    private String issue;
    @Column(name = "copy")
    private Integer copy;

    public Stulib() {
    }

    public Stulib(Integer id) {
        this.id = id;
    }

    public Stulib(Integer id, int stuid) {
        this.id = id;
        this.stuid = stuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        String oldBookname = this.bookname;
        this.bookname = bookname;
        changeSupport.firePropertyChange("bookname", oldBookname, bookname);
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        int oldStuid = this.stuid;
        this.stuid = stuid;
        changeSupport.firePropertyChange("stuid", oldStuid, stuid);
    }

    public Integer getStucontact() {
        return stucontact;
    }

    public void setStucontact(Integer stucontact) {
        Integer oldStucontact = this.stucontact;
        this.stucontact = stucontact;
        changeSupport.firePropertyChange("stucontact", oldStucontact, stucontact);
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        String oldIssue = this.issue;
        this.issue = issue;
        changeSupport.firePropertyChange("issue", oldIssue, issue);
    }

    public Integer getCopy() {
        return copy;
    }

    public void setCopy(Integer copy) {
        Integer oldCopy = this.copy;
        this.copy = copy;
        changeSupport.firePropertyChange("copy", oldCopy, copy);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stulib)) {
            return false;
        }
        Stulib other = (Stulib) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "onlinelibrary.Stulib[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
