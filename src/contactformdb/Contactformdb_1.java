/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactformdb;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author James
 */
@Entity
@Table(name = "CONTACTFORMDB", catalog = "", schema = "TEST")
@NamedQueries({
    @NamedQuery(name = "Contactformdb_1.findAll", query = "SELECT c FROM Contactformdb_1 c"),
    @NamedQuery(name = "Contactformdb_1.findById", query = "SELECT c FROM Contactformdb_1 c WHERE c.id = :id"),
    @NamedQuery(name = "Contactformdb_1.findByLastName", query = "SELECT c FROM Contactformdb_1 c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Contactformdb_1.findByFirstName", query = "SELECT c FROM Contactformdb_1 c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Contactformdb_1.findByAge", query = "SELECT c FROM Contactformdb_1 c WHERE c.age = :age"),
    @NamedQuery(name = "Contactformdb_1.findByEmailAddress", query = "SELECT c FROM Contactformdb_1 c WHERE c.emailAddress = :emailAddress"),
    @NamedQuery(name = "Contactformdb_1.findByCellNumber", query = "SELECT c FROM Contactformdb_1 c WHERE c.cellNumber = :cellNumber")})
public class Contactformdb_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "CELL_NUMBER")
    private String cellNumber;

    public Contactformdb_1() {
    }

    public Contactformdb_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        Integer oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        String oldEmailAddress = this.emailAddress;
        this.emailAddress = emailAddress;
        changeSupport.firePropertyChange("emailAddress", oldEmailAddress, emailAddress);
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        String oldCellNumber = this.cellNumber;
        this.cellNumber = cellNumber;
        changeSupport.firePropertyChange("cellNumber", oldCellNumber, cellNumber);
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
        if (!(object instanceof Contactformdb_1)) {
            return false;
        }
        Contactformdb_1 other = (Contactformdb_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "contactformdb.Contactformdb_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
