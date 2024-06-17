package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序备案审核结果
 *
 * @author auto create
 * @since 1.0, 2023-11-30 14:32:15
 */
public class MiniIcpAuditReason extends AlipayObject {

	private static final long serialVersionUID = 8328554156232311756L;

	/**
	 * 小程序备案结果说明
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
