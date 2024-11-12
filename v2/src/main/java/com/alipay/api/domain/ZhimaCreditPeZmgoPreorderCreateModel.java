package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约预创单
 *
 * @author auto create
 * @since 1.0, 2024-05-20 17:29:11
 */
public class ZhimaCreditPeZmgoPreorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7432151736594163469L;

	/**
	 * 支付宝用户ID。同一个外部请求号，调用方要确保支付宝userId取值不变
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户ID。同一个外部请求号，调用方要确保支付宝userId取值不变
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务发生时间，如2016-07-06 00:00:02
签约超时关单时间依赖这个时间
这个时间会做幂等校验，如果创单幂等，但时间不同会失败
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 废弃字段，勿用
	 */
	@ApiField("custom_temp_conf")
	private String customTempConf;

	/**
	 * 协议到期后通知
	 */
	@ApiField("expire_aisle_data")
	private String expireAisleData;

	/**
	 * 动态配置参数
	 */
	@ApiField("ext_template_conf")
	private ExtTemplateConf extTemplateConf;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private PreOrderExtInfo extendParams;

	/**
	 * 冻结金额，单位：元
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * ISV商户ID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 外部请求号，唯一
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 商户侧用户唯一标识。ex.商户侧uid
	 */
	@ApiField("partner_user_identifier")
	private String partnerUserIdentifier;

	/**
	 * 结算成功后通知
	 */
	@ApiField("pay_aisle_data")
	private String payAisleData;

	/**
	 * 签约成功后通知
	 */
	@ApiField("sign_aisle_data")
	private String signAisleData;

	/**
	 * 签约芝麻GO的模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 超时关单时间
默认1H。1m～15d。m表示分钟，h表示小时，d表示天。该参数数值不接受小数点， 如1.5h，可转换为90m
签约超时关单时间依赖这个时间
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

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

	public String getCustomTempConf() {
		return this.customTempConf;
	}
	public void setCustomTempConf(String customTempConf) {
		this.customTempConf = customTempConf;
	}

	public String getExpireAisleData() {
		return this.expireAisleData;
	}
	public void setExpireAisleData(String expireAisleData) {
		this.expireAisleData = expireAisleData;
	}

	public ExtTemplateConf getExtTemplateConf() {
		return this.extTemplateConf;
	}
	public void setExtTemplateConf(ExtTemplateConf extTemplateConf) {
		this.extTemplateConf = extTemplateConf;
	}

	public PreOrderExtInfo getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(PreOrderExtInfo extendParams) {
		this.extendParams = extendParams;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
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

	public String getPartnerUserIdentifier() {
		return this.partnerUserIdentifier;
	}
	public void setPartnerUserIdentifier(String partnerUserIdentifier) {
		this.partnerUserIdentifier = partnerUserIdentifier;
	}

	public String getPayAisleData() {
		return this.payAisleData;
	}
	public void setPayAisleData(String payAisleData) {
		this.payAisleData = payAisleData;
	}

	public String getSignAisleData() {
		return this.signAisleData;
	}
	public void setSignAisleData(String signAisleData) {
		this.signAisleData = signAisleData;
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
