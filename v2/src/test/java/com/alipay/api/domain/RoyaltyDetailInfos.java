package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修复分账金额amount的类型，原来Number类型不合理，导致商户无法通过sdk集成，需改成Price类型
 *
 * @author auto create
 * @since 1.0, 2019-04-02 16:24:39
 */
public class RoyaltyDetailInfos extends AlipayObject {

    private static final long serialVersionUID = 3644328868579924537L;

    /**
     * 分账的金额，单位为元
     */
    @ApiField("amount")
    private String amount;

    /**
     * 分账的比例，值为20代表按20%的比例分账
     */
    @ApiField("amount_percentage")
    private String amountPercentage;

    /**
     * 分账批次号 分账批次号。 目前需要和转入账号类型为bankIndex配合使用。
     */
    @ApiField("batch_no")
    private String batchNo;

    /**
     * 分账描述信息
     */
    @ApiField("desc")
    private String desc;

    /**
     * 商户分账的外部关联号，用于关联到每一笔分账信息，商户需保证其唯一性。 如果为空，该值则默认为“商户网站唯一订单号+分账序列号”
     */
    @ApiField("out_relation_id")
    private String outRelationId;

    /**
     * 分账序列号，表示分账执行的顺序，必须为正整数
     */
    @ApiField("serial_no")
    private Long serialNo;

    /**
     * 如果转入账号类型为userId，本参数为接受分账金额的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。 &#61548;	如果转入账号类型为bankIndex，本参数为28位的银行编号（商户和支付宝签约时确定）。
     * 如果转入账号类型为storeId，本参数为商户的门店ID。
     */
    @ApiField("trans_in")
    private String transIn;

    /**
     * 接受分账金额的账户类型： &#61548;	userId：支付宝账号对应的支付宝唯一用户号。 &#61548;	bankIndex：分账到银行账户的银行编号。目前暂时只支持分账到一个银行编号。 storeId：分账到门店对应的银行卡编号。
     * 默认值为userId。
     */
    @ApiField("trans_in_type")
    private String transInType;

    /**
     * 如果转出账号类型为userId，本参数为要分账的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
     */
    @ApiField("trans_out")
    private String transOut;

    /**
     * 要分账的账户类型。 目前只支持userId：支付宝账号对应的支付宝唯一用户号。 默认值为userId。
     */
    @ApiField("trans_out_type")
    private String transOutType;

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmountPercentage() {
        return this.amountPercentage;
    }

    public void setAmountPercentage(String amountPercentage) {
        this.amountPercentage = amountPercentage;
    }

    public String getBatchNo() {
        return this.batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getOutRelationId() {
        return this.outRelationId;
    }

    public void setOutRelationId(String outRelationId) {
        this.outRelationId = outRelationId;
    }

    public Long getSerialNo() {
        return this.serialNo;
    }

    public void setSerialNo(Long serialNo) {
        this.serialNo = serialNo;
    }

    public String getTransIn() {
        return this.transIn;
    }

    public void setTransIn(String transIn) {
        this.transIn = transIn;
    }

    public String getTransInType() {
        return this.transInType;
    }

    public void setTransInType(String transInType) {
        this.transInType = transInType;
    }

    public String getTransOut() {
        return this.transOut;
    }

    public void setTransOut(String transOut) {
        this.transOut = transOut;
    }

    public String getTransOutType() {
        return this.transOutType;
    }

    public void setTransOutType(String transOutType) {
        this.transOutType = transOutType;
    }

}
