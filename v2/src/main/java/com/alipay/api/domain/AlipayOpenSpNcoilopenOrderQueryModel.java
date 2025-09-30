package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据orderId查询申请单信息
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:04:28
 */
public class AlipayOpenSpNcoilopenOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8743138689742792319L;

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
