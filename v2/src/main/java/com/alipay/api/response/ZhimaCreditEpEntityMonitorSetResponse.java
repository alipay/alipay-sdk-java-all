package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.entity.monitor.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:21:25
 */
public class ZhimaCreditEpEntityMonitorSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8844394462124625281L;

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
