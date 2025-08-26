package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报警比较规则
 *
 * @author auto create
 * @since 1.0, 2024-06-05 17:32:26
 */
public class AlarmCompareRule extends AlipayObject {

	private static final long serialVersionUID = 5113637591213873559L;

	/**
	 * 比较操作类型
 - EQ
 - NEQ
 - GT
 - LT
 - LTE
 - GTE
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 比较操作的值
	 */
	@ApiField("operate_value")
	private String operateValue;

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOperateValue() {
		return this.operateValue;
	}
	public void setOperateValue(String operateValue) {
		this.operateValue = operateValue;
	}

}
