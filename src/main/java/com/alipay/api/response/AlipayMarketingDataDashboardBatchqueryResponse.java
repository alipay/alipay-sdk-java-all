package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DashBoardMeta;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.dashboard.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingDataDashboardBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6573778142979236525L;

	/** 
	 * 仪表盘列表信息
	 */
	@ApiListField("dashboard_list")
	@ApiField("dash_board_meta")
	private List<DashBoardMeta> dashboardList;

	/** 
	 * 报表总页数
	 */
	@ApiField("total_page_count")
	private String totalPageCount;

	public void setDashboardList(List<DashBoardMeta> dashboardList) {
		this.dashboardList = dashboardList;
	}
	public List<DashBoardMeta> getDashboardList( ) {
		return this.dashboardList;
	}

	public void setTotalPageCount(String totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public String getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
