package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ItemDiscountDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.promodecision.consult.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-03 14:37:04
 */
public class AlipayOpenMiniPromodecisionConsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4285874592738235267L;

	/** 
	 * 商详优惠信息
	 */
	@ApiField("discount_detail_info")
	private ItemDiscountDetailInfo discountDetailInfo;

	/** 
	 * 错误码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setDiscountDetailInfo(ItemDiscountDetailInfo discountDetailInfo) {
		this.discountDetailInfo = discountDetailInfo;
	}
	public ItemDiscountDetailInfo getDiscountDetailInfo( ) {
		return this.discountDetailInfo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
