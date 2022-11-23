package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.merchant.sign response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-13 11:52:50
 */
public class MybankEcnyMerchantSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3672758478453748226L;

	/** 
	 * 商户ID，签约成功时必填
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 受理流水号，受理成功时必填
	 */
	@ApiField("process_no")
	private String processNo;

	/** 
	 * 签约状态：PROCESSING-处理中；SUCCESS-成功；FAIL-失败，受理成功时必填
	 */
	@ApiField("status")
	private String status;

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setProcessNo(String processNo) {
		this.processNo = processNo;
	}
	public String getProcessNo( ) {
		return this.processNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
