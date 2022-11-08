package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 储值卡指定充值单退款
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:37:36
 */
public class AlipayAssetCardDepositbackModel extends AlipayObject {

	private static final long serialVersionUID = 1865894699289598923L;

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
	 * 退款金额资
	 */
	@ApiField("depositback_amount")
	private String depositbackAmount;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 资金流场景
	 */
	@ApiField("fund_scene")
	private String fundScene;

	/**
	 * 支付宝原始充值订单号
	 */
	@ApiField("original_bill_no")
	private String originalBillNo;

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

	public String getDepositbackAmount() {
		return this.depositbackAmount;
	}
	public void setDepositbackAmount(String depositbackAmount) {
		this.depositbackAmount = depositbackAmount;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getFundScene() {
		return this.fundScene;
	}
	public void setFundScene(String fundScene) {
		this.fundScene = fundScene;
	}

	public String getOriginalBillNo() {
		return this.originalBillNo;
	}
	public void setOriginalBillNo(String originalBillNo) {
		this.originalBillNo = originalBillNo;
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
