package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询提交后返回的任务结果
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:04:14
 */
public class AlipayOpenSpNcoilopenTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5647498464134621322L;

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
