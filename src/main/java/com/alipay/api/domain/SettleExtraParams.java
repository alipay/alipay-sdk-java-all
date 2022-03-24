package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO结算退出与任务描述信息
 *
 * @author auto create
 * @since 1.0, 2021-02-24 16:30:31
 */
public class SettleExtraParams extends AlipayObject {

	private static final long serialVersionUID = 6375445582969554721L;

	/**
	 * quit_type为USER_CANCEL_QUIT或者SETTLE_APPLY_QUIT
	 */
	@ApiField("quit_type")
	private String quitType;

	public String getQuitType() {
		return this.quitType;
	}
	public void setQuitType(String quitType) {
		this.quitType = quitType;
	}

}
