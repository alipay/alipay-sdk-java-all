package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.asiangamesrealtime.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:49
 */
public class AlipayDataMdaAsiangamesrealtimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5311993236924654476L;

	/** 
	 * 今日亚运路线完成人数
	 */
	@ApiField("completed")
	private Long completed;

	/** 
	 * 今日亚运路线参与人数
	 */
	@ApiField("dau")
	private Long dau;

	public void setCompleted(Long completed) {
		this.completed = completed;
	}
	public Long getCompleted( ) {
		return this.completed;
	}

	public void setDau(Long dau) {
		this.dau = dau;
	}
	public Long getDau( ) {
		return this.dau;
	}

}
