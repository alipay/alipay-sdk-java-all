package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberCouponCodeDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.card.exchange.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-29 23:37:39
 */
public class AlipayCommerceMedicalCardExchangeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1867693918835233416L;

	/** 
	 * 兑换券码信息
	 */
	@ApiListField("coupon_code_list")
	@ApiField("member_coupon_code_d_t_o")
	private List<MemberCouponCodeDTO> couponCodeList;

	public void setCouponCodeList(List<MemberCouponCodeDTO> couponCodeList) {
		this.couponCodeList = couponCodeList;
	}
	public List<MemberCouponCodeDTO> getCouponCodeList( ) {
		return this.couponCodeList;
	}

}
