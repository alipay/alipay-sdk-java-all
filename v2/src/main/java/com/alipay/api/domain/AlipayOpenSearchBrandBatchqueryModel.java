package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询账号下的上架品牌数据及关联的品牌box
 *
 * @author auto create
 * @since 1.0, 2021-08-19 19:57:22
 */
public class AlipayOpenSearchBrandBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6276859938382938329L;

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
