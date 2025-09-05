package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.aacollect.payorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:58
 */
public class AlipayFundTransAacollectPayorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8538253462693573597L;

	/** 
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 业务类型,客户端透传给收银台。默认值：biz_account_transfer
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 付款订单号,小程序传给收银台
	 */
	@ApiField("transfer_no")
	private String transferNo;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}
	public String getTransferNo( ) {
		return this.transferNo;
	}

}
