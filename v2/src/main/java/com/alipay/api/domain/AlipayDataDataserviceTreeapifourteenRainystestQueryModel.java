package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型测试接口14_copy复杂类型
 *
 * @author auto create
 * @since 1.0, 2025-07-29 15:38:44
 */
public class AlipayDataDataserviceTreeapifourteenRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2453651264744428585L;

	/**
	 * 完全copy引用复杂类型
	 */
	@ApiField("req_copy_weak_ref")
	private RainyComplexTypesTheFourteen reqCopyWeakRef;

	/**
	 * 字段copy引用
	 */
	@ApiField("req_field_weak_ref")
	private RainyComplexTypesTheFourteen reqFieldWeakRef;

	public RainyComplexTypesTheFourteen getReqCopyWeakRef() {
		return this.reqCopyWeakRef;
	}
	public void setReqCopyWeakRef(RainyComplexTypesTheFourteen reqCopyWeakRef) {
		this.reqCopyWeakRef = reqCopyWeakRef;
	}

	public RainyComplexTypesTheFourteen getReqFieldWeakRef() {
		return this.reqFieldWeakRef;
	}
	public void setReqFieldWeakRef(RainyComplexTypesTheFourteen reqFieldWeakRef) {
		this.reqFieldWeakRef = reqFieldWeakRef;
	}

}
