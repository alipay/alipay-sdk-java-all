package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改待解付登记薄
 *
 * @author auto create
 * @since 1.0, 2022-12-01 11:05:33
 */
public class AlipayAccountClearingcenterPayoffModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4833528554473822961L;

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
