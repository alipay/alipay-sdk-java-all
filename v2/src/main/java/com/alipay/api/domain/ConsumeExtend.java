package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认开通钱包模版扩展参数
 *
 * @author auto create
 * @since 1.0, 2023-10-19 16:33:32
 */
public class ConsumeExtend extends AlipayObject {

	private static final long serialVersionUID = 8582594329534556832L;

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
