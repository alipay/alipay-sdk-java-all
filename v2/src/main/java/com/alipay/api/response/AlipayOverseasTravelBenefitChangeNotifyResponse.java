package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Result;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.benefit.change.notify response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-28 18:55:14
 */
public class AlipayOverseasTravelBenefitChangeNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8646762645931164665L;

	/** 
	 * 收单站在gn的id
	 */
	@ApiField("acquirer_id")
	private String acquirerId;

	/** 
	 * 发卡站在gn的id
	 */
	@ApiField("psp_id")
	private String pspId;

	/** 
	 * 通知结果
	 */
	@ApiField("result")
	private Result result;

	public void setAcquirerId(String acquirerId) {
		this.acquirerId = acquirerId;
	}
	public String getAcquirerId( ) {
		return this.acquirerId;
	}

	public void setPspId(String pspId) {
		this.pspId = pspId;
	}
	public String getPspId( ) {
		return this.pspId;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}

}
