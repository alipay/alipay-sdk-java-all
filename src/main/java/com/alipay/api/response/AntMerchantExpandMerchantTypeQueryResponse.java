package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.merchant.type.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-26 10:49:08
 */
public class AntMerchantExpandMerchantTypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1835293397296244239L;

	/** 
	 * 返回值及对应含义如下：
indirect-纯间连商户
duplex-间连直连双重身份商户
other-其他类型
	 */
	@ApiField("indirect_bind_type")
	private String indirectBindType;

	/** 
	 * 返回值及对应含义
koubei-口碑商户
other-非口碑商户
	 */
	@ApiField("kb_type")
	private String kbType;

	/** 
	 * 返回值及对应汗液如下：
offline_pay_signed-已签约线下支付
other-其他情况
	 */
	@ApiField("merchant_sign_type")
	private String merchantSignType;

	public void setIndirectBindType(String indirectBindType) {
		this.indirectBindType = indirectBindType;
	}
	public String getIndirectBindType( ) {
		return this.indirectBindType;
	}

	public void setKbType(String kbType) {
		this.kbType = kbType;
	}
	public String getKbType( ) {
		return this.kbType;
	}

	public void setMerchantSignType(String merchantSignType) {
		this.merchantSignType = merchantSignType;
	}
	public String getMerchantSignType( ) {
		return this.merchantSignType;
	}

}
