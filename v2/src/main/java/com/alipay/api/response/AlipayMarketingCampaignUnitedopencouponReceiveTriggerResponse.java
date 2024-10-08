package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UnitedVoucherDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.unitedopencoupon.receive.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 23:14:42
 */
public class AlipayMarketingCampaignUnitedopencouponReceiveTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 7625665394348322681L;

	/** 
	 * 用户支付宝登录号（脱敏）
	 */
	@ApiField("login_id")
	private String loginId;

	/** 
	 * 用户本次领取到的券列表信息
	 */
	@ApiListField("voucher_details")
	@ApiField("united_voucher_detail")
	private List<UnitedVoucherDetail> voucherDetails;

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId( ) {
		return this.loginId;
	}

	public void setVoucherDetails(List<UnitedVoucherDetail> voucherDetails) {
		this.voucherDetails = voucherDetails;
	}
	public List<UnitedVoucherDetail> getVoucherDetails( ) {
		return this.voucherDetails;
	}

}
