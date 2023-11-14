package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.category.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-14 19:18:04
 */
public class AlipayOpenAppItemCategoryPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2521167165156299999L;

	/** 
	 * 商品类目预测预咨询是否提交成功
	 */
	@ApiField("status")
	private Boolean status;

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
