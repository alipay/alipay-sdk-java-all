package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RetailActivityPointInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.activitypoints.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 21:57:29
 */
public class AlipayCommerceRetailActivitypointsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2172599635981216422L;

	/** 
	 * 积分活动
	 */
	@ApiListField("activity_info")
	@ApiField("retail_activity_point_info")
	private List<RetailActivityPointInfo> activityInfo;

	/** 
	 * 数据行数
	 */
	@ApiField("total")
	private Long total;

	public void setActivityInfo(List<RetailActivityPointInfo> activityInfo) {
		this.activityInfo = activityInfo;
	}
	public List<RetailActivityPointInfo> getActivityInfo( ) {
		return this.activityInfo;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
