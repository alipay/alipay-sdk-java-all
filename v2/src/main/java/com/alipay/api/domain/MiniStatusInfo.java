package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销状态信息
 *
 * @author auto create
 * @since 1.0, 2025-10-21 19:20:59
 */
public class MiniStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 4198245734521476129L;

	/**
	 * 状态
	 */
	@ApiField("display_status")
	private String displayStatus;

	/**
	 * 核销状态描述
	 */
	@ApiField("display_status_desc")
	private String displayStatusDesc;

	public String getDisplayStatus() {
		return this.displayStatus;
	}
	public void setDisplayStatus(String displayStatus) {
		this.displayStatus = displayStatus;
	}

	public String getDisplayStatusDesc() {
		return this.displayStatusDesc;
	}
	public void setDisplayStatusDesc(String displayStatusDesc) {
		this.displayStatusDesc = displayStatusDesc;
	}

}
