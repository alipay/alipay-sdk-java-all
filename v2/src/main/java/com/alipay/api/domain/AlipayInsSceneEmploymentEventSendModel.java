package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送灵工保领域事件
 *
 * @author auto create
 * @since 1.0, 2023-11-09 14:49:04
 */
public class AlipayInsSceneEmploymentEventSendModel extends AlipayObject {

	private static final long serialVersionUID = 3152645661634124823L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 灵工保领域事件
	 */
	@ApiField("domain_event")
	private InsLGBDomainEvent domainEvent;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 投保场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public InsLGBDomainEvent getDomainEvent() {
		return this.domainEvent;
	}
	public void setDomainEvent(InsLGBDomainEvent domainEvent) {
		this.domainEvent = domainEvent;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
