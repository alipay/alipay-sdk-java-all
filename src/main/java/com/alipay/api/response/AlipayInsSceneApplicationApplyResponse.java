package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.apply response.
 * 
 * @author auto create
 * @since 1.0, 2018-01-24 14:21:01
 */
public class AlipayInsSceneApplicationApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7659872187319969661L;

	/** 
	 * 投保单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	/** 
	 * 交易操作流水号;收银台付款需要
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 保单号,同步创建保单的会有，异步创建保单的不返回
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 支付交易订单号,收银台付款需要
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getApplicationNo( ) {
		return this.applicationNo;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getOperationId( ) {
		return this.operationId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
