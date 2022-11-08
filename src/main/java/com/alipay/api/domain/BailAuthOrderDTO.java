package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保证金主单DTO
 *
 * @author auto create
 * @since 1.0, 2022-05-07 11:30:41
 */
public class BailAuthOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 6371486875976732789L;

	/**
	 * 保证金协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 保证金剩余可用余额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 保证金预授权号
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 保证金状态。NORMAL——正常，MIGRATED——已迁移
	 */
	@ApiField("bail_status")
	private String bailStatus;

	/**
	 * 资金托管模式，网商模式下返回ANTBANK，余额模式下不返回该字段
	 */
	@ApiField("fund_entrust_type")
	private String fundEntrustType;

	/**
	 * 保证金主单创建时间，格式YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 保证金主单最后修改时间，格式YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 平台uid
	 */
	@ApiField("partner_user_id")
	private String partnerUserId;

	/**
	 * 保证金产品码，固定BAIL_AUTH
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景码描述
	 */
	@ApiField("scene_desc")
	private String sceneDesc;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAuthNo() {
		return this.authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

	public String getBailStatus() {
		return this.bailStatus;
	}
	public void setBailStatus(String bailStatus) {
		this.bailStatus = bailStatus;
	}

	public String getFundEntrustType() {
		return this.fundEntrustType;
	}
	public void setFundEntrustType(String fundEntrustType) {
		this.fundEntrustType = fundEntrustType;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getPartnerUserId() {
		return this.partnerUserId;
	}
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneDesc() {
		return this.sceneDesc;
	}
	public void setSceneDesc(String sceneDesc) {
		this.sceneDesc = sceneDesc;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
