package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询服务费信息
 *
 * @author auto create
 * @since 1.0, 2024-06-24 21:24:15
 */
public class AlipayCommerceEcChargeBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2611419427289237663L;

	/**
	 * 企业码服务费单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("pay_no")
	private String payNo;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getPayNo() {
		return this.payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

}
