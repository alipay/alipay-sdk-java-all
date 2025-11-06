package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Vouchers;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.coupon.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-28 10:41:21
 */
public class AlipayCommerceMedicalIndustrydataCouponQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5486123589924453821L;

	/** 
	 * 该参数是返回查询得到用户可用营销优惠卷信息，数组为空则表示没有查询到
	 */
	@ApiListField("vouchers")
	@ApiField("vouchers")
	private List<Vouchers> vouchers;

	public void setVouchers(List<Vouchers> vouchers) {
		this.vouchers = vouchers;
	}
	public List<Vouchers> getVouchers( ) {
		return this.vouchers;
	}

}
