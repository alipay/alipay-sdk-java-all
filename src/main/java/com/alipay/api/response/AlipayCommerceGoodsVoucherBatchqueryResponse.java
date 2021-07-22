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
 * @since 1.0, 2021-07-22 16:26:27
 */
public class AlipayCommerceGoodsVoucherBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7692632826883325166L;

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
