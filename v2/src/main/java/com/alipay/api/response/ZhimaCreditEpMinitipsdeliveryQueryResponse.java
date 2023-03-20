package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.JinyoutestopenidThree;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.minitipsdelivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-16 17:46:41
 */
public class ZhimaCreditEpMinitipsdeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6666472917346632919L;

	/** 
	 * 布尔值，有描述，有注意事项，必须
	 */
	@ApiField("c")
	private Boolean c;

	/** 
	 * 必须，三层复杂类型，有openid
	 */
	@ApiField("jkjp")
	private JinyoutestopenidThree jkjp;

	public void setC(Boolean c) {
		this.c = c;
	}
	public Boolean getC( ) {
		return this.c;
	}

	public void setJkjp(JinyoutestopenidThree jkjp) {
		this.jkjp = jkjp;
	}
	public JinyoutestopenidThree getJkjp( ) {
		return this.jkjp;
	}

}
