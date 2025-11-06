package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型测试接口13_引用复杂类型
 *
 * @author auto create
 * @since 1.0, 2025-04-15 13:53:48
 */
public class AlipayDataDataserviceTreeapithirdteenRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2668172367947847388L;

	/**
	 * 引用复杂类型
	 */
	@ApiField("req_ref_strong")
	private RainyComplexTypesTheThirteen reqRefStrong;

	public RainyComplexTypesTheThirteen getReqRefStrong() {
		return this.reqRefStrong;
	}
	public void setReqRefStrong(RainyComplexTypesTheThirteen reqRefStrong) {
		this.reqRefStrong = reqRefStrong;
	}

}
