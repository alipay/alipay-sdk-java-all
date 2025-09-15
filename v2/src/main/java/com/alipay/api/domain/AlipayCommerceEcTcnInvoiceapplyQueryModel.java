package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票申请查询
 *
 * @author auto create
 * @since 1.0, 2023-09-19 15:13:30
 */
public class AlipayCommerceEcTcnInvoiceapplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1181241198875866259L;

	/**
	 * 开票申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 平台申请ID
	 */
	@ApiField("platform_apply_id")
	private String platformApplyId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getPlatformApplyId() {
		return this.platformApplyId;
	}
	public void setPlatformApplyId(String platformApplyId) {
		this.platformApplyId = platformApplyId;
	}

}
