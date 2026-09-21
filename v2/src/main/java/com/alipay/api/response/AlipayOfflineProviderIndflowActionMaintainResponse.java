package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.indflow.action.maintain response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-10 16:27:55
 */
public class AlipayOfflineProviderIndflowActionMaintainResponse extends AlipayResponse {

	private static final long serialVersionUID = 4299435766287766575L;

	/** 
	 * 是否成功
	 */
	@ApiField("reported")
	private Boolean reported;

	public void setReported(Boolean reported) {
		this.reported = reported;
	}
	public Boolean getReported( ) {
		return this.reported;
	}

}
