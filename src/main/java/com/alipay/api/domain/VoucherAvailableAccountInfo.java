package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可用账号
 *
 * @author auto create
 * @since 1.0, 2022-09-27 13:22:21
 */
public class VoucherAvailableAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 8892242675937762598L;

	/**
	 * 优惠券可核销的直连商户PID
	 */
	@ApiListField("available_pids")
	@ApiField("string")
	private List<String> availablePids;

	/**
	 * 优惠券可核销的间连商户SMID
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
