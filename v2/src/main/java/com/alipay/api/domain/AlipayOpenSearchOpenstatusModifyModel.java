package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改服务的上架下架状态
 *
 * @author auto create
 * @since 1.0, 2021-08-09 11:29:07
 */
public class AlipayOpenSearchOpenstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1831265742386818411L;

	/**
	 * 修改运营服务的上下架请求入参
	 */
	@ApiField("biz_data")
	private SearchOpenStatusRequest bizData;

	/**
	 * 表示修改内容的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 进行具体操作的类型比如：mod
	 */
	@ApiField("opt_type")
	private String optType;

	public SearchOpenStatusRequest getBizData() {
		return this.bizData;
	}
	public void setBizData(SearchOpenStatusRequest bizData) {
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
