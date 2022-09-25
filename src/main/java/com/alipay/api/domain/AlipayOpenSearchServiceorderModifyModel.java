package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索运营提报服务工单接口
 *
 * @author auto create
 * @since 1.0, 2021-08-19 14:19:39
 */
public class AlipayOpenSearchServiceorderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3593149765557493232L;

	/**
	 * 创建搜索运营申请单的入参。base_items、brand_items、service_items 分别为基础信息、品牌直达、服务直达的模块数据信息，需根据提报类型选择进行相应的设置，不能同时填写。
	 */
	@ApiField("biz_data")
	private SearchOrderCreateRequest bizData;

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

	public SearchOrderCreateRequest getBizData() {
		return this.bizData;
	}
	public void setBizData(SearchOrderCreateRequest bizData) {
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
