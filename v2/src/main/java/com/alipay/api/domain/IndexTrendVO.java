package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 趋势图对象
 *
 * @author auto create
 * @since 1.0, 2022-12-30 18:02:44
 */
public class IndexTrendVO extends AlipayObject {

	private static final long serialVersionUID = 5136991965759812983L;

	/**
	 * 一个数据对应的结束日期（含边界），格式yyyymmdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 指标描述tips
	 */
	@ApiField("index_desc")
	private String indexDesc;

	/**
	 * 指标key
	 */
	@ApiField("index_key")
	private String indexKey;

	/**
	 * 指标名称
	 */
	@ApiField("index_name")
	private String indexName;

	/**
	 * 指标值
	 */
	@ApiField("index_value")
	private String indexValue;

	/**
	 * 数据产出日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 一个数据对应的开始日期（含边界），格式yyyymmdd
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getIndexDesc() {
		return this.indexDesc;
	}
	public void setIndexDesc(String indexDesc) {
		this.indexDesc = indexDesc;
	}

	public String getIndexKey() {
		return this.indexKey;
	}
	public void setIndexKey(String indexKey) {
		this.indexKey = indexKey;
	}

	public String getIndexName() {
		return this.indexName;
	}
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public String getIndexValue() {
		return this.indexValue;
	}
	public void setIndexValue(String indexValue) {
		this.indexValue = indexValue;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
