package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道运营展示数据
 *
 * @author auto create
 * @since 1.0, 2023-08-28 15:44:19
 */
public class PrePayOperationInfoViewData extends AlipayObject {

	private static final long serialVersionUID = 8585248236727394333L;

	/**
	 * 渠道或者优惠的图像表达url
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 运营主体
	 */
	@ApiField("operation_desc")
	private String operationDesc;

	/**
	 * 运营文案描述
	 */
	@ApiField("operation_tip")
	private String operationTip;

	/**
	 * 运营信息:支付回传提升体验一致
	 */
	@ApiField("pay_operation_info")
	private String payOperationInfo;

	/**
	 * 运营活动定价
	 */
	@ApiField("promo_price")
	private String promoPrice;

	/**
	 * 营销类型
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 运营活动门槛信息
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getOperationDesc() {
		return this.operationDesc;
	}
	public void setOperationDesc(String operationDesc) {
		this.operationDesc = operationDesc;
	}

	public String getOperationTip() {
		return this.operationTip;
	}
	public void setOperationTip(String operationTip) {
		this.operationTip = operationTip;
	}

	public String getPayOperationInfo() {
		return this.payOperationInfo;
	}
	public void setPayOperationInfo(String payOperationInfo) {
		this.payOperationInfo = payOperationInfo;
	}

	public String getPromoPrice() {
		return this.promoPrice;
	}
	public void setPromoPrice(String promoPrice) {
		this.promoPrice = promoPrice;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

}
