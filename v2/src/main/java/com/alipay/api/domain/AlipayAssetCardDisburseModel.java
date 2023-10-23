package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.asset.card.disburse(打款)
 *
 * @author auto create
 * @since 1.0, 2022-12-02 21:45:03
 */
public class AlipayAssetCardDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 1743847977221694255L;

	/**
	 * 打款金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付宝资产id,跟模板id二选一
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产平台类型卡/券
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 业务时间
	 */
	@ApiField("biz_dt")
	private String bizDt;

	/**
	 * 业务订单号，幂等用
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 扩展信息
账单信息key:merchantBillInfo
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 资金流场景
	 */
	@ApiField("fund_scence")
	private String fundScence;

	/**
	 * 支付宝用户id映射
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 收款方支付宝用户id映射
	 */
	@ApiField("payee_open_id")
	private String payeeOpenId;

	/**
	 * 收款方支付宝用户id
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/**
	 * 付款方支付宝用户id
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/**
	 * 支付宝模板id,跟资产id二选一
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户id
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPayeeOpenId() {
		return this.payeeOpenId;
	}
	public void setPayeeOpenId(String payeeOpenId) {
		this.payeeOpenId = payeeOpenId;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public String getPayerUserId() {
		return this.payerUserId;
	}
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
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
