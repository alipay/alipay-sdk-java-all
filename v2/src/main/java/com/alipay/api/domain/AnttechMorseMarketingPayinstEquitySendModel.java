package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩斯营销活动权益发放
 *
 * @author auto create
 * @since 1.0, 2023-10-30 21:21:40
 */
public class AnttechMorseMarketingPayinstEquitySendModel extends AlipayObject {

	private static final long serialVersionUID = 6212258871333598262L;

	/**
	 * 命中的活动id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 权益类型，微信立减金，支付宝红包
	 */
	@ApiField("equity_type")
	private String equityType;

	/**
	 * mobile_sha_256标识用户唯一信息，通过用户手机号SHA256 哈希后获得
	 */
	@ApiField("mobile_sha_256")
	private String mobileSha256;

	/**
	 * 外部请求号，由业务方自己生成，需保持唯一性，建议格式：日期+流水号
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/**
	 * 资源位编号，接口请求标识商户资源位信息，由摩斯侧分配
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 发放对象编号，比如appid#openid
	 */
	@ApiField("send_target_id")
	private String sendTargetId;

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getEquityType() {
		return this.equityType;
	}
	public void setEquityType(String equityType) {
		this.equityType = equityType;
	}

	public String getMobileSha256() {
		return this.mobileSha256;
	}
	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
	}

	public String getOutRequestId() {
		return this.outRequestId;
	}
	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getSendTargetId() {
		return this.sendTargetId;
	}
	public void setSendTargetId(String sendTargetId) {
		this.sendTargetId = sendTargetId;
	}

}
