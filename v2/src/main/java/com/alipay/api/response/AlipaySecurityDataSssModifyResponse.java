package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ActivityGoods;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.sss.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-18 21:52:05
 */
public class AlipaySecurityDataSssModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4888313691449117951L;

	/** 
	 * 复杂类型
	 */
	@ApiField("dff")
	private ActivityGoods dff;

	/** 
	 * 323
	 */
	@ApiField("kjkj")
	private String kjkj;

	public void setDff(ActivityGoods dff) {
		this.dff = dff;
	}
	public ActivityGoods getDff( ) {
		return this.dff;
	}

	public void setKjkj(String kjkj) {
		this.kjkj = kjkj;
	}
	public String getKjkj( ) {
		return this.kjkj;
	}

}
