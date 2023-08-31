package ug.co.absa.africa.schoolpay.domain;

import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A SchoolAccountNumber.
 */
@Entity
@Table(name = "school_account_number")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class SchoolAccountNumber implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "account_id")
    private String accountId;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "school_id")
    private String schoolId;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "delflg")
    private Boolean delflg;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SchoolAccountNumber id(Long id) {
        this.setId(id);
        return this;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public SchoolAccountNumber accountId(String accountId) {
        this.setAccountId(accountId);
        return this;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public SchoolAccountNumber accountName(String accountName) {
        this.setAccountName(accountName);
        return this;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public SchoolAccountNumber accountNumber(String accountNumber) {
        this.setAccountNumber(accountNumber);
        return this;
    }

    public String getSchoolId() {
        return this.schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public SchoolAccountNumber schoolId(String schoolId) {
        this.setSchoolId(schoolId);
        return this;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public SchoolAccountNumber isActive(Boolean isActive) {
        this.setIsActive(isActive);
        return this;
    }

    public Boolean getDelflg() {
        return this.delflg;
    }

    public void setDelflg(Boolean delflg) {
        this.delflg = delflg;
    }

    public SchoolAccountNumber delflg(Boolean delflg) {
        this.setDelflg(delflg);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchoolAccountNumber)) {
            return false;
        }
        return id != null && id.equals(((SchoolAccountNumber) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SchoolAccountNumber{" +
            "id=" + getId() +
            ", accountId='" + getAccountId() + "'" +
            ", accountName='" + getAccountName() + "'" +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", schoolId='" + getSchoolId() + "'" +
            ", isActive='" + getIsActive() + "'" +
            ", delflg='" + getDelflg() + "'" +
            "}";
    }
}
