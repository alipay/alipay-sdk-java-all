package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.transaction.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:57:00
 */
public class AlipayMsaasMediarecogMmtcaftscvTransactionInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2861197361373652643L;

	/** 
	 * 下发给设备的视觉算法config
	 */
	@ApiField("algorithm_config")
	private String algorithmConfig;

	/** 
	 * 处理结果
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 云平台请求唯一标示,保证用户请求的幂等性.
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public void setAlgorithmConfig(String algorithmConfig) {
		this.algorithmConfig = algorithmConfig;
	}
	public String getAlgorithmConfig( ) {
		return this.algorithmConfig;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionId( ) {
		return this.transactionId;
	}

}
