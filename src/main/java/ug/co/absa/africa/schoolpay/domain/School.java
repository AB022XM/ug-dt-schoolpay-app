package ug.co.absa.africa.schoolpay.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A School.
 */
@Entity
@Table(name = "school")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class School implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "school_id")
    private String schoolId;

    @Column(name = "school_code")
    private String schoolCode;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "school_transaction_identifier")
    private String schoolTransactionIdentifier;

    @Column(name = "school_bank_identifier")
    private String schoolBankIdentifier;

    @Column(name = "school_address_1")
    private String schoolAddress1;

    @Column(name = "school_address_2")
    private String schoolAddress2;

    @Column(name = "school_address_3")
    private String schoolAddress3;

    @Column(name = "school_address_4")
    private String schoolAddress4;

    @Column(name = "school_address_5")
    private String schoolAddress5;

    @Column(name = "school_address_6")
    private String schoolAddress6;

    @Column(name = "school_address_7")
    private String schoolAddress7;

    @Column(name = "school_contact_1")
    private String schoolContact1;

    @Column(name = "school_contact_2")
    private String schoolContact2;

    @Column(name = "school_contact_3")
    private String schoolContact3;

    @Column(name = "school_contact_4")
    private String schoolContact4;

    @Column(name = "school_contact_5")
    private String schoolContact5;

    @Column(name = "school_contact_6")
    private String schoolContact6;

    @Column(name = "school_contact_7")
    private String schoolContact7;

    @Column(name = "school_account_id")
    private String schoolAccountId;

    @Lob
    @Column(name = "school_image")
    private byte[] schoolImage;

    @Column(name = "school_image_content_type")
    private String schoolImageContentType;

    @Lob
    @Column(name = "school_icon")
    private byte[] schoolIcon;

    @Column(name = "school_icon_content_type")
    private String schoolIconContentType;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "delflg")
    private Boolean delflg;

    @Column(name = "school_primary_color")
    private String schoolPrimaryColor;

    @Column(name = "school_secondary_color")
    private String schoolSecondaryColor;

    @Column(name = "is_allowed_to_transact")
    private String isAllowedToTransact;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public School id(Long id) {
        this.setId(id);
        return this;
    }

    public String getSchoolId() {
        return this.schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public School schoolId(String schoolId) {
        this.setSchoolId(schoolId);
        return this;
    }

    public String getSchoolCode() {
        return this.schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public School schoolCode(String schoolCode) {
        this.setSchoolCode(schoolCode);
        return this;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public School schoolName(String schoolName) {
        this.setSchoolName(schoolName);
        return this;
    }

    public String getSchoolTransactionIdentifier() {
        return this.schoolTransactionIdentifier;
    }

    public void setSchoolTransactionIdentifier(String schoolTransactionIdentifier) {
        this.schoolTransactionIdentifier = schoolTransactionIdentifier;
    }

    public School schoolTransactionIdentifier(String schoolTransactionIdentifier) {
        this.setSchoolTransactionIdentifier(schoolTransactionIdentifier);
        return this;
    }

    public String getSchoolBankIdentifier() {
        return this.schoolBankIdentifier;
    }

    public void setSchoolBankIdentifier(String schoolBankIdentifier) {
        this.schoolBankIdentifier = schoolBankIdentifier;
    }

    public School schoolBankIdentifier(String schoolBankIdentifier) {
        this.setSchoolBankIdentifier(schoolBankIdentifier);
        return this;
    }

    public String getSchoolAddress1() {
        return this.schoolAddress1;
    }

    public void setSchoolAddress1(String schoolAddress1) {
        this.schoolAddress1 = schoolAddress1;
    }

    public School schoolAddress1(String schoolAddress1) {
        this.setSchoolAddress1(schoolAddress1);
        return this;
    }

    public String getSchoolAddress2() {
        return this.schoolAddress2;
    }

    public void setSchoolAddress2(String schoolAddress2) {
        this.schoolAddress2 = schoolAddress2;
    }

    public School schoolAddress2(String schoolAddress2) {
        this.setSchoolAddress2(schoolAddress2);
        return this;
    }

    public String getSchoolAddress3() {
        return this.schoolAddress3;
    }

    public void setSchoolAddress3(String schoolAddress3) {
        this.schoolAddress3 = schoolAddress3;
    }

    public School schoolAddress3(String schoolAddress3) {
        this.setSchoolAddress3(schoolAddress3);
        return this;
    }

    public String getSchoolAddress4() {
        return this.schoolAddress4;
    }

    public void setSchoolAddress4(String schoolAddress4) {
        this.schoolAddress4 = schoolAddress4;
    }

    public School schoolAddress4(String schoolAddress4) {
        this.setSchoolAddress4(schoolAddress4);
        return this;
    }

    public String getSchoolAddress5() {
        return this.schoolAddress5;
    }

    public void setSchoolAddress5(String schoolAddress5) {
        this.schoolAddress5 = schoolAddress5;
    }

    public School schoolAddress5(String schoolAddress5) {
        this.setSchoolAddress5(schoolAddress5);
        return this;
    }

    public String getSchoolAddress6() {
        return this.schoolAddress6;
    }

    public void setSchoolAddress6(String schoolAddress6) {
        this.schoolAddress6 = schoolAddress6;
    }

    public School schoolAddress6(String schoolAddress6) {
        this.setSchoolAddress6(schoolAddress6);
        return this;
    }

    public String getSchoolAddress7() {
        return this.schoolAddress7;
    }

    public void setSchoolAddress7(String schoolAddress7) {
        this.schoolAddress7 = schoolAddress7;
    }

    public School schoolAddress7(String schoolAddress7) {
        this.setSchoolAddress7(schoolAddress7);
        return this;
    }

    public String getSchoolContact1() {
        return this.schoolContact1;
    }

    public void setSchoolContact1(String schoolContact1) {
        this.schoolContact1 = schoolContact1;
    }

    public School schoolContact1(String schoolContact1) {
        this.setSchoolContact1(schoolContact1);
        return this;
    }

    public String getSchoolContact2() {
        return this.schoolContact2;
    }

    public void setSchoolContact2(String schoolContact2) {
        this.schoolContact2 = schoolContact2;
    }

    public School schoolContact2(String schoolContact2) {
        this.setSchoolContact2(schoolContact2);
        return this;
    }

    public String getSchoolContact3() {
        return this.schoolContact3;
    }

    public void setSchoolContact3(String schoolContact3) {
        this.schoolContact3 = schoolContact3;
    }

    public School schoolContact3(String schoolContact3) {
        this.setSchoolContact3(schoolContact3);
        return this;
    }

    public String getSchoolContact4() {
        return this.schoolContact4;
    }

    public void setSchoolContact4(String schoolContact4) {
        this.schoolContact4 = schoolContact4;
    }

    public School schoolContact4(String schoolContact4) {
        this.setSchoolContact4(schoolContact4);
        return this;
    }

    public String getSchoolContact5() {
        return this.schoolContact5;
    }

    public void setSchoolContact5(String schoolContact5) {
        this.schoolContact5 = schoolContact5;
    }

    public School schoolContact5(String schoolContact5) {
        this.setSchoolContact5(schoolContact5);
        return this;
    }

    public String getSchoolContact6() {
        return this.schoolContact6;
    }

    public void setSchoolContact6(String schoolContact6) {
        this.schoolContact6 = schoolContact6;
    }

    public School schoolContact6(String schoolContact6) {
        this.setSchoolContact6(schoolContact6);
        return this;
    }

    public String getSchoolContact7() {
        return this.schoolContact7;
    }

    public void setSchoolContact7(String schoolContact7) {
        this.schoolContact7 = schoolContact7;
    }

    public School schoolContact7(String schoolContact7) {
        this.setSchoolContact7(schoolContact7);
        return this;
    }

    public String getSchoolAccountId() {
        return this.schoolAccountId;
    }

    public void setSchoolAccountId(String schoolAccountId) {
        this.schoolAccountId = schoolAccountId;
    }

    public School schoolAccountId(String schoolAccountId) {
        this.setSchoolAccountId(schoolAccountId);
        return this;
    }

    public byte[] getSchoolImage() {
        return this.schoolImage;
    }

    public void setSchoolImage(byte[] schoolImage) {
        this.schoolImage = schoolImage;
    }

    public School schoolImage(byte[] schoolImage) {
        this.setSchoolImage(schoolImage);
        return this;
    }

    public String getSchoolImageContentType() {
        return this.schoolImageContentType;
    }

    public void setSchoolImageContentType(String schoolImageContentType) {
        this.schoolImageContentType = schoolImageContentType;
    }

    public School schoolImageContentType(String schoolImageContentType) {
        this.schoolImageContentType = schoolImageContentType;
        return this;
    }

    public byte[] getSchoolIcon() {
        return this.schoolIcon;
    }

    public void setSchoolIcon(byte[] schoolIcon) {
        this.schoolIcon = schoolIcon;
    }

    public School schoolIcon(byte[] schoolIcon) {
        this.setSchoolIcon(schoolIcon);
        return this;
    }

    public String getSchoolIconContentType() {
        return this.schoolIconContentType;
    }

    public void setSchoolIconContentType(String schoolIconContentType) {
        this.schoolIconContentType = schoolIconContentType;
    }

    public School schoolIconContentType(String schoolIconContentType) {
        this.schoolIconContentType = schoolIconContentType;
        return this;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public School isActive(Boolean isActive) {
        this.setIsActive(isActive);
        return this;
    }

    public Boolean getDelflg() {
        return this.delflg;
    }

    public void setDelflg(Boolean delflg) {
        this.delflg = delflg;
    }

    public School delflg(Boolean delflg) {
        this.setDelflg(delflg);
        return this;
    }

    public String getSchoolPrimaryColor() {
        return this.schoolPrimaryColor;
    }

    public void setSchoolPrimaryColor(String schoolPrimaryColor) {
        this.schoolPrimaryColor = schoolPrimaryColor;
    }

    public School schoolPrimaryColor(String schoolPrimaryColor) {
        this.setSchoolPrimaryColor(schoolPrimaryColor);
        return this;
    }

    public String getSchoolSecondaryColor() {
        return this.schoolSecondaryColor;
    }

    public void setSchoolSecondaryColor(String schoolSecondaryColor) {
        this.schoolSecondaryColor = schoolSecondaryColor;
    }

    public School schoolSecondaryColor(String schoolSecondaryColor) {
        this.setSchoolSecondaryColor(schoolSecondaryColor);
        return this;
    }

    public String getIsAllowedToTransact() {
        return this.isAllowedToTransact;
    }

    public void setIsAllowedToTransact(String isAllowedToTransact) {
        this.isAllowedToTransact = isAllowedToTransact;
    }

    public School isAllowedToTransact(String isAllowedToTransact) {
        this.setIsAllowedToTransact(isAllowedToTransact);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof School)) {
            return false;
        }
        return id != null && id.equals(((School) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "School{" +
            "id=" + getId() +
            ", schoolId='" + getSchoolId() + "'" +
            ", schoolCode='" + getSchoolCode() + "'" +
            ", schoolName='" + getSchoolName() + "'" +
            ", schoolTransactionIdentifier='" + getSchoolTransactionIdentifier() + "'" +
            ", schoolBankIdentifier='" + getSchoolBankIdentifier() + "'" +
            ", schoolAddress1='" + getSchoolAddress1() + "'" +
            ", schoolAddress2='" + getSchoolAddress2() + "'" +
            ", schoolAddress3='" + getSchoolAddress3() + "'" +
            ", schoolAddress4='" + getSchoolAddress4() + "'" +
            ", schoolAddress5='" + getSchoolAddress5() + "'" +
            ", schoolAddress6='" + getSchoolAddress6() + "'" +
            ", schoolAddress7='" + getSchoolAddress7() + "'" +
            ", schoolContact1='" + getSchoolContact1() + "'" +
            ", schoolContact2='" + getSchoolContact2() + "'" +
            ", schoolContact3='" + getSchoolContact3() + "'" +
            ", schoolContact4='" + getSchoolContact4() + "'" +
            ", schoolContact5='" + getSchoolContact5() + "'" +
            ", schoolContact6='" + getSchoolContact6() + "'" +
            ", schoolContact7='" + getSchoolContact7() + "'" +
            ", schoolAccountId='" + getSchoolAccountId() + "'" +
            ", schoolImage='" + getSchoolImage() + "'" +
            ", schoolImageContentType='" + getSchoolImageContentType() + "'" +
            ", schoolIcon='" + getSchoolIcon() + "'" +
            ", schoolIconContentType='" + getSchoolIconContentType() + "'" +
            ", isActive='" + getIsActive() + "'" +
            ", delflg='" + getDelflg() + "'" +
            ", schoolPrimaryColor='" + getSchoolPrimaryColor() + "'" +
            ", schoolSecondaryColor='" + getSchoolSecondaryColor() + "'" +
            ", isAllowedToTransact='" + getIsAllowedToTransact() + "'" +
            "}";
    }
}
