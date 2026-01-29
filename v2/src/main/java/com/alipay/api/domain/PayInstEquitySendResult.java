package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩支付机构营销单个活动权益发放结果
 *
 * @author auto create
 * @since 1.0, 2024-02-23 16:05:52
 */
public class PayInstEquitySendResult extends AlipayObject {

	private static final long serialVersionUID = 5177521973528517185L;

	/**
	 * 发放权益的活动ID
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 结果描述，详情参考结果码描述内容
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 发放成功后生成的发放凭证号
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSendOrderId() {
		return this.sendOrderId;
	}
	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}

}
