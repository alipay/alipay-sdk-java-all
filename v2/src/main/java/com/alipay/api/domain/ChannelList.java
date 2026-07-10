package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询结果中的渠道列表
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:06:40
 */
public class ChannelList extends AlipayObject {

	private static final long serialVersionUID = 6569265581855342848L;

	/**
	 * 用户来源
	 */
	@ApiField("new_user_source")
	private String newUserSource;

	/**
	 * 核算OU
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 渠道code
	 */
	@ApiField("sell_channel_code")
	private String sellChannelCode;

	/**
	 * 渠道名称
	 */
	@ApiField("sell_channel_name")
	private String sellChannelName;

	public String getNewUserSource() {
		return this.newUserSource;
	}
	public void setNewUserSource(String newUserSource) {
		this.newUserSource = newUserSource;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public String getSellChannelCode() {
		return this.sellChannelCode;
	}
	public void setSellChannelCode(String sellChannelCode) {
		this.sellChannelCode = sellChannelCode;
	}

	public String getSellChannelName() {
		return this.sellChannelName;
	}
	public void setSellChannelName(String sellChannelName) {
		this.sellChannelName = sellChannelName;
	}

}
