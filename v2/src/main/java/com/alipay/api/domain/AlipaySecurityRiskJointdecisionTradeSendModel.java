package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户风险数据回传接口
 *
 * @author auto create
 * @since 1.0, 2025-03-05 14:29:14
 */
public class AlipaySecurityRiskJointdecisionTradeSendModel extends AlipayObject {

	private static final long serialVersionUID = 6181292378946788954L;

	/**
	 * 外部交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 01：暂停发货；02：延迟结算；03：关停账户；04：暂停发货+关停账户；05：延迟结算+关停账户；06：订单拦截中；07：订单已退款；08：订单已履约交付无法退款；09：其他
	 */
	@ApiField("risk_trade_feedback")
	private String riskTradeFeedback;

	/**
	 * 风险交易处置时间,格式YYYYMMDD
	 */
	@ApiField("risk_trade_feedback_time")
	private String riskTradeFeedbackTime;

	/**
	 * 场景号
01联合决策交易处理结果回传
02商家主动感知风险交易推送
03联合决策客诉处理结果回传
04潜在风险交易预警处理结果回传
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 二级商户id
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 投诉id（案件号）,场景编码为03时必传
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRiskTradeFeedback() {
		return this.riskTradeFeedback;
	}
	public void setRiskTradeFeedback(String riskTradeFeedback) {
		this.riskTradeFeedback = riskTradeFeedback;
	}

	public String getRiskTradeFeedbackTime() {
		return this.riskTradeFeedbackTime;
	}
	public void setRiskTradeFeedbackTime(String riskTradeFeedbackTime) {
		this.riskTradeFeedbackTime = riskTradeFeedbackTime;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
