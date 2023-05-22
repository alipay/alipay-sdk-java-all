package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵工风控预咨询
 *
 * @author auto create
 * @since 1.0, 2023-02-22 14:50:15
 */
public class AlipayUserFlexiblestaffingRiskconsultApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7157518438441839776L;

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
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
