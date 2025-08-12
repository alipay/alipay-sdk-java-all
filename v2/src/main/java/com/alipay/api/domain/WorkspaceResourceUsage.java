package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资源包用量信息
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:26:56
 */
public class WorkspaceResourceUsage extends AlipayObject {

	private static final long serialVersionUID = 2281719431725631215L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 产品下各计费项用量详情列表
	 */
	@ApiListField("product_usage_infos")
	@ApiField("product_usage_info")
	private List<ProductUsageInfo> productUsageInfos;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<ProductUsageInfo> getProductUsageInfos() {
		return this.productUsageInfos;
	}
	public void setProductUsageInfos(List<ProductUsageInfo> productUsageInfos) {
		this.productUsageInfos = productUsageInfos;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
