package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻活动预创单
 *
 * @author auto create
 * @since 1.0, 2022-10-18 15:26:25
 */
public class AlipayCommerceZhimaPreorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6726138158435371312L;

	/**
	 * alipay_store_id
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * 支付宝用户ID。同一个外部请求号，调用方要确保支付宝userId取值不变
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务发生时间，如2016-07-06 00:00:02 签约超时关单时间依赖这个时间 这个时间会做幂等校验，如果创单幂等，但时间不同会失败
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * ISV商户ID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 开放平台appId
	 */
	@ApiField("openapi_app_id")
	private String openapiAppId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 任务开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * storeId
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 外部任务模版id，如芝麻GO活动模版id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 外部模版类型
	 */
	@ApiField("template_type")
	private String templateType;

	/**
	 * 超时关单时间 默认1H。1m～15d。m表示分钟，h表示小时，d表示天。该参数数值不接受小数点， 如1.5h，可转换为90m 签约超时关单时间依赖这个时间
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getAlipayStoreId() {
		return this.alipayStoreId;
	}
	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOpenapiAppId() {
		return this.openapiAppId;
	}
	public void setOpenapiAppId(String openapiAppId) {
		this.openapiAppId = openapiAppId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
