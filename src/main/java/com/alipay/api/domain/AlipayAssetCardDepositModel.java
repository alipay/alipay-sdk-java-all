package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 储值卡充值下单
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:37:31
 */
public class AlipayAssetCardDepositModel extends AlipayObject {

	private static final long serialVersionUID = 3196367226685746883L;

	/**
	 * 充值资金金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资产份额
	 */
	@ApiField("asset_amount")
	private String assetAmount;

	/**
	 * 业务时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 业务单号，幂等用
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 资金流场景
	 */
	@ApiField("fund_scence")
	private String fundScence;

	/**
	 * 卡产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 支付宝卡模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAssetAmount() {
		return this.assetAmount;
	}
	public void setAssetAmount(String assetAmount) {
		this.assetAmount = assetAmount;
	}

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
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
