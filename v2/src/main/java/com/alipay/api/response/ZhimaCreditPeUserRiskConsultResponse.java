package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.risk.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:41:40
 */
public class ZhimaCreditPeUserRiskConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4225434983366522387L;

	/** 
	 * 用户在该场景下能否准入，返回true：准入，返回false：不准入。系统调用正确时有值。
	 */
	@ApiField("permit")
	private Boolean permit;

	/** 
	 * 不准入原因码，只有当permit为false时，值才具有价值。不同的不准入原因，取值会有不同的码，比如，ZM_SCORE_REFUSE，ZHIMA_NOT_OPEN，AGREEMENT_NOT_OPEN等等，商户一般只需要关注ZM_SCORE_REFUSE(芝麻分不足)、ZHIMA_NOT_OPEN(非芝麻会员)、AGREEMENT_NOT_OPEN(用户未授权)三个原因，其他原因无需详细关注，可采取统一处理措施。
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 芝麻咨询单号，业务处理成功后，芝麻返回该字段，实际使用时请注意保存该字段。系统调用正确时有值。
	 */
	@ApiField("risk_order_no")
	private String riskOrderNo;

	/** 
	 * 场景分等级，如有需要，请在产品签约阶段联系产品或业务负责人申请
	 */
	@ApiField("scene_level")
	private String sceneLevel;

	/** 
	 * 特殊输出字段，仅在特定业务场景下可能输出，输出值需要提前联系芝麻进行定制和确认后，在permit=true的情况下才会输出
	 */
	@ApiField("zm_score_level")
	private String zmScoreLevel;

	public void setPermit(Boolean permit) {
		this.permit = permit;
	}
	public Boolean getPermit( ) {
		return this.permit;
	}

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}
	public String getRefuseCode( ) {
		return this.refuseCode;
	}

	public void setRiskOrderNo(String riskOrderNo) {
		this.riskOrderNo = riskOrderNo;
	}
	public String getRiskOrderNo( ) {
		return this.riskOrderNo;
	}

	public void setSceneLevel(String sceneLevel) {
		this.sceneLevel = sceneLevel;
	}
	public String getSceneLevel( ) {
		return this.sceneLevel;
	}

	public void setZmScoreLevel(String zmScoreLevel) {
		this.zmScoreLevel = zmScoreLevel;
	}
	public String getZmScoreLevel( ) {
		return this.zmScoreLevel;
	}

}
