package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群看板分析数据
 *
 * @author auto create
 * @since 1.0, 2023-01-05 17:18:55
 */
public class BoardIndex extends AlipayObject {

	private static final long serialVersionUID = 7631346634458271638L;

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

}
