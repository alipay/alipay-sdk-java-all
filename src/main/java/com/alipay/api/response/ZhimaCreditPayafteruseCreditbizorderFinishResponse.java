package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditbizorder.finish response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-14 14:11:29
 */
public class ZhimaCreditPayafteruseCreditbizorderFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 4617948616788591562L;

	/** 
	 * 信用服务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 商户外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
