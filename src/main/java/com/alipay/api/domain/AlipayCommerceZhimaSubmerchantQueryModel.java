package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO查询二级商户进件结果
 *
 * @author auto create
 * @since 1.0, 2022-09-13 10:55:12
 */
public class AlipayCommerceZhimaSubmerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7164986167654584626L;

	/**
	 * 结算支付宝账号的登陆号
	 */
	@ApiField("settle_alipay_login_id")
	private String settleAlipayLoginId;

	public String getSettleAlipayLoginId() {
		return this.settleAlipayLoginId;
	}
	public void setSettleAlipayLoginId(String settleAlipayLoginId) {
		this.settleAlipayLoginId = settleAlipayLoginId;
	}

}
