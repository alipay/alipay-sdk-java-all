package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改优惠券可用商户
 *
 * @author auto create
 * @since 1.0, 2021-08-16 21:32:12
 */
public class PaymentVoucherAvailableMerchantModify extends AlipayObject {

	private static final long serialVersionUID = 3892287484767472987L;

	/**
	 * 优惠券可以核销的直连商户PID。默认不修改。
 限制： 
1、核销商户范围只能增大不能减小。
	 */
	@ApiListField("available_pids")
	@ApiField("string")
	private List<String> availablePids;

	/**
	 * 优惠券可以核销的间连商户SMID。默认不修改。
 限制： 
1、核销商户范围只能增大不能减小。
	 */
	@ApiListField("available_smids")
	@ApiField("string")
	private List<String> availableSmids;

	public List<String> getAvailablePids() {
		return this.availablePids;
	}
	public void setAvailablePids(List<String> availablePids) {
		this.availablePids = availablePids;
	}

	public List<String> getAvailableSmids() {
		return this.availableSmids;
	}
	public void setAvailableSmids(List<String> availableSmids) {
		this.availableSmids = availableSmids;
	}

}
