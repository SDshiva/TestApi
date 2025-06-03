/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.utility_bills_wasit.dto.res;

/**
 *
 * @author fazlerabbikhan
 */
public class WasitUtilityBillRes {
    private String  date, outCode, outMessage, Amount, billName;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

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

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    @Override
    public String toString() {
        return "WasitUtilityBIllRes{" + "date=" + date + ", outCode=" + outCode + ", outMessage=" + outMessage + ", Amount=" + Amount + ", billName=" + billName + '}';
    }
    
}
