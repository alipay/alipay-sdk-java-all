package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MedicalOverallMetric;
import com.alipay.api.domain.OrgServiceMetric;
import com.alipay.api.domain.ServiceTrendsMetric;
import com.alipay.api.domain.ServiceUsedMetric;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insitution.service.preview response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-04 15:22:42
 */
public class AlipayCommerceMedicalInsitutionServicePreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 3297149758883898157L;

	/** 
	 * 医疗全局指标
	 */
	@ApiField("medical_overall_metric")
	private MedicalOverallMetric medicalOverallMetric;

	/** 
	 * null
	 */
	@ApiListField("org_service_metric_list")
	@ApiField("org_service_metric")
	private List<OrgServiceMetric> orgServiceMetricList;

	/** 
	 * null
	 */
	@ApiListField("service_trend_metric_list")
	@ApiField("service_trends_metric")
	private List<ServiceTrendsMetric> serviceTrendMetricList;

	/** 
	 * null
	 */
	@ApiListField("service_used_metric_list")
	@ApiField("service_used_metric")
	private List<ServiceUsedMetric> serviceUsedMetricList;

	public void setMedicalOverallMetric(MedicalOverallMetric medicalOverallMetric) {
		this.medicalOverallMetric = medicalOverallMetric;
	}
	public MedicalOverallMetric getMedicalOverallMetric( ) {
		return this.medicalOverallMetric;
	}

	public void setOrgServiceMetricList(List<OrgServiceMetric> orgServiceMetricList) {
		this.orgServiceMetricList = orgServiceMetricList;
	}
	public List<OrgServiceMetric> getOrgServiceMetricList( ) {
		return this.orgServiceMetricList;
	}

	public void setServiceTrendMetricList(List<ServiceTrendsMetric> serviceTrendMetricList) {
		this.serviceTrendMetricList = serviceTrendMetricList;
	}
	public List<ServiceTrendsMetric> getServiceTrendMetricList( ) {
		return this.serviceTrendMetricList;
	}

	public void setServiceUsedMetricList(List<ServiceUsedMetric> serviceUsedMetricList) {
		this.serviceUsedMetricList = serviceUsedMetricList;
	}
	public List<ServiceUsedMetric> getServiceUsedMetricList( ) {
		return this.serviceUsedMetricList;
	}

}
