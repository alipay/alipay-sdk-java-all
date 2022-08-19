package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠活动申请
 *
 * @author auto create
 * @since 1.0, 2019-09-26 19:26:58
 */
public class AlipayOpenOperationBizfeeActivityApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2136856784115453352L;

	/**
	 * 优惠活动码，由优惠平台创建并分配，对应于某一特定的优惠活动，例如免费提现额度提额活动，由运营同学进行录入，并提供给外部商户
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 针对免费额度提额活动，对应于需要提升的免费额度的量，最多两位小数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务发生时间，如当前时间
	 */
	@ApiField("gmt_service")
	private String gmtService;

	/**
	 * 外部业务号，用作幂等控制，不同的调用需要保证不重复；多次重试的情况下，需要保证该外部业务号相同
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户ID，填写商户的支付宝2088号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 扩展属性（Map的JSON对象） key和value中不能有英文逗号及等于符号。
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 蚂蚁统一会员ID，即应用优惠的对象，例如免费提现额度提额活动，对应于将额度发放的对象
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(String gmtService) {
		this.gmtService = gmtService;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
