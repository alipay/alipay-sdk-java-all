package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费生成推荐码
 *
 * @author auto create
 * @since 1.0, 2024-11-05 16:25:57
 */
public class AlipayOverseasOpenIndrreferralCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1216458431925244894L;

	/**
	 * 该字段填入本次推荐码生成请求的指定参数（例如指定跳转商户等）
	 */
	@ApiField("referral_params")
	private IndrReferralCodeRequestParamDTO referralParams;

	/**
	 * 行业缴费业务场景，目前支持TUITION（留学缴费）、HOUSE_RENTAL（留学租房）
	 */
	@ApiField("scene_type")
	private String sceneType;

	public IndrReferralCodeRequestParamDTO getReferralParams() {
		return this.referralParams;
	}
	public void setReferralParams(IndrReferralCodeRequestParamDTO referralParams) {
		this.referralParams = referralParams;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
