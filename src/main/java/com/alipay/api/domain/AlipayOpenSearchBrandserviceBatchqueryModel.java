package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询品牌下绑定的可用类目下的服务
 *
 * @author auto create
 * @since 1.0, 2021-08-19 19:57:46
 */
public class AlipayOpenSearchBrandserviceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6717563351336231682L;

	/**
	 * 查询品牌下绑定可用类目入参
	 */
	@ApiField("biz_data")
	private ServiceQueryByConditionRequest bizData;

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

	public ServiceQueryByConditionRequest getBizData() {
		return this.bizData;
	}
	public void setBizData(ServiceQueryByConditionRequest bizData) {
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
