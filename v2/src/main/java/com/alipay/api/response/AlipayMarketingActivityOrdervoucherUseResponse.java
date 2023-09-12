package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VoucherUseDetailResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.use response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:36:44
 */
public class AlipayMarketingActivityOrdervoucherUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1211357511463697689L;

	/** 
	 * 优惠券活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 券核销详情返回结果
	 */
	@ApiField("voucher_use_detail_result_info")
	private VoucherUseDetailResultInfo voucherUseDetailResultInfo;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setVoucherUseDetailResultInfo(VoucherUseDetailResultInfo voucherUseDetailResultInfo) {
		this.voucherUseDetailResultInfo = voucherUseDetailResultInfo;
	}
	public VoucherUseDetailResultInfo getVoucherUseDetailResultInfo( ) {
		return this.voucherUseDetailResultInfo;
	}

}
