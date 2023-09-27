package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询如意订单信息
 *
 * @author auto create
 * @since 1.0, 2023-02-14 10:05:15
 */
public class AlipayOpenIotmbsOrderprintreceiptQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3822837368343937641L;

	/**
	 * 订单中心产生的32位指令id
	 */
	@ApiField("instruction_id")
	private String instructionId;

	public String getInstructionId() {
		return this.instructionId;
	}
	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}

}
