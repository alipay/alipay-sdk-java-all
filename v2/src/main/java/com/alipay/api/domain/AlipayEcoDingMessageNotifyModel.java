package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钉钉消息通知对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 18:22:10
 */
public class AlipayEcoDingMessageNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5832435266947596748L;

	/**
	 * 钉钉通知@人列表
	 */
	@ApiField("at_mobiles")
	private String atMobiles;

	/**
	 * 钉钉通知内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 钉钉群token
	 */
	@ApiField("ding_token")
	private String dingToken;

	public String getAtMobiles() {
		return this.atMobiles;
	}
	public void setAtMobiles(String atMobiles) {
		this.atMobiles = atMobiles;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDingToken() {
		return this.dingToken;
	}
	public void setDingToken(String dingToken) {
		this.dingToken = dingToken;
	}

}
