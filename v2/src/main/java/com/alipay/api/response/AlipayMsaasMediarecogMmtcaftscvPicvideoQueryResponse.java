package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.picvideo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-04 21:31:51
 */
public class AlipayMsaasMediarecogMmtcaftscvPicvideoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4613334515517341779L;

	/** 
	 * 货柜每层视频展示信息
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 结果状态
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 可以重复查询,no_retry 不能重复查询
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 交易ID
	 */
	@ApiField("transaction_id")
	private String transactionId;

	/** 
	 * 请求类型
	 */
	@ApiField("type")
	private String type;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionId( ) {
		return this.transactionId;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
