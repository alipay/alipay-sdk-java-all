package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量操作失败结果
 *
 * @author auto create
 * @since 1.0, 2025-05-06 19:31:31
 */
public class OperateFailRes extends AlipayObject {

	private static final long serialVersionUID = 6637215284518512636L;

	/**
	 * 操作失败的创意id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 操作失败原因
	 */
	@ApiField("operate_memo")
	private String operateMemo;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getOperateMemo() {
		return this.operateMemo;
	}
	public void setOperateMemo(String operateMemo) {
		this.operateMemo = operateMemo;
	}

}
