package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 还款业务单代扣协议执行计划修改
 *
 * @author auto create
 * @since 1.0, 2024-12-27 14:59:48
 */
public class AlipayCommerceWithholdrepayorderWithholdplanModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4432897786392815111L;

	/**
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 外部商户协议号
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务幂等号，用于做幂等使用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 行业代扣计划
	 */
	@ApiListField("repay_plan")
	@ApiField("industry_withhold_plan_d_t_o")
	private List<IndustryWithholdPlanDTO> repayPlan;

	/**
	 * 签约的场景码
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 业务单类型的履约节点，如激活，注意激活仅可进行一次
	 */
	@ApiField("stage")
	private String stage;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<IndustryWithholdPlanDTO> getRepayPlan() {
		return this.repayPlan;
	}
	public void setRepayPlan(List<IndustryWithholdPlanDTO> repayPlan) {
		this.repayPlan = repayPlan;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	public String getStage() {
		return this.stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
