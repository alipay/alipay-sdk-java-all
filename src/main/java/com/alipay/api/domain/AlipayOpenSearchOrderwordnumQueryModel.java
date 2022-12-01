package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索运营服务提报关键词数量查询接口
 *
 * @author auto create
 * @since 1.0, 2021-08-19 19:57:36
 */
public class AlipayOpenSearchOrderwordnumQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8868889199718735818L;

	/**
	 * 搜索关键词可配置数量入参
	 */
	@ApiField("biz_data")
	private SearchOrderBaseKeyWordNumRequest bizData;

	/**
	 * 表示修改内容的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 操作的具体类型
	 */
	@ApiField("opt_type")
	private String optType;

	public SearchOrderBaseKeyWordNumRequest getBizData() {
		return this.bizData;
	}
	public void setBizData(SearchOrderBaseKeyWordNumRequest bizData) {
		this.bizData = bizData;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOptType() {
		return this.optType;
	}
	public void setOptType(String optType) {
		this.optType = optType;
	}

}
