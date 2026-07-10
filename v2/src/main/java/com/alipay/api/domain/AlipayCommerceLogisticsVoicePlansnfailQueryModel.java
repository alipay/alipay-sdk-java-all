package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询投放计划SN物权校验失败明细
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:33
 */
public class AlipayCommerceLogisticsVoicePlansnfailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5226195162748242517L;

	/**
	 * 毫秒时间戳
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 语音计划ID
	 */
	@ApiField("logistics_voice_plan_id")
	private String logisticsVoicePlanId;

	/**
	 * 默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 上一页最大数据ID，用于翻页
	 */
	@ApiField("pre_page_max_data_id")
	private String prePageMaxDataId;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getLogisticsVoicePlanId() {
		return this.logisticsVoicePlanId;
	}
	public void setLogisticsVoicePlanId(String logisticsVoicePlanId) {
		this.logisticsVoicePlanId = logisticsVoicePlanId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPrePageMaxDataId() {
		return this.prePageMaxDataId;
	}
	public void setPrePageMaxDataId(String prePageMaxDataId) {
		this.prePageMaxDataId = prePageMaxDataId;
	}

}
