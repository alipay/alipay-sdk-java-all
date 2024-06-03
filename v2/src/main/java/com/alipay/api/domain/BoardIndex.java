package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘看板分析结果数据
 *
 * @author auto create
 * @since 1.0, 2023-01-12 20:59:12
 */
public class BoardIndex extends AlipayObject {

	private static final long serialVersionUID = 8459454245648185562L;

	/**
	 * 指标描述tips
	 */
	@ApiField("index_desc")
	private String indexDesc;

	/**
	 * 指标key，全局唯一，查询内容参考：<a href="https://opendocs.alipay.com/pre-open/04phhq#%E8%B6%8B%E5%8A%BF%E5%88%86%E6%9E%90%E4%B8%8D%E5%90%8Cindex_key%E6%9F%A5%E8%AF%A2" target="_blank">趋势分析不同index_key查询</a>
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
	 * 数据产出日期，格式yyyyMMdd
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
