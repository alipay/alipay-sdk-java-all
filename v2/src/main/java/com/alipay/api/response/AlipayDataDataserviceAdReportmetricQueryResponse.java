package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdReportMetricDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.reportmetric.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-21 11:02:36
 */
public class AlipayDataDataserviceAdReportmetricQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1257977311243282174L;

	/** 
	 * 查询指标接口时，返回的指标详情列表
	 */
	@ApiListField("metric_list")
	@ApiField("ad_report_metric_detail")
	private List<AdReportMetricDetail> metricList;

	/** 
	 * 查询的记录总条数
	 */
	@ApiField("total")
	private Long total;

	public void setMetricList(List<AdReportMetricDetail> metricList) {
		this.metricList = metricList;
	}
	public List<AdReportMetricDetail> getMetricList( ) {
		return this.metricList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
