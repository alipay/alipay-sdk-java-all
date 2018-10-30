package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.entity.monitor.set response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-22 19:33:51
 */
public class ZhimaCreditEpEntityMonitorSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5182627694388833117L;

	/** 
	 * 添加成功返回true, 失败返回false
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

}
