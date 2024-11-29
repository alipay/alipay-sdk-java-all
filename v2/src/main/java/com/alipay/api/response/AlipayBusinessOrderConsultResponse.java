package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserDetailInfo;
import com.alipay.api.domain.VoucherInfoDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.order.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:31:37
 */
public class AlipayBusinessOrderConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3698759275667727359L;

	/** 
	 * 用户详细信息列表，对于会员互通场景，可一次性返回商户、支付宝、平台等用户信息。
	 */
	@ApiField("buyer_info")
	private UserDetailInfo buyerInfo;

	/** 
	 * 订单咨询返回的营销信息。voucher_list中的description、valid_time 以及expired_time信息的返回与否与券本身是否有该信息有关，若券本身不包含该信息则不返回
	 */
	@ApiListField("voucher_list")
	@ApiField("voucher_info_detail")
	private List<VoucherInfoDetail> voucherList;

	public void setBuyerInfo(UserDetailInfo buyerInfo) {
		this.buyerInfo = buyerInfo;
	}
	public UserDetailInfo getBuyerInfo( ) {
		return this.buyerInfo;
	}

	public void setVoucherList(List<VoucherInfoDetail> voucherList) {
		this.voucherList = voucherList;
	}
	public List<VoucherInfoDetail> getVoucherList( ) {
		return this.voucherList;
	}

}
