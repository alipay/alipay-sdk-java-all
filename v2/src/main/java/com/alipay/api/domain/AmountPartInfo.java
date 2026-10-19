package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点餐团购价格分割信息模型
 *
 * @author auto create
 * @since 1.0, 2026-10-12 13:45:13
 */
public class AmountPartInfo extends AlipayObject {

	private static final long serialVersionUID = 1611315433594293539L;

	/**
	 * 小数点后（小数部分）
	 */
	@ApiField("after_dot")
	private String afterDot;

	/**
	 * 小数点前
	 */
	@ApiField("before_dot")
	private String beforeDot;

	public String getAfterDot() {
		return this.afterDot;
	}
	public void setAfterDot(String afterDot) {
		this.afterDot = afterDot;
	}

	public String getBeforeDot() {
		return this.beforeDot;
	}
	public void setBeforeDot(String beforeDot) {
		this.beforeDot = beforeDot;
	}

}
