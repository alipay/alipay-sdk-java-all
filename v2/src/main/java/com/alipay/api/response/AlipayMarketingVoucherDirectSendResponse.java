package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.direct.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 13:57:27
 */
public class AlipayMarketingVoucherDirectSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7549645677472591276L;

	/** 
	 * 资产编码
	 */
	@ApiField("assets_code")
	private String assetsCode;

	/** 
	 * 可用金额（单位：分）。
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 总现金价值（单位：分）
	 */
	@ApiField("available_cash")
	private String availableCash;

	/** 
	 * 扩展信息，json格式。
1.activityUrl：活动链接地址
2.activityId：活动ID
3.extends：其它扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 模板扩展信息
	 */
	@ApiField("extend_template_info")
	private String extendTemplateInfo;

	/** 
	 * 券生效时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("gmt_active")
	private String gmtActive;

	/** 
	 * 券创建时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 券失效时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/** 
	 * 展期，格式为yyyy-MM-dd HH:mm:ss。
如果退款时间超过失效时间，但是未到展期，将失效时间改成展期实际时间。
	 */
	@ApiField("gmt_extend")
	private String gmtExtend;

	/** 
	 * 券修改时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 用户的支付宝账号对应的支付宝唯一用户号映射的openId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 券状态。
1.ENABLED：可用
2.DISABLED：不可用
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 总金额（面额）（单位：分）。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 总现金价值（单位：分）。
	 */
	@ApiField("total_cash")
	private String totalCash;

	/** 
	 * 用户的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 券描述信息，json格式。
description：券描述信息。
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/** 
	 * 劵ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setAssetsCode(String assetsCode) {
		this.assetsCode = assetsCode;
	}
	public String getAssetsCode( ) {
		return this.assetsCode;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setAvailableCash(String availableCash) {
		this.availableCash = availableCash;
	}
	public String getAvailableCash( ) {
		return this.availableCash;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo( ) {
		return this.extendInfo;
	}

	public void setExtendTemplateInfo(String extendTemplateInfo) {
		this.extendTemplateInfo = extendTemplateInfo;
	}
	public String getExtendTemplateInfo( ) {
		return this.extendTemplateInfo;
	}

	public void setGmtActive(String gmtActive) {
		this.gmtActive = gmtActive;
	}
	public String getGmtActive( ) {
		return this.gmtActive;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}
	public String getGmtExpired( ) {
		return this.gmtExpired;
	}

	public void setGmtExtend(String gmtExtend) {
		this.gmtExtend = gmtExtend;
	}
	public String getGmtExtend( ) {
		return this.gmtExtend;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalCash(String totalCash) {
		this.totalCash = totalCash;
	}
	public String getTotalCash( ) {
		return this.totalCash;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}
	public String getVoucherDescription( ) {
		return this.voucherDescription;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
