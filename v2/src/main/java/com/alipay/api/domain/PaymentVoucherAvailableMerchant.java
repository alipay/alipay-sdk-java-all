package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付券可核销商户详情
 *
 * @author auto create
 * @since 1.0, 2023-11-30 11:08:23
 */
public class PaymentVoucherAvailableMerchant extends AlipayObject {

	private static final long serialVersionUID = 1839152872622982766L;

	/**
	 * 优惠券可核销的直连商户PID

限制：
1、available_pids和available_smids至少二选一。
	 */
	@ApiListField("available_pids")
	@ApiField("string")
	private List<String> availablePids;

	/**
	 * 优惠券可核销的间连商户SMID

限制： 
1、available_pids和available_smids至少二选一。
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
