package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应收开票申请(根据账单申请)
 *
 * @author auto create
 * @since 1.0, 2021-10-11 11:26:00
 */
public class AlipayBossFncInvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7768175235552626287L;

	/**
	 * 调用方身份识别标记(应用名称) 与业务单据号联合唯一
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务单据号，业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 开票总金额，开票金额不能为空，开票金额不能小于等于0
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 申请开票类型，01：专票；02：普票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 需开票的应收月账单号
	 */
	@ApiListField("mthtly_bill_nos")
	@ApiField("string")
	private List<String> mthtlyBillNos;

	/**
	 * 申请人的uid号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 01主站，02芝麻，03金融云
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<String> getMthtlyBillNos() {
		return this.mthtlyBillNos;
	}
	public void setMthtlyBillNos(List<String> mthtlyBillNos) {
		this.mthtlyBillNos = mthtlyBillNos;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

}
