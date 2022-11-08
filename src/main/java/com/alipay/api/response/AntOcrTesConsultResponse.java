package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AccessParams;
import com.alipay.api.domain.MerchantCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.ocr.tes.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-08 11:26:36
 */
public class AntOcrTesConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6157296198781246584L;

	/** 
	 * q
	 */
	@ApiField("hhgghfghj")
	private AccessParams hhgghfghj;

	/** 
	 * 2
	 */
	@ApiField("ppds")
	private String ppds;

	/** 
	 * 1
	 */
	@ApiField("test_3")
	private MerchantCard test3;

	public void setHhgghfghj(AccessParams hhgghfghj) {
		this.hhgghfghj = hhgghfghj;
	}
	public AccessParams getHhgghfghj( ) {
		return this.hhgghfghj;
	}

	public void setPpds(String ppds) {
		this.ppds = ppds;
	}
	public String getPpds( ) {
		return this.ppds;
	}

	public void setTest3(MerchantCard test3) {
		this.test3 = test3;
	}
	public MerchantCard getTest3( ) {
		return this.test3;
	}

}
