package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建客户关联渠道账号响应对象
 *
 * @author auto create
 * @since 1.0, 2023-10-16 16:43:29
 */
public class FxiaokeCreateCustomerChannelAccountResponse extends AlipayObject {

	private static final long serialVersionUID = 2583718945382272727L;

	/**
	 * 渠道类型
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 客户渠道账号ID
	 */
	@ApiField("channel_uid")
	private String channelUid;

	/**
	 * 客户编码
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 海图系统自增ID
	 */
	@ApiField("id")
	private Long id;

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

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
