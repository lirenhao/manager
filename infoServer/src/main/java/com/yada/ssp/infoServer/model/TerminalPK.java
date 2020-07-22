package com.yada.ssp.infoServer.model;

import java.io.Serializable;

/**
 * 终端表主键
 */
public class TerminalPK implements Serializable {

    //终端号
    private String terminalId;
    //商户号
    private String merchant;

    public TerminalPK() {
    }

    public TerminalPK(String terminalId, String merchantId) {
        this.terminalId = terminalId;
        this.merchant = merchantId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }
}
