package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回值
 *
 * @author auto create
 * @since 1.0, 2022-01-07 10:43:09
 */
public class OpenAPIContractRiskResult extends AlipayObject {

	private static final long serialVersionUID = 4288461329759874738L;

	/**
	 * 公司不存在
	 */
	@ApiField("content")
	private String content;

	/**
	 * 处置提示
	 */
	@ApiField("deal_tip")
	private String dealTip;

	/**
	 * 是否阻断
	 */
	@ApiField("is_block")
	private String isBlock;

	/**
	 * 扫描通过:SCANNING_Y
扫描不通过:SCANNING_N
	 */
	@ApiField("result")
	private String result;

	/**
	 * 下游风险扫描接口返回码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 下游风险扫描接口返回描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 高风险
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 风险类型
	 */
	@ApiField("risk_name")
	private String riskName;

	/**
	 * "PARTB_HIGH"：相对方高风险
	 */
	@ApiField("risk_type")
	private String riskType;

	/**
	 * 摘要信息
	 */
	@ApiField("summay")
	private String summay;

	/**
	 * 风险扫描流水号
	 */
	@ApiField("v_id")
	private String vId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDealTip() {
		return this.dealTip;
	}
	public void setDealTip(String dealTip) {
		this.dealTip = dealTip;
	}

	public String getIsBlock() {
		return this.isBlock;
	}
	public void setIsBlock(String isBlock) {
		this.isBlock = isBlock;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRiskName() {
		return this.riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public String getSummay() {
		return this.summay;
	}
	public void setSummay(String summay) {
		this.summay = summay;
	}

	public String getvId() {
		return this.vId;
	}
	public void setvId(String vId) {
		this.vId = vId;
	}

}
