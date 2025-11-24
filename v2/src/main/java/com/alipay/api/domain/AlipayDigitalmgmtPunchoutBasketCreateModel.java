package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合并购物车
 *
 * @author auto create
 * @since 1.0, 2023-07-11 11:09:48
 */
public class AlipayDigitalmgmtPunchoutBasketCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5327133441847168468L;

	/**
	 * 用于合并购物车
	 */
	@ApiField("param_mall_merge_cart_request_dto")
	private MallMergeCartRequestDto paramMallMergeCartRequestDto;

	public MallMergeCartRequestDto getParamMallMergeCartRequestDto() {
		return this.paramMallMergeCartRequestDto;
	}
	public void setParamMallMergeCartRequestDto(MallMergeCartRequestDto paramMallMergeCartRequestDto) {
		this.paramMallMergeCartRequestDto = paramMallMergeCartRequestDto;
	}

}
