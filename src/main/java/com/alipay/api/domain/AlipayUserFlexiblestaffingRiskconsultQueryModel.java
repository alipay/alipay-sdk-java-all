package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风控咨询结果查询
 *
 * @author auto create
 * @since 1.0, 2022-08-22 11:18:50
 */
public class AlipayUserFlexiblestaffingRiskconsultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3649358632827773319L;

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
	 * 转账的外部单号，如果是转账过程中的咨询结果查询，可以传入外部单号；
否则可以不传。
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
