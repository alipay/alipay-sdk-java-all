package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报表可过滤字段条件
 *
 * @author auto create
 * @since 1.0, 2017-06-16 20:33:21
 */
public class ReportCondition extends AlipayObject {

	private static final long serialVersionUID = 1381199385587641325L;

	/**
	 * 字段名称
	 */
	@ApiField("key")
	private String key;

	/**
	 * 操作符号。可能值：EQ(等于),GT(大于),LT(小于),LTE(小于或等于),GTE(大于或等于),NOT_EQ(不等于),LIKE(like),NOT_LIKE(not like),IN(in),NOT_IN(not in),BETWEEN(between)
	 */
	@ApiField("operate")
	private String operate;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

}
