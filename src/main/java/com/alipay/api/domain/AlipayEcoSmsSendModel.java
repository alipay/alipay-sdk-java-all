package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短信内容发送对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 18:14:35
 */
public class AlipayEcoSmsSendModel extends AlipayObject {

	private static final long serialVersionUID = 5651235689832525262L;

	/**
	 * 发送内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 待收信人手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
