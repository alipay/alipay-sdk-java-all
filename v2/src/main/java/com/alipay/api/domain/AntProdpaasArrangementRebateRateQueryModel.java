package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约返点比率查询接口
 *
 * @author auto create
 * @since 1.0, 2025-08-18 22:59:38
 */
public class AntProdpaasArrangementRebateRateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8552658134667479488L;

	/**
	 * 数据项名称
	 */
	@ApiField("data_item_name")
	private String dataItemName;

	/**
	 * 一级类目ID
	 */
	@ApiField("first_category_id")
	private String firstCategoryId;

	/**
	 * 查询时间
	 */
	@ApiField("gmt_query")
	private String gmtQuery;

	public String getDataItemName() {
		return this.dataItemName;
	}
	public void setDataItemName(String dataItemName) {
		this.dataItemName = dataItemName;
	}

	public String getFirstCategoryId() {
		return this.firstCategoryId;
	}
	public void setFirstCategoryId(String firstCategoryId) {
		this.firstCategoryId = firstCategoryId;
	}

	public String getGmtQuery() {
		return this.gmtQuery;
	}
	public void setGmtQuery(String gmtQuery) {
		this.gmtQuery = gmtQuery;
	}

}
