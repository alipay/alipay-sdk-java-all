package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改待解付登记薄
 *
 * @author auto create
 * @since 1.0, 2020-06-28 09:59:12
 */
public class AlipayAccountClearingcenterPayoffModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5747846196966427296L;

	/**
	 * 是否高优先级处理登记薄
	 */
	@ApiField("is_high_priority")
	private Boolean isHighPriority;

	/**
	 * 待解付资金流水号
唯一键
	 */
	@ApiField("pay_off_no")
	private String payOffNo;

	public Boolean getIsHighPriority() {
		return this.isHighPriority;
	}
	public void setIsHighPriority(Boolean isHighPriority) {
		this.isHighPriority = isHighPriority;
	}

	public String getPayOffNo() {
		return this.payOffNo;
	}
	public void setPayOffNo(String payOffNo) {
		this.payOffNo = payOffNo;
	}

}
