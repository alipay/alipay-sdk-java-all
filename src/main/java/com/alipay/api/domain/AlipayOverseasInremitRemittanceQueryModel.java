package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇入汇款业务中，提供给商户的接口，商户可以根据支付宝交易号，对已经发生的汇款进行查询
 *
 * @author auto create
 * @since 1.0, 2016-02-18 11:00:56
 */
public class AlipayOverseasInremitRemittanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1313632331249442627L;

	/**
	 * 支付宝转账单交易号 transferNo
	 */
	@ApiField("alipay_trans_id")
	private String alipayTransId;

	/**
	 * 商户partner_id
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getAlipayTransId() {
		return this.alipayTransId;
	}
	public void setAlipayTransId(String alipayTransId) {
		this.alipayTransId = alipayTransId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
