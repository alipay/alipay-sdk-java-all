package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预约订单扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-12-22 11:08:47
 */
public class BooKAttributesDTO extends AlipayObject {

	private static final long serialVersionUID = 4417263774442712593L;

	/**
	 * 投放渠道
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 会话标识
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 订单的端标识
	 */
	@ApiField("mgw_app_name")
	private String mgwAppName;

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getMgwAppName() {
		return this.mgwAppName;
	}
	public void setMgwAppName(String mgwAppName) {
		this.mgwAppName = mgwAppName;
	}

}
