package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务民生机构代扣预签约token生成接口
 *
 * @author auto create
 * @since 1.0, 2022-05-19 09:55:50
 */
public class AlipayEbppInstserviceTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4436619685582185277L;

	/**
	 * 签约来源渠道，接入时与代扣约定
	 */
	@ApiField("agent_channel")
	private String agentChannel;

	/**
	 * 签约来源渠道，接入时与代扣约定
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 户号（缴费场景是户号，话费场景是手机号）
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务场景：flow(流量)、voice(语音话费)、telephone(固话)
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务类型（例如通信，缴费，还款）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 发起代扣的面额（可以和代扣时金额不一致，例如打折活动）
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/**
	 * 代扣产品码（由技术同学分配）
	 */
	@ApiField("ededuct_product_code")
	private String edeductProductCode;

	/**
	 * 代扣日期
	 */
	@ApiField("execute_date")
	private String executeDate;

	/**
	 * 机构ID（支付宝侧分配）
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 外部协议号
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

	/**
	 * PREPAID预付费，POSTPAID后付费
	 */
	@ApiField("pay_mode")
	private String payMode;

	/**
	 * 签约的服务描述
	 */
	@ApiField("service_desc")
	private String serviceDesc;

	/**
	 * 二级业务类型（例如话费，流量，水费，电费）
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 发起代扣的阈值
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 服务名称
	 */
	@ApiField("title")
	private String title;

	public String getAgentChannel() {
		return this.agentChannel;
	}
	public void setAgentChannel(String agentChannel) {
		this.agentChannel = agentChannel;
	}

	public String getAgentCode() {
		return this.agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}

	public String getEdeductProductCode() {
		return this.edeductProductCode;
	}
	public void setEdeductProductCode(String edeductProductCode) {
		this.edeductProductCode = edeductProductCode;
	}

	public String getExecuteDate() {
		return this.executeDate;
	}
	public void setExecuteDate(String executeDate) {
		this.executeDate = executeDate;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOutAgreementId() {
		return this.outAgreementId;
	}
	public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}

	public String getPayMode() {
		return this.payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getServiceDesc() {
		return this.serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
