package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义券类型
 *
 * @author auto create
 * @since 1.0, 2023-11-01 19:38:07
 */
public class CustomerDefineVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 8631549368539849596L;

	/**
	 * 优惠信息
	 */
	@ApiField("deduct_info")
	private DeductInfo deductInfo;

	public DeductInfo getDeductInfo() {
		return this.deductInfo;
	}
	public void setDeductInfo(DeductInfo deductInfo) {
		this.deductInfo = deductInfo;
	}

}
