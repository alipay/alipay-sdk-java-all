package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益商品信息查询
 *
 * @author auto create
 * @since 1.0, 2025-06-23 15:47:48
 */
public class AlipayCommerceMedicalBenefitInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7499477227719348229L;

	/**
	 * 商品权益id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 业务id，业务标识字段
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部商品id
	 */
	@ApiField("out_benefit_id")
	private String outBenefitId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBenefitId() {
		return this.outBenefitId;
	}
	public void setOutBenefitId(String outBenefitId) {
		this.outBenefitId = outBenefitId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
