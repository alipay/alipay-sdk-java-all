package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.authentication.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-17 16:07:01
 */
public class AlipayFundFlexiblestaffingAuthenticationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6425339256748247828L;

	/** 
	 * 商户端的唯一订单号，幂等关键参数。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 核身结果
	 */
	@ApiField("verify_result")
	private String verifyResult;

	/** 
	 * 核身完成的时间
	 */
	@ApiField("verify_time")
	private Date verifyTime;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setVerifyResult(String verifyResult) {
		this.verifyResult = verifyResult;
	}
	public String getVerifyResult( ) {
		return this.verifyResult;
	}

	public void setVerifyTime(Date verifyTime) {
		this.verifyTime = verifyTime;
	}
	public Date getVerifyTime( ) {
		return this.verifyTime;
	}

}
