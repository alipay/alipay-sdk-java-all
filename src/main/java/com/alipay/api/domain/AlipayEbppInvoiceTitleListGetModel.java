package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁电子发票平台用户发票抬头列表获取
 *
 * @author auto create
 * @since 1.0, 2018-07-02 10:28:56
 */
public class AlipayEbppInvoiceTitleListGetModel extends AlipayObject {

	private static final long serialVersionUID = 3331669772224621572L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
