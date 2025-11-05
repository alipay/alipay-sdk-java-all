package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组织架构信息更新
 *
 * @author auto create
 * @since 1.0, 2025-08-06 13:40:34
 */
public class AlipayIserviceCstrainingOrgstructureCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 4637377293559137761L;

	/**
	 * 操作类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 更新数据
	 */
	@ApiField("data")
	private String data;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

}
