package com.yada.ssp.infoServer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * 商户附加信息
 */
@Entity
@Table(name = "T_B_MERCHANT_EXTRA")
public class MerchantExtra {

    //商户附加信息ID
    @Id
    @Column(nullable = false)
    private String merchantId;

    //币种
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ccyType", referencedColumnName = "ccyType")
    private CcyType ccyType;

    //国家代码
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "internationalCode", referencedColumnName = "internationalCode")
    private InternationalCode internationalCode;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public CcyType getCcyType() {
        return ccyType;
    }

    public void setCcyType(CcyType ccyType) {
        this.ccyType = ccyType;
    }

    public InternationalCode getInternationalCode() {
        return internationalCode;
    }

    public void setInternationalCode(InternationalCode internationalCode) {
        this.internationalCode = internationalCode;
    }
}
