package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收出资账号信息
 *
 * @author auto create
 * @since 1.0, 2025-06-25 14:43:28
 */
public class RecycleDeductOutVO extends AlipayObject {

	private static final long serialVersionUID = 8423647785998846778L;

	/**
	 * 当出资类型=余额，传入出资账户2088. 当出资类型=钱包，传入出资账户钱包ID
	 */
	@ApiField("deduct_out")
	private String deductOut;

	/**
	 * 出资类型枚举
● 用户余额户：balance
● 场景钱包：platformCard
	 */
	@ApiField("deduct_out_type")
	private String deductOutType;

	/**
	 * 出资方的身份标识
	 */
	@ApiField("deduct_pid")
	private String deductPid;

	public String getDeductOut() {
		return this.deductOut;
	}
	public void setDeductOut(String deductOut) {
		this.deductOut = deductOut;
	}

	public String getDeductOutType() {
		return this.deductOutType;
	}
	public void setDeductOutType(String deductOutType) {
		this.deductOutType = deductOutType;
	}

	public String getDeductPid() {
		return this.deductPid;
	}
	public void setDeductPid(String deductPid) {
		this.deductPid = deductPid;
	}

}
