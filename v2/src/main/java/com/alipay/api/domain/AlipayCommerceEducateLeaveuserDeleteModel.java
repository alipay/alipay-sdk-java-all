package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 移除请假申请单
 *
 * @author auto create
 * @since 1.0, 2025-08-29 14:28:13
 */
public class AlipayCommerceEducateLeaveuserDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3563964815113642884L;

	/**
	 * 需要删除的申请单id
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 请假人花名册id
	 */
	@ApiField("roster_id")
	private String rosterId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

}
