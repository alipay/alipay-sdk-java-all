package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 事件风险标签预测
 *
 * @author auto create
 * @since 1.0, 2022-06-14 17:44:22
 */
public class ZhimaOpenAppRisktagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1398743911313863613L;

	/**
	 * 数据类型，风报标识，例 行政处罚，裁判文书
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 模型标识，接口提供方提供
	 */
	@ApiField("model")
	private String model;

	/**
	 * 预测样本数据
	 */
	@ApiField("query")
	private String query;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}
