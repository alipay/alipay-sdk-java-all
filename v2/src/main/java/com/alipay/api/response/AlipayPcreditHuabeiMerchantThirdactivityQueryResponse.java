package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ThirdActivityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.thirdactivity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-10 15:32:39
 */
public class AlipayPcreditHuabeiMerchantThirdactivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6737876792236964674L;

	/** 
	 * 活动信息列表
	 */
	@ApiListField("activity_info_list")
	@ApiField("third_activity_info")
	private List<ThirdActivityInfo> activityInfoList;

	public void setActivityInfoList(List<ThirdActivityInfo> activityInfoList) {
		this.activityInfoList = activityInfoList;
	}
	public List<ThirdActivityInfo> getActivityInfoList( ) {
		return this.activityInfoList;
	}

}
