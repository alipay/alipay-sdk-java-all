package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliTrustCert;
import com.alipay.api.domain.Aaa;
import com.alipay.api.domain.AlipayDataItemVoucherTemplete;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ddddd response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdDddddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3234153737459587925L;

	/** 
	 * dd
	 */
	@ApiField("acd")
	private AliTrustCert acd;

	/** 
	 * 1
	 */
	@ApiField("adddd")
	private Aaa adddd;

	/** 
	 * aa
	 */
	@ApiField("aeecc")
	private AlipayDataItemVoucherTemplete aeecc;

	public void setAcd(AliTrustCert acd) {
		this.acd = acd;
	}
	public AliTrustCert getAcd( ) {
		return this.acd;
	}

	public void setAdddd(Aaa adddd) {
		this.adddd = adddd;
	}
	public Aaa getAdddd( ) {
		return this.adddd;
	}

	public void setAeecc(AlipayDataItemVoucherTemplete aeecc) {
		this.aeecc = aeecc;
	}
	public AlipayDataItemVoucherTemplete getAeecc( ) {
		return this.aeecc;
	}

}
