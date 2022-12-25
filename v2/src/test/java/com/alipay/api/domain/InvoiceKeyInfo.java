package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子发票开票关键信息
 *
 * @author auto create
 * @since 1.0, 2017-06-06 18:11:55
 */
public class InvoiceKeyInfo extends AlipayObject {

    private static final long serialVersionUID = 5196432534866526497L;

    /**
     * 开票商户名称：商户品牌简称|商户门店简称
     */
    @ApiField("invoice_merchant_name")
    private String invoiceMerchantName;

    /**
     * 该交易是否支持开票
     */
    @ApiField("is_support_invoice")
    private Boolean isSupportInvoice;

    /**
     * 税号
     */
    @ApiField("tax_num")
    private String taxNum;

    public String getInvoiceMerchantName() {
        return this.invoiceMerchantName;
    }

    public void setInvoiceMerchantName(String invoiceMerchantName) {
        this.invoiceMerchantName = invoiceMerchantName;
    }

    public Boolean getIsSupportInvoice() {
        return this.isSupportInvoice;
    }

    public void setIsSupportInvoice(Boolean isSupportInvoice) {
        this.isSupportInvoice = isSupportInvoice;
    }

    public String getTaxNum() {
        return this.taxNum;
    }

    public void setTaxNum(String taxNum) {
        this.taxNum = taxNum;
    }

}
