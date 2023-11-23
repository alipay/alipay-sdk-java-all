package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 使用规则信息
 *
 * @author auto create
 * @since 1.0, 2016-06-23 17:38:07
 */
public class UseRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 6493525134712472798L;

	/**
	 * 适用门店列表
	 */
	@ApiListField("suitable_shops")
	@ApiField("string")
	private List<String> suitableShops;

	/**
	 * 核销方式
	 */
	@ApiListField("use_mode")
	@ApiField("string")
	private List<String> useMode;

	public List<String> getSuitableShops() {
		return this.suitableShops;
	}
	public void setSuitableShops(List<String> suitableShops) {
		this.suitableShops = suitableShops;
	}

	public List<String> getUseMode() {
		return this.useMode;
	}
	public void setUseMode(List<String> useMode) {
		this.useMode = useMode;
	}

}
