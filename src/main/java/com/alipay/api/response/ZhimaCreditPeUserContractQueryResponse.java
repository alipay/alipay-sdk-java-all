package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.contract.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-12 10:55:43
 */
public class ZhimaCreditPeUserContractQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4712652659195616423L;

	/** 
	 * true: 用户开通 false: 用户未开通
	 */
	@ApiField("open")
	private Boolean open;

	/** 
	 * 签约时间，格式：yyyy-MM-dd hh:mm:ss,未开通时值为空
	 */
	@ApiField("operate_time")
	private String operateTime;

	/** 
	 * 签约成功时对应的服务签约号,未开通时值为空
	 */
	@ApiField("sign_id")
	private String signId;

	public void setOpen(Boolean open) {
		this.open = open;
	}
	public Boolean getOpen( ) {
		return this.open;
	}

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
