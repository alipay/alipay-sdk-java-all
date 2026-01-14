package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家碰数据日维度查询
 *
 * @author auto create
 * @since 1.0, 2025-12-04 15:04:20
 */
public class AlipayMerchantNtooldataDayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7156421752755147111L;

	/**
	 * 设备id，N7传sn，小蓝环和音箱传tagid
	 */
	@ApiListField("device_id_list")
	@ApiField("string")
	private List<String> deviceIdList;

	/**
	 * 查询设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 数据统计时间，具体到某年某月某天
	 */
	@ApiField("metrics_date")
	private String metricsDate;

	/**
	 * 第几页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 一页多少
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商户smid号
	 */
	@ApiListField("smid_list")
	@ApiField("string")
	private List<String> smidList;

	public List<String> getDeviceIdList() {
		return this.deviceIdList;
	}
	public void setDeviceIdList(List<String> deviceIdList) {
		this.deviceIdList = deviceIdList;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getMetricsDate() {
		return this.metricsDate;
	}
	public void setMetricsDate(String metricsDate) {
		this.metricsDate = metricsDate;
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

	public List<String> getSmidList() {
		return this.smidList;
	}
	public void setSmidList(List<String> smidList) {
		this.smidList = smidList;
	}

}
