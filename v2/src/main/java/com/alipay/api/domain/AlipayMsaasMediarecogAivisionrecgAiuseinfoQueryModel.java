package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI秤每日数据报表接口
 *
 * @author auto create
 * @since 1.0, 2025-08-11 16:34:09
 */
public class AlipayMsaasMediarecogAivisionrecgAiuseinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8683351975732697311L;

	/**
	 * 设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 分析维度
	 */
	@ApiField("dim")
	private String dim;

	/**
	 * 结束时间，查询时间范围不能超过7天
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 商户id，来源商户数据
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 第几页从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 开始时间，查询时间范围不能超过7天
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 门店id，来源于门店信息
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 时间粒度
	 */
	@ApiField("time_period")
	private String timePeriod;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDim() {
		return this.dim;
	}
	public void setDim(String dim) {
		this.dim = dim;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTimePeriod() {
		return this.timePeriod;
	}
	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}

}
