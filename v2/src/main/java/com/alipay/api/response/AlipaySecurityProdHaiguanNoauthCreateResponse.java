package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.haiguan.noauth.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 20:42:11
 */
public class AlipaySecurityProdHaiguanNoauthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1688164461445448574L;

	/** 
	 * 23
	 */
	@ApiField("out_one")
	private String outOne;

	/** 
	 * 23
	 */
	@ApiField("out_three")
	private String outThree;

	/** 
	 * 32
	 */
	@ApiListField("out_two")
	@ApiField("string")
	private List<String> outTwo;

	public void setOutOne(String outOne) {
		this.outOne = outOne;
	}
	public String getOutOne( ) {
		return this.outOne;
	}

	public void setOutThree(String outThree) {
		this.outThree = outThree;
	}
	public String getOutThree( ) {
		return this.outThree;
	}

	public void setOutTwo(List<String> outTwo) {
		this.outTwo = outTwo;
	}
	public List<String> getOutTwo( ) {
		return this.outTwo;
	}

}
