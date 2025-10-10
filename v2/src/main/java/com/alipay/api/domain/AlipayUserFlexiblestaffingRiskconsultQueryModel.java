package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风控咨询结果查询
 *
 * @author auto create
 * @since 1.0, 2023-01-16 10:39:39
 */
public class AlipayUserFlexiblestaffingRiskconsultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3333824834176377923L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 咨询参与方信息
	 */
	@ApiField("consult_party")
	private PariticipantDTO consultParty;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 咨询或者转账的外部单号，新逻辑幂等，外部单号必传
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

	public PariticipantDTO getConsultParty() {
		return this.consultParty;
	}
	public void setConsultParty(PariticipantDTO consultParty) {
		this.consultParty = consultParty;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
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
