package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.user.activityvoucher.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:52:41
 */
public class AlipayMarketingCampaignUserActivityvoucherBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6818175791772279389L;

	/** 
	 * 活动券列表
	 */
	@ApiListField("activity_voucher_list")
	@ApiField("activity_voucher_info")
	private List<ActivityVoucherInfo> activityVoucherList;

	public void setActivityVoucherList(List<ActivityVoucherInfo> activityVoucherList) {
		this.activityVoucherList = activityVoucherList;
	}
	public List<ActivityVoucherInfo> getActivityVoucherList( ) {
		return this.activityVoucherList;
	}

}
