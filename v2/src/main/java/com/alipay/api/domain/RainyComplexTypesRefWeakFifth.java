package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试数据，匿名复杂类型示例
 *
 * @author auto create
 * @since 1.0, 2025-05-07 10:32:27
 */
public class RainyComplexTypesRefWeakFifth extends AlipayObject {

	private static final long serialVersionUID = 6394851699973282535L;

	/**
	 * 测试数据
	 */
	@ApiField("demo_case")
	private String demoCase;

	/**
	 * null
	 */
	@ApiListField("demo_ref_list")
	@ApiField("rainys_complex_type_weak_ref_fifth")
	private List<RainysComplexTypeWeakRefFifth> demoRefList;

	public String getDemoCase() {
		return this.demoCase;
	}
	public void setDemoCase(String demoCase) {
		this.demoCase = demoCase;
	}

	public List<RainysComplexTypeWeakRefFifth> getDemoRefList() {
		return this.demoRefList;
	}
	public void setDemoRefList(List<RainysComplexTypeWeakRefFifth> demoRefList) {
		this.demoRefList = demoRefList;
	}

}
