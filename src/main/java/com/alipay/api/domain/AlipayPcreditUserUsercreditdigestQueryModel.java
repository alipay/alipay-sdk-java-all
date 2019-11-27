package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 端外查询花小呗信息
 *
 * @author auto create
 * @since 1.0, 2017-10-11 15:30:53
 */
public class AlipayPcreditUserUsercreditdigestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8859669166648666831L;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
