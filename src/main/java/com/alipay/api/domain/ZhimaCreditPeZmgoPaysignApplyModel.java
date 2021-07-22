package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付下单链路签约申请
 *
 * @author auto create
 * @since 1.0, 2021-05-07 09:33:25
 */
public class ZhimaCreditPeZmgoPaysignApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2613947843913511255L;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务发生时间，如2016-07-06 00:00:02
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 模板上关联的小程序id
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/**
	 * 外部请求号-幂等用
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 芝麻GO配置模板Id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 订单超时时间，如果在订单超时时间之前没有发起签约确认，需要商户发起进行关单操作
示例值：1m,3h,15d; 分钟,小时,天 最长15天
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
