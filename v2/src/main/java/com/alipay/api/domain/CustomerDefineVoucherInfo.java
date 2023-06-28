package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义券类型
 *
 * @author auto create
 * @since 1.0, 2023-06-01 17:31:33
 */
public class CustomerDefineVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 3585336314363312418L;

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
