package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约扩展内容
 *
 * @author auto create
 * @since 1.0, 2023-11-20 13:42:11
 */
public class SignContentParams extends AlipayObject {

	private static final long serialVersionUID = 3652965737376651737L;

	/**
	 * 商户侧用户唯一id，用于记录协议签约外部主体
	 */
	@ApiField("out_user_id")
	private String outUserId;

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

}
