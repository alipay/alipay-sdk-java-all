package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信用统一预测接口
 *
 * @author auto create
 * @since 1.0, 2022-09-28 09:55:44
 */
public class ZhimaOpenAppModelpredictQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4285266482748488644L;

	/**
	 * 模型标识，具体走哪个预测平台及模型
	 */
	@ApiField("model")
	private String model;

	/**
	 * 用于模型预测的样本数据，可能是json格式
	 */
	@ApiField("query")
	private String query;

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
