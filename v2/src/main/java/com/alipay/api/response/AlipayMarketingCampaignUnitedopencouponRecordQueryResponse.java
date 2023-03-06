package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UnitedVoucherDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.unitedopencoupon.record.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 01:01:38
 */
public class AlipayMarketingCampaignUnitedopencouponRecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8877166995443559669L;

	/** 
	 * 用户支付宝登录号（脱敏）
	 */
	@ApiField("login_id")
	private String loginId;

	/** 
	 * 用户已领取到的券（奖品）列表信息
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
