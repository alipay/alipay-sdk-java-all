package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费者领券
 *
 * @author auto create
 * @since 1.0, 2021-03-23 11:44:42
 */
public class AlipayMarketingCampaignPromotionactivityCustomerReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 1825326868295755334L;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 风控字段apdid
	 */
	@ApiField("apdid")
	private String apdid;

	/**
	 * 手机端客户端的ip
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 商户的pid 例如2088301847277786
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 外部请求号，用来保证幂等性， 需要权益唯一。 建议用UUID。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getApdid() {
		return this.apdid;
	}
	public void setApdid(String apdid) {
		this.apdid = apdid;
	}

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
