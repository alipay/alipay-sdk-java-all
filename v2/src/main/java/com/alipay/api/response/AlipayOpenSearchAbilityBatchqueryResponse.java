package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AbilityPageQueryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.ability.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-23 13:59:21
 */
public class AlipayOpenSearchAbilityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7176526964614719363L;

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
