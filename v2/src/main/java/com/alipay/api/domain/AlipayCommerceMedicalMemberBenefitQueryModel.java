package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗商业化会员权益查询
 *
 * @author auto create
 * @since 1.0, 2025-06-09 14:14:30
 */
public class AlipayCommerceMedicalMemberBenefitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8614975239352799622L;

	/**
	 * 商品参加的权益活动编码，通过商详跳转后缀参数benefitActivityId获取
	 */
	@ApiField("benefit_activity_id")
	private String benefitActivityId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部商户商品ID，会结合当前请求PID来查询对应商品
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * MEDICAL_DRUG - 医药商品
MEDICAL_EXAMINATION - 体检商品
MEDICAL_COSMETOLOGY - 医美商品
MEDICAL_MOUTH - 口腔商品
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * ORCAS_SAAS - 虎鲸购药
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBenefitActivityId() {
		return this.benefitActivityId;
	}
	public void setBenefitActivityId(String benefitActivityId) {
		this.benefitActivityId = benefitActivityId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
