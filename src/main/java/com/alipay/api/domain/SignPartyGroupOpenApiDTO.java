package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署分组
 *
 * @author auto create
 * @since 1.0, 2021-12-27 18:07:42
 */
public class SignPartyGroupOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 2166331716138193697L;

	/**
	 * 签署主体列表
	 */
	@ApiListField("sign_parties")
	@ApiField("sign_party_open_api_d_t_o")
	private List<SignPartyOpenApiDTO> signParties;

	public List<SignPartyOpenApiDTO> getSignParties() {
		return this.signParties;
	}
	public void setSignParties(List<SignPartyOpenApiDTO> signParties) {
		this.signParties = signParties;
	}

}
