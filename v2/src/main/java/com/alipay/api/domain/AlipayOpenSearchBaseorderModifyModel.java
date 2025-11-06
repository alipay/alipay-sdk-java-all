package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索运营提报基础服务工单接口
 *
 * @author auto create
 * @since 1.0, 2023-07-24 14:37:38
 */
public class AlipayOpenSearchBaseorderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1511347671337136882L;

	/**
	 * 基础工单提报入参
	 */
	@ApiField("biz_data")
	private SearchBaseOrderCreateApiRequest bizData;

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

	public SearchBaseOrderCreateApiRequest getBizData() {
		return this.bizData;
	}
	public void setBizData(SearchBaseOrderCreateApiRequest bizData) {
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
