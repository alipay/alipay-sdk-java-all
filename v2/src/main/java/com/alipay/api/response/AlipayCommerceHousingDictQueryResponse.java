package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnumModelDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.dict.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:26
 */
public class AlipayCommerceHousingDictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2764923247836154166L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("enum_model_d_t_o")
	private List<EnumModelDTO> list;

	public void setList(List<EnumModelDTO> list) {
		this.list = list;
	}
	public List<EnumModelDTO> getList( ) {
		return this.list;
	}

}
