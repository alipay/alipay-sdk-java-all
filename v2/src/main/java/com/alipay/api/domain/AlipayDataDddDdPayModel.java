package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试接口负责人创建
 *
 * @author auto create
 * @since 1.0, 2026-07-06 15:52:55
 */
public class AlipayDataDddDdPayModel extends AlipayObject {

	private static final long serialVersionUID = 6637719321418263432L;

	/**
	 * test case
	 */
	@ApiField("dem_ref")
	private RainyComplexTypesTheten demRef;

	public RainyComplexTypesTheten getDemRef() {
		return this.demRef;
	}
	public void setDemRef(RainyComplexTypesTheten demRef) {
		this.demRef = demRef;
	}

}
