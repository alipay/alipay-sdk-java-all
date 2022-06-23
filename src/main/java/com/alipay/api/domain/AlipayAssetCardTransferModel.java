package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.asset.card.transfer(外部商户标准卡资产转移)
 *
 * @author auto create
 * @since 1.0, 2019-04-28 14:48:45
 */
public class AlipayAssetCardTransferModel extends AlipayObject {

	private static final long serialVersionUID = 1289868884765896579L;

	/**
	 * 转移金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 模板实例，资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产平台类型卡/券
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_dt")
	private String bizDt;

	/**
	 * 业务订单号，幂等字段
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 资金流场景
	 */
	@ApiField("fund_scence")
	private String fundScence;

	/**
	 * 接收方支付宝用户id
	 */
	@ApiField("receive_user_id")
	private String receiveUserId;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(String bizDt) {
		this.bizDt = bizDt;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getFundScence() {
		return this.fundScence;
	}
	public void setFundScence(String fundScence) {
		this.fundScence = fundScence;
	}

	public String getReceiveUserId() {
		return this.receiveUserId;
	}
	public void setReceiveUserId(String receiveUserId) {
		this.receiveUserId = receiveUserId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
