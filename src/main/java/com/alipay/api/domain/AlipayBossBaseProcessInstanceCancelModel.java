package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 撤消流程实例
 *
 * @author auto create
 * @since 1.0, 2020-08-26 17:05:03
 */
public class AlipayBossBaseProcessInstanceCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8719866299252737455L;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 处理人域账号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 流程全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

}
