package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单条线圈数据查询
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:03:15
 */
public class AlipayOpenSpNcoilopenTempQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3895885829319145894L;

	/**
	 * 单条线圈数据唯一标识
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 流水id，通过调用alipay.open.sp.ncoilopen.reference.create接口返回值中获取reference_id
	 */
	@ApiField("reference_id")
	private String referenceId;

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getReferenceId() {
		return this.referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

}
