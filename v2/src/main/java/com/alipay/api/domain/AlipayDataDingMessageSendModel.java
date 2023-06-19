package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企迈钉钉通知对外接口
 *
 * @author auto create
 * @since 1.0, 2019-10-17 19:21:33
 */
public class AlipayDataDingMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 4332881663549921844L;

	/**
	 * access_token
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 通知内容
	 */
	@ApiField("content")
	private String content;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
