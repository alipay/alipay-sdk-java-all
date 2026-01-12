package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收出资账号信息
 *
 * @author auto create
 * @since 1.0, 2025-08-11 22:47:15
 */
public class RecycleDeductOutVO extends AlipayObject {

	private static final long serialVersionUID = 3367273861591742277L;

	/**
	 * 当出资类型=余额，传入出资账户2088. 当出资类型=钱包，传入出资账户钱包ID
	 */
	@ApiField("deduct_out")
	private String deductOut;

	/**
	 * 当出资类型=余额，传入出资账户2088. 当出资类型=钱包，传入出资账户钱包ID
	 */
	@ApiField("deduct_out_open_id")
	private String deductOutOpenId;

	/**
	 * 出资类型枚举
● 用户余额户：balance
● 用户余额户openId：balanceOpenId
● 场景钱包：platformCard
	 */
	@ApiField("deduct_out_type")
	private String deductOutType;

	/**
	 * 出资方的身份标识
	 */
	@ApiField("deduct_pid")
	private String deductPid;

	/**
	 * 出资方的身份标识
	 */
	@ApiField("deduct_pid_open_id")
	private String deductPidOpenId;

	public String getDeductOut() {
		return this.deductOut;
	}
	public void setDeductOut(String deductOut) {
		this.deductOut = deductOut;
	}

	public String getDeductOutOpenId() {
		return this.deductOutOpenId;
	}
	public void setDeductOutOpenId(String deductOutOpenId) {
		this.deductOutOpenId = deductOutOpenId;
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

	public String getDeductPidOpenId() {
		return this.deductPidOpenId;
	}
	public void setDeductPidOpenId(String deductPidOpenId) {
		this.deductPidOpenId = deductPidOpenId;
	}

}
