package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO申请二级商户进件
 *
 * @author auto create
 * @since 1.0, 2022-09-28 14:01:18
 */
public class AlipayCommerceZhimaSubmerchantSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6551439957254374685L;

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
