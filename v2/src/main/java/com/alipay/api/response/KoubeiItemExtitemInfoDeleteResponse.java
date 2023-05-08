package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.info.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:46:35
 */
public class KoubeiItemExtitemInfoDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8786142947484914625L;

	/** 
	 * 删除成功，返回主键id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
