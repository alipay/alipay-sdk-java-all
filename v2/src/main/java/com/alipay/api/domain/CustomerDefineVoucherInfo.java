package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义券类型
 *
 * @author auto create
 * @since 1.0, 2023-07-21 11:25:47
 */
public class CustomerDefineVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 6316468366437116668L;

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
