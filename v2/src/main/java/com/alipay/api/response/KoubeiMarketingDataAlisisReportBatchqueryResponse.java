package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlisisReport;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.alisis.report.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class KoubeiMarketingDataAlisisReportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6753274395558429463L;

	/** 
	 * 报表列表信息
	 */
	@ApiListField("report_list")
	@ApiField("alisis_report")
	private List<AlisisReport> reportList;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setReportList(List<AlisisReport> reportList) {
		this.reportList = reportList;
	}
	public List<AlisisReport> getReportList( ) {
		return this.reportList;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
