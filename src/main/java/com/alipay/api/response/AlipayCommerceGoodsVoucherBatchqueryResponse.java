package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CampVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.goods.voucher.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-09 16:45:21
 */
public class AlipayCommerceGoodsVoucherBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8897451998918384595L;

	/** 
	 * 活动信息
	 */
	@ApiListField("activities")
	@ApiField("camp_voucher_info")
	private List<CampVoucherInfo> activities;

	public void setActivities(List<CampVoucherInfo> activities) {
		this.activities = activities;
	}
	public List<CampVoucherInfo> getActivities( ) {
		return this.activities;
	}

}
