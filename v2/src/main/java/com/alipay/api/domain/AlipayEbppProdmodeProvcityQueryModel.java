package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询省市地区接口
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:01:57
 */
public class AlipayEbppProdmodeProvcityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6614315487382275798L;

	/**
	 * 省市编号
	 */
	@ApiField("adcode")
	private String adcode;

	/**
	 * 查询类型，queryType=1,查询省下面的市信息
	 */
	@ApiField("query_type")
	private String queryType;

	public String getAdcode() {
		return this.adcode;
	}
	public void setAdcode(String adcode) {
		this.adcode = adcode;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

}
