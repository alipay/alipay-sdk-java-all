package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.credit.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:17
 */
public class ZhimaCreditPeUserCreditUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5629758792776467458L;

	/** 
	 * 解冻成功额度，单位为元，取值范围[0.01,100000000]，精确到小数点后2位
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 外部请求幂等号，即接口入参的out_request_no，接口处理完之后回传
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 业务处理是否成功标记，成功返回true，其他情况下返回false
	 */
	@ApiField("success")
	private Boolean success;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
