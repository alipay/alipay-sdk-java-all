package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.dashboard.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:52:32
 */
public class AlipayMarketingDataDashboardApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6445722185148192422L;

	/** 
	 * 授权失败列表
	 */
	@ApiListField("dashboard_fail_list")
	@ApiField("string")
	private List<String> dashboardFailList;

	/** 
	 * 授权状态
	 */
	@ApiField("status")
	private Boolean status;

	public void setDashboardFailList(List<String> dashboardFailList) {
		this.dashboardFailList = dashboardFailList;
	}
	public List<String> getDashboardFailList( ) {
		return this.dashboardFailList;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
