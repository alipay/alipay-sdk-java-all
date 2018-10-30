package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ErrorDishStallEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.stallerror.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-26 01:21:46
 */
public class KoubeiCateringPosStallerrorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8165858485849549878L;

	/** 
	 * 档口异常菜品集合模型
	 */
	@ApiField("error_dish_stall_entity")
	private ErrorDishStallEntity errorDishStallEntity;

	public void setErrorDishStallEntity(ErrorDishStallEntity errorDishStallEntity) {
		this.errorDishStallEntity = errorDishStallEntity;
	}
	public ErrorDishStallEntity getErrorDishStallEntity( ) {
		return this.errorDishStallEntity;
	}

}
