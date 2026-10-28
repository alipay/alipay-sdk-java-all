package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码发票换开申请
 *
 * @author auto create
 * @since 1.0, 2026-10-20 16:12:58
 */
public class AlipayEbppInvoiceEnterpriseinvoiceReissueCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6272454577986863581L;

	/**
	 * 支付宝账单号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 换开的新税号
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 换开的新抬头
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 外部申请ID，用于申请幂等，调用方保证唯一性
	 */
	@ApiField("outer_apply_id")
	private String outerApplyId;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerTaxNo() {
		return this.buyerTaxNo;
	}
	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOuterApplyId() {
		return this.outerApplyId;
	}
	public void setOuterApplyId(String outerApplyId) {
		this.outerApplyId = outerApplyId;
	}

}
