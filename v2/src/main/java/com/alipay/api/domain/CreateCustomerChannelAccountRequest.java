package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建客户关联渠道账号请求对象
 *
 * @author auto create
 * @since 1.0, 2023-10-16 16:43:37
 */
public class CreateCustomerChannelAccountRequest extends AlipayObject {

	private static final long serialVersionUID = 2822213535364173198L;

	/**
	 * 渠道类型
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 客户渠道账号
	 */
	@ApiField("channel_uid")
	private String channelUid;

	/**
	 * 客户编码
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 操作人工号
	 */
	@ApiField("operator")
	private String operator;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannelUid() {
		return this.channelUid;
	}
	public void setChannelUid(String channelUid) {
		this.channelUid = channelUid;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
