package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PackageUsage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourceusage.package.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-11 11:48:40
 */
public class AlipayCloudCloudbaseResourceusagePackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8644915142484331746L;

	/** 
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/** 
	 * 各计费项用量列表
	 */
	@ApiListField("package_usages")
	@ApiField("package_usage")
	private List<PackageUsage> packageUsages;

	/** 
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setPackageUsages(List<PackageUsage> packageUsages) {
		this.packageUsages = packageUsages;
	}
	public List<PackageUsage> getPackageUsages( ) {
		return this.packageUsages;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime( ) {
		return this.startTime;
	}

}
