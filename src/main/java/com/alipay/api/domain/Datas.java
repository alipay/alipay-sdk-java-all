package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 指标数据模型，包含数据和维度
是一个data数组，可以包含一个或多个请求数据（data）
 *
 * @author auto create
 * @since 1.0, 2017-08-10 16:22:11
 */
public class Datas extends AlipayObject {

	private static final long serialVersionUID = 8147718232317822272L;

	/**
	 * 指标数据区
	 */
	@ApiListField("data")
	@ApiField("data_entry")
	private List<DataEntry> data;

	/**
	 * 数据维度
	 */
	@ApiListField("dimension")
	@ApiField("data_dim")
	private List<DataDim> dimension;

	public List<DataEntry> getData() {
		return this.data;
	}
	public void setData(List<DataEntry> data) {
		this.data = data;
	}

	public List<DataDim> getDimension() {
		return this.dimension;
	}
	public void setDimension(List<DataDim> dimension) {
		this.dimension = dimension;
	}

}
