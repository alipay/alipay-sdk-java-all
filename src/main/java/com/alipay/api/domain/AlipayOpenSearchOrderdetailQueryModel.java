package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询搜索服务工单的详细信息
 *
 * @author auto create
 * @since 1.0, 2021-08-09 11:28:52
 */
public class AlipayOpenSearchOrderdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5641731914874241239L;

	/**
	 * 查询申请单详情的入参
	 */
	@ApiField("biz_data")
	private SearchOrderRequest bizData;

	/**
	 * 表示修改内容的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 进行具体操作的类型比如：create、mod、cancel
	 */
	@ApiField("opt_type")
	private String optType;

	public SearchOrderRequest getBizData() {
		return this.bizData;
	}
	public void setBizData(SearchOrderRequest bizData) {
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
