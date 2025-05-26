package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 完全copy和字段copy引用类型的复杂类型
 *
 * @author auto create
 * @since 1.0, 2025-05-07 10:30:11
 */
public class RainyComplexTypesTheFourteen extends AlipayObject {

	private static final long serialVersionUID = 6469866492449256674L;

	/**
	 * 复杂类型2.0新增的数据
	 */
	@ApiField("demo_case")
	private RainyComplexTypesRefWeakFirst demoCase;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 完全引用
	 */
	@ApiListField("weak_ref")
	@ApiField("rainy_complex_types_the_fourth")
	private List<RainyComplexTypesTheFourth> weakRef;

	public RainyComplexTypesRefWeakFirst getDemoCase() {
		return this.demoCase;
	}
	public void setDemoCase(RainyComplexTypesRefWeakFirst demoCase) {
		this.demoCase = demoCase;
	}

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
