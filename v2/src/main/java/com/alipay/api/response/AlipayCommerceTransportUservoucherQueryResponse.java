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
 * @since 1.0, 2026-09-01 14:32:53
 */
public class AlipayCommerceTransportUservoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3435694432865113669L;

	/** 
	 * 优惠力度最大的单张券
	 */
	@ApiField("best_voucher")
	private UserAvailableVoucher bestVoucher;

	/** 
	 * null
	 */
	@ApiListField("user_available_voucher_list")
	@ApiField("user_available_voucher")
	private List<UserAvailableVoucher> userAvailableVoucherList;

	public void setBestVoucher(UserAvailableVoucher bestVoucher) {
		this.bestVoucher = bestVoucher;
	}
	public UserAvailableVoucher getBestVoucher( ) {
		return this.bestVoucher;
	}

	public void setUserAvailableVoucherList(List<UserAvailableVoucher> userAvailableVoucherList) {
		this.userAvailableVoucherList = userAvailableVoucherList;
	}
	public List<UserAvailableVoucher> getUserAvailableVoucherList( ) {
		return this.userAvailableVoucherList;
	}

}
