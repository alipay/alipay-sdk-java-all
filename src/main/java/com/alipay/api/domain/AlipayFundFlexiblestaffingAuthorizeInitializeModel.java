package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵工授权初始化
 *
 * @author auto create
 * @since 1.0, 2022-08-22 14:29:49
 */
public class AlipayFundFlexiblestaffingAuthorizeInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7758421184898587259L;

	/**
	 * 授权完成后的跳转地址，支持https的h5地址和小程序scheme url，不支持跳转支付宝端外app和页面。
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 灵工授权场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 授权编码有效截止时间，可选，默认7天内有效，点时间超过截止时间后授权编码将会失效。格式：yyyy-MM-dd HH:mm:ss。注意：如果输入的格式不匹配，会报错参数异常，且过期时间最短不能小于一小时。
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 授权编码类型，有限枚举：1. SHORT_URL （短链接）2.PAGE_PARAM（小程序跳转参数）
	 */
	@ApiField("initialize_code_type")
	private String initializeCodeType;

	/**
	 * 外部业务号，调用方自定义提供，授权结果推送和授权结果查询中都会提供此单号，用于串联授权流程
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 授权主体信息
	 */
	@ApiField("principal_party_info")
	private PrincipalPartyInfo principalPartyInfo;

	/**
	 * 灵工授权产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getInitializeCodeType() {
		return this.initializeCodeType;
	}
	public void setInitializeCodeType(String initializeCodeType) {
		this.initializeCodeType = initializeCodeType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public PrincipalPartyInfo getPrincipalPartyInfo() {
		return this.principalPartyInfo;
	}
	public void setPrincipalPartyInfo(PrincipalPartyInfo principalPartyInfo) {
		this.principalPartyInfo = principalPartyInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
