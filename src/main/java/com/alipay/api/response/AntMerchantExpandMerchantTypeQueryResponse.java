package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.merchant.type.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-29 12:25:01
 */
public class AntMerchantExpandMerchantTypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7842797397373296925L;

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

}
