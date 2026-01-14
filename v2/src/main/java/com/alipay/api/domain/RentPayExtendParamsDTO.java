package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁支付扩展参数
 *
 * @author auto create
 * @since 1.0, 2025-11-28 10:56:26
 */
public class RentPayExtendParamsDTO extends AlipayObject {

	private static final long serialVersionUID = 2377893887251569659L;

	/**
	 * 付款备注
	 */
	@ApiField("memo")
	private String memo;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
