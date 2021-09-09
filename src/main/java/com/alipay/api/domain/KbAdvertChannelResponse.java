package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客渠道结果
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:48
 */
public class KbAdvertChannelResponse extends AlipayObject {

	private static final long serialVersionUID = 1157566984891558786L;

	/**
	 * 渠道ID
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 渠道名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 渠道状态
EFFECTIVE：有效
INVALID：无效
	 */
	@ApiField("status")
	private String status;

	/**
	 * OFFLINE：线下推广
	 */
	@ApiField("type")
	private String type;

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
