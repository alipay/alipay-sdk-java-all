package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantNdata;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.ntooldata.day.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-04 15:07:42
 */
public class AlipayMerchantNtooldataDayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8311939791833212275L;

	/** 
	 * 设备相关数据列表
	 */
	@ApiListField("data")
	@ApiField("merchant_ndata")
	private List<MerchantNdata> data;

	/** 
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/** 
	 * 数据统计时间
	 */
	@ApiField("metrics_date")
	private String metricsDate;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setData(List<MerchantNdata> data) {
		this.data = data;
	}
	public List<MerchantNdata> getData( ) {
		return this.data;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceType( ) {
		return this.deviceType;
	}

	public void setMetricsDate(String metricsDate) {
		this.metricsDate = metricsDate;
	}
	public String getMetricsDate( ) {
		return this.metricsDate;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

}
