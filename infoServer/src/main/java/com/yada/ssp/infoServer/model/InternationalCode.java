package com.yada.ssp.infoServer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 国家代码表
 */


@Entity
@Table(name = "T_D_INTERNATIONAL_CODE")
public class InternationalCode {

    @Id
    @Column(nullable = false, length = 2)
    private String internationalCode;
    @Column
    private String codeName;
    @Column
    private String codeEname;

    public String getInternationalCode() {
        return internationalCode;
    }

    public void setInternationalCode(String internationalCode) {
        this.internationalCode = internationalCode;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getCodeEname() {
        return codeEname;
    }

    public void setCodeEname(String codeEname) {
        this.codeEname = codeEname;
    }
}
