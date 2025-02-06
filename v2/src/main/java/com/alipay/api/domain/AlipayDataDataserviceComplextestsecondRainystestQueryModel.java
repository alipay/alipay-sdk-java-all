package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 复杂类型接口引用01_老流程
 *
 * @author auto create
 * @since 1.0, 2024-12-12 14:17:24
 */
public class AlipayDataDataserviceComplextestsecondRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3387427425115582862L;

	/**
	 * 引用同迭代的复杂类型
	 */
	@ApiField("tc_case_01")
	private RainyComplexTypesTheFourth tcCase01;

	public RainyComplexTypesTheFourth getTcCase01() {
		return this.tcCase01;
	}
	public void setTcCase01(RainyComplexTypesTheFourth tcCase01) {
		this.tcCase01 = tcCase01;
	}

}
