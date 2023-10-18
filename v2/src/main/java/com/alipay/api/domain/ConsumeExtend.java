package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认开通钱包模版扩展参数
 *
 * @author auto create
 * @since 1.0, 2023-10-16 17:10:34
 */
public class ConsumeExtend extends AlipayObject {

	private static final long serialVersionUID = 2473368649299372988L;

	/**
	 * 是否支持圈店宝
	 */
	@ApiField("mall_assign_store")
	private Boolean mallAssignStore;

	public Boolean getMallAssignStore() {
		return this.mallAssignStore;
	}
	public void setMallAssignStore(Boolean mallAssignStore) {
		this.mallAssignStore = mallAssignStore;
	}

}
