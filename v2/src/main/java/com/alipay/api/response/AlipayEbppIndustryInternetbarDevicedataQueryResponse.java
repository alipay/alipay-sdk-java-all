package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InternetbarDeviceActivityData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.internetbar.devicedata.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-31 10:52:34
 */
public class AlipayEbppIndustryInternetbarDevicedataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7463122332795722213L;

	/** 
	 * null
	 */
	@ApiListField("device_activity_data")
	@ApiField("internetbar_device_activity_data")
	private List<InternetbarDeviceActivityData> deviceActivityData;

	/** 
	 * 总数据量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setDeviceActivityData(List<InternetbarDeviceActivityData> deviceActivityData) {
		this.deviceActivityData = deviceActivityData;
	}
	public List<InternetbarDeviceActivityData> getDeviceActivityData( ) {
		return this.deviceActivityData;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
