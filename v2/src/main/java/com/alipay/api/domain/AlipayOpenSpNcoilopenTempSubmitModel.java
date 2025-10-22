package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线圈信息申请信息提交
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:03:57
 */
public class AlipayOpenSpNcoilopenTempSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6547471178441796122L;

	/**
	 * 流水id，通过调用alipay.open.sp.ncoilopen.reference.create接口返回值中获取reference_id
	 */
	@ApiField("reference_id")
	private String referenceId;

	public String getReferenceId() {
		return this.referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

}
