/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.nano_loan_dashboard.dto.res;

/**
 *
 * @author fazlerabbikhan
 */
public class NanoLoanDashboardRes {

    private String outCode;
    private String outMessage;

    private String tREQ;
    private String tSUC_REQ;
    private String tFAIL_REQ;
    private String tDSB_REQ;

    private String tREQ_AMT;
    private String tDSB_AMT;
    private String tDSB_DBT_AMT;
    private String tDSB_CH_AMT;
    private String tDSB_VAT_AMT;

    private String fV_REQ;
    private String fV_AUTO;
    private String fV_MANUAL;
    private String fV_PENDING;

    private String cIB_REQ;
    private String cIB_VERIFIED;
    private String cIB_CL;
    private String cIB_UCL;
    private String cIB_PENDING;

    public String getOutCode() {
        return outCode;
    }

    public void setOutCode(String outCode) {
        this.outCode = outCode;
    }

    public String getOutMessage() {
        return outMessage;
    }

    public void setOutMessage(String outMessage) {
        this.outMessage = outMessage;
    }

    public String gettREQ() {
        return tREQ;
    }

    public void settREQ(String tREQ) {
        this.tREQ = tREQ;
    }

    public String gettSUC_REQ() {
        return tSUC_REQ;
    }

    public void settSUC_REQ(String tSUC_REQ) {
        this.tSUC_REQ = tSUC_REQ;
    }

    public String gettFAIL_REQ() {
        return tFAIL_REQ;
    }

    public void settFAIL_REQ(String tFAIL_REQ) {
        this.tFAIL_REQ = tFAIL_REQ;
    }

    public String gettDSB_REQ() {
        return tDSB_REQ;
    }

    public void settDSB_REQ(String tDSB_REQ) {
        this.tDSB_REQ = tDSB_REQ;
    }

    public String gettREQ_AMT() {
        return tREQ_AMT;
    }

    public void settREQ_AMT(String tREQ_AMT) {
        this.tREQ_AMT = tREQ_AMT;
    }

    public String gettDSB_AMT() {
        return tDSB_AMT;
    }

    public void settDSB_AMT(String tDSB_AMT) {
        this.tDSB_AMT = tDSB_AMT;
    }

    public String gettDSB_DBT_AMT() {
        return tDSB_DBT_AMT;
    }

    public void settDSB_DBT_AMT(String tDSB_DBT_AMT) {
        this.tDSB_DBT_AMT = tDSB_DBT_AMT;
    }

    public String gettDSB_CH_AMT() {
        return tDSB_CH_AMT;
    }

    public void settDSB_CH_AMT(String tDSB_CH_AMT) {
        this.tDSB_CH_AMT = tDSB_CH_AMT;
    }

    public String gettDSB_VAT_AMT() {
        return tDSB_VAT_AMT;
    }

    public void settDSB_VAT_AMT(String tDSB_VAT_AMT) {
        this.tDSB_VAT_AMT = tDSB_VAT_AMT;
    }

    public String getfV_REQ() {
        return fV_REQ;
    }

    public void setfV_REQ(String fV_REQ) {
        this.fV_REQ = fV_REQ;
    }

    public String getfV_AUTO() {
        return fV_AUTO;
    }

    public void setfV_AUTO(String fV_AUTO) {
        this.fV_AUTO = fV_AUTO;
    }

    public String getfV_MANUAL() {
        return fV_MANUAL;
    }

    public void setfV_MANUAL(String fV_MANUAL) {
        this.fV_MANUAL = fV_MANUAL;
    }

    public String getfV_PENDING() {
        return fV_PENDING;
    }

    public void setfV_PENDING(String fV_PENDING) {
        this.fV_PENDING = fV_PENDING;
    }

    public String getcIB_REQ() {
        return cIB_REQ;
    }

    public void setcIB_REQ(String cIB_REQ) {
        this.cIB_REQ = cIB_REQ;
    }

    public String getcIB_VERIFIED() {
        return cIB_VERIFIED;
    }

    public void setcIB_VERIFIED(String cIB_VERIFIED) {
        this.cIB_VERIFIED = cIB_VERIFIED;
    }

    public String getcIB_CL() {
        return cIB_CL;
    }

    public void setcIB_CL(String cIB_CL) {
        this.cIB_CL = cIB_CL;
    }

    public String getcIB_UCL() {
        return cIB_UCL;
    }

    public void setcIB_UCL(String cIB_UCL) {
        this.cIB_UCL = cIB_UCL;
    }

    public String getcIB_PENDING() {
        return cIB_PENDING;
    }

    public void setcIB_PENDING(String cIB_PENDING) {
        this.cIB_PENDING = cIB_PENDING;
    }

    @Override
    public String toString() {
        return "NanoLoanDashboardRes{" + "outCode=" + outCode + ", outMessage=" + outMessage + ", tREQ=" + tREQ + ", tSUC_REQ=" + tSUC_REQ + ", tFAIL_REQ=" + tFAIL_REQ + ", tDSB_REQ=" + tDSB_REQ + ", tREQ_AMT=" + tREQ_AMT + ", tDSB_AMT=" + tDSB_AMT + ", tDSB_DBT_AMT=" + tDSB_DBT_AMT + ", tDSB_CH_AMT=" + tDSB_CH_AMT + ", tDSB_VAT_AMT=" + tDSB_VAT_AMT + ", fV_REQ=" + fV_REQ + ", fV_AUTO=" + fV_AUTO + ", fV_MANUAL=" + fV_MANUAL + ", fV_PENDING=" + fV_PENDING + ", cIB_REQ=" + cIB_REQ + ", cIB_VERIFIED=" + cIB_VERIFIED + ", cIB_CL=" + cIB_CL + ", cIB_UCL=" + cIB_UCL + ", cIB_PENDING=" + cIB_PENDING + '}';
    }

    
    
}
