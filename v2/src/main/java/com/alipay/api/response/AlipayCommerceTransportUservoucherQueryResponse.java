package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserAvailableVoucher;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.uservoucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-15 17:52:54
 */
public class AlipayCommerceTransportUservoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3848315236148294685L;

	/** 
	 * null
	 */
	@ApiListField("user_available_voucher_list")
	@ApiField("user_available_voucher")
	private List<UserAvailableVoucher> userAvailableVoucherList;

	public void setUserAvailableVoucherList(List<UserAvailableVoucher> userAvailableVoucherList) {
		this.userAvailableVoucherList = userAvailableVoucherList;
	}
	public List<UserAvailableVoucher> getUserAvailableVoucherList( ) {
		return this.userAvailableVoucherList;
	}

}
