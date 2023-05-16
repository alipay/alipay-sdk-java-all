package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AbilityPageQueryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.ability.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:03:18
 */
public class AlipayOpenSearchAbilityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1731131584371348593L;

	/** 
	 * 搜索运营分页数据
	 */
	@ApiField("data")
	private AbilityPageQueryDTO data;

	public void setData(AbilityPageQueryDTO data) {
		this.data = data;
	}
	public AbilityPageQueryDTO getData( ) {
		return this.data;
	}

}
