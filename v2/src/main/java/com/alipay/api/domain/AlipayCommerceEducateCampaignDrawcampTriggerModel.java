package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 高校营销抽奖活动触发抽奖
 *
 * @author auto create
 * @since 1.0, 2026-05-18 19:51:15
 */
public class AlipayCommerceEducateCampaignDrawcampTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 4324677746488628736L;

	/**
	 * 营销的渠道，需开发前协商确认
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 用户红包码，可拼接营销前后缀，如：【碰一下红包4II1ZMNO】
	 */
	@ApiField("claim_code")
	private String claimCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务id，幂等控制，用于判断是否重复调用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getClaimCode() {
		return this.claimCode;
	}
	public void setClaimCode(String claimCode) {
		this.claimCode = claimCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
