package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报告出具消息发送渠道信息
 *
 * @author auto create
 * @since 1.0, 2026-08-21 09:57:07
 */
public class Channels extends AlipayObject {

	private static final long serialVersionUID = 1741134838369713687L;

	/**
	 * 消息发送的渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 消息触达用户跳转的短链
	 */
	@ApiField("short_link")
	private String shortLink;

	/**
	 * 当前渠道的模板编号；SMS/免订阅映射为下游 template code，阿福 push 映射为下游 template ID
	 */
	@ApiField("template_no")
	private String templateNo;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getShortLink() {
		return this.shortLink;
	}
	public void setShortLink(String shortLink) {
		this.shortLink = shortLink;
	}

	public String getTemplateNo() {
		return this.templateNo;
	}
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

}
