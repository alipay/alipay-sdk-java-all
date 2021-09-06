package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.order.repayment.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:12
 */
public class ZhimaCreditOrderRepaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8483635935365321851L;

	/** 
	 * 请求时传入外部单据号，结果中带回
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 判断调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
