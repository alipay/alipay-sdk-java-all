package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿里云支付医疗积分
 *
 * @author auto create
 * @since 1.0, 2025-05-19 18:40:10
 */
public class AlipayCommerceMedicalPromoPointPayModel extends AlipayObject {

	private static final long serialVersionUID = 8684172542393289619L;

	/**
	 * LM配置商品价格时填的客户业务值（权益id），医疗用来区分代币种类
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * biz_no
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 渠道信息
	 */
	@ApiField("kz_info")
	private String kzInfo;

	/**
	 * lm订单id
	 */
	@ApiField("lm_order_id")
	private String lmOrderId;

	/**
	 * 医疗商品id
	 */
	@ApiField("med_benefit_id")
	private String medBenefitId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 阿里云侧的skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 淘宝订单id
	 */
	@ApiField("tb_order_id")
	private String tbOrderId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getKzInfo() {
		return this.kzInfo;
	}
	public void setKzInfo(String kzInfo) {
		this.kzInfo = kzInfo;
	}

	public String getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(String lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public String getMedBenefitId() {
		return this.medBenefitId;
	}
	public void setMedBenefitId(String medBenefitId) {
		this.medBenefitId = medBenefitId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getTbOrderId() {
		return this.tbOrderId;
	}
	public void setTbOrderId(String tbOrderId) {
		this.tbOrderId = tbOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
