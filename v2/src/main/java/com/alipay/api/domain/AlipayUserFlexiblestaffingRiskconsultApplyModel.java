package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵工风控预咨询
 *
 * @author auto create
 * @since 1.0, 2023-10-27 10:15:52
 */
public class AlipayUserFlexiblestaffingRiskconsultApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7165296533666968957L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 咨询主体信息
	 */
	@ApiField("consult_party")
	private Pariticipant consultParty;

	/**
	 * 企业信息
	 */
	@ApiField("enterprise_info")
	private EnterpriseInformation enterpriseInfo;

	/**
	 * 咨询申请的外部单号，幂等参数，必传
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 岗位
	 */
	@ApiField("position")
	private String position;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 风险场景，CONSULT_BY_RISK_SCENE场景时，必填
User Account Risk：账户安全咨询
Enterprise Access Risk：社保风险咨询
Enterprise Manager Risk：董监高风险咨询
	 */
	@ApiField("risk_scene")
	private String riskScene;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public Pariticipant getConsultParty() {
		return this.consultParty;
	}
	public void setConsultParty(Pariticipant consultParty) {
		this.consultParty = consultParty;
	}

	public EnterpriseInformation getEnterpriseInfo() {
		return this.enterpriseInfo;
	}
	public void setEnterpriseInfo(EnterpriseInformation enterpriseInfo) {
		this.enterpriseInfo = enterpriseInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRiskScene() {
		return this.riskScene;
	}
	public void setRiskScene(String riskScene) {
		this.riskScene = riskScene;
	}

}
