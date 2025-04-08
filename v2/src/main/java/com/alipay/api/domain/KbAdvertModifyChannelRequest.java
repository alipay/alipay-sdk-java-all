package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道修改入参
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:56
 */
public class KbAdvertModifyChannelRequest extends AlipayObject {

	private static final long serialVersionUID = 2118874958155945882L;

	/**
	 * 渠道ID（渠道创建接口中，返回的channelID）
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 渠道名称
	 */
	@ApiField("name")
	private String name;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
