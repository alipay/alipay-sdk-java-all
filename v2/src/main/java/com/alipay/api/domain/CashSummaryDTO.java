package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款进度查询结果
 *
 * @author auto create
 * @since 1.0, 2023-08-25 14:54:45
 */
public class CashSummaryDTO extends AlipayObject {

	private static final long serialVersionUID = 8452237232657118618L;

	/**
	 * 业务身份
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务单据号
	 */
	@ApiField("biz_document_no")
	private String bizDocumentNo;

	/**
	 * 付款失败金额(单位：各币种的"元")
	 */
	@ApiField("pay_fail_amount")
	private String payFailAmount;

	/**
	 * 付款成功金额(单位：各币种的"元")
	 */
	@ApiField("pay_success_amount")
	private String paySuccessAmount;

	/**
	 * 关联单据号
	 */
	@ApiField("related_document_no")
	private String relatedDocumentNo;

	/**
	 * 总金额(单位：各币种的"元")
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizDocumentNo() {
		return this.bizDocumentNo;
	}
	public void setBizDocumentNo(String bizDocumentNo) {
		this.bizDocumentNo = bizDocumentNo;
	}

	public String getPayFailAmount() {
		return this.payFailAmount;
	}
	public void setPayFailAmount(String payFailAmount) {
		this.payFailAmount = payFailAmount;
	}

	public String getPaySuccessAmount() {
		return this.paySuccessAmount;
	}
	public void setPaySuccessAmount(String paySuccessAmount) {
		this.paySuccessAmount = paySuccessAmount;
	}

	public String getRelatedDocumentNo() {
		return this.relatedDocumentNo;
	}
	public void setRelatedDocumentNo(String relatedDocumentNo) {
		this.relatedDocumentNo = relatedDocumentNo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
