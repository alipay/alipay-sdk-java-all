package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试数据，弱引用复杂类型示例
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:57
 */
public class RainyComplexTypesTheFifteenOne extends AlipayObject {

	private static final long serialVersionUID = 1544942725184355947L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * null
	 */
	@ApiListField("weak_ref")
	@ApiField("rainy_complex_types_the_fourth")
	private List<RainyComplexTypesTheFourth> weakRef;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<RainyComplexTypesTheFourth> getWeakRef() {
		return this.weakRef;
	}
	public void setWeakRef(List<RainyComplexTypesTheFourth> weakRef) {
		this.weakRef = weakRef;
	}

}
