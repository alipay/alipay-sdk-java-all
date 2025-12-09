package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.contract.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:53
 */
public class ZhimaCreditPeUserContractUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7599554853528971553L;

	/** 
	 * 解约时间，格式：yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("operate_time")
	private String operateTime;

	/** 
	 * 服务签约号，解约成功后，接口返回
	 */
	@ApiField("sign_id")
	private String signId;

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	public String getOperateTime( ) {
		return this.operateTime;
	}

	public void setSignId(String signId) {
		this.signId = signId;
	}
	public String getSignId( ) {
		return this.signId;
	}

}
