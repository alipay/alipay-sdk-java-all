package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方扩展信息数据响应体结构
 *
 * @author auto create
 * @since 1.0, 2020-08-06 17:41:36
 */
public class CardExtensionInfoData extends AlipayObject {

	private static final long serialVersionUID = 7726566883783889641L;

	/**
	 * 业务唯一标识符，定义本次响应请求唯一业务数据
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * json数据结构，具体不同业务响应数据可定义为map结构进行序列化后响应，详情字段第三方接入方与开发人员协商约定
	 */
	@ApiField("data")
	private String data;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

}
