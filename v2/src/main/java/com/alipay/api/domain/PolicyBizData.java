package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单扩展字段
 *
 * @author auto create
 * @since 1.0, 2023-08-23 17:22:26
 */
public class PolicyBizData extends AlipayObject {

	private static final long serialVersionUID = 6257543335167237521L;

	/**
	 * 渠道用户标识
	 */
	@ApiField("channel_user_tag")
	private String channelUserTag;

	/**
	 * 渠道
	 */
	@ApiField("entrance")
	private String entrance;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	public String getChannelUserTag() {
		return this.channelUserTag;
	}
	public void setChannelUserTag(String channelUserTag) {
		this.channelUserTag = channelUserTag;
	}

	public String getEntrance() {
		return this.entrance;
	}
	public void setEntrance(String entrance) {
		this.entrance = entrance;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
