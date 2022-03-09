package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 驳回原因列表
 *
 * @author auto create
 * @since 1.0, 2021-11-25 14:50:40
 */
public class MiniAppAuditReasonMemo extends AlipayObject {

	private static final long serialVersionUID = 5868141956172487172L;

	/**
	 * 驳回原因
	 */
	@ApiField("memo")
	private String memo;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
