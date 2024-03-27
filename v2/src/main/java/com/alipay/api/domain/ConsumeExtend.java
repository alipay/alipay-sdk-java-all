package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认开通钱包模版扩展参数
 *
 * @author auto create
 * @since 1.0, 2023-12-07 18:20:14
 */
public class ConsumeExtend extends AlipayObject {

	private static final long serialVersionUID = 3314624691891551583L;

	/**
	 * 是否支持圈店宝
	 */
	@ApiField("mall_assign_store")
	private Boolean mallAssignStore;

	/**
	 * 用于回收行业特定业务诉求，其他行业不开放
	 */
	@ApiField("recycle_industry")
	private Boolean recycleIndustry;

	public Boolean getMallAssignStore() {
		return this.mallAssignStore;
	}
	public void setMallAssignStore(Boolean mallAssignStore) {
		this.mallAssignStore = mallAssignStore;
	}

	public Boolean getRecycleIndustry() {
		return this.recycleIndustry;
	}
	public void setRecycleIndustry(Boolean recycleIndustry) {
		this.recycleIndustry = recycleIndustry;
	}

}
