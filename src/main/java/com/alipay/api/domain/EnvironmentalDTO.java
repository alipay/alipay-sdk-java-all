package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对应订单有环保类型时，能量发放结果
 *
 * @author auto create
 * @since 1.0, 2022-06-08 10:53:58
 */
public class EnvironmentalDTO extends AlipayObject {

	private static final long serialVersionUID = 6763994675125664936L;

	/**
	 * 一个环保行为实际发放的数量
	 */
	@ApiField("energy_amount")
	private String energyAmount;

	/**
	 * 商品对应的环保类型; 字典值:
临时商品:
替换装:
FSC:
	 */
	@ApiField("environmental")
	private String environmental;

	/**
	 * 能量发放失败字典值对应数值
404
406
407
415
701
702
707
N1301
	 */
	@ApiField("failure_code")
	private String failureCode;

	/**
	 * 能量发放失败原因
商户信息不存在
商户签约信息不存在
签约信息不合法
签约状态未上线或用户不再商户的灰度名单中
超出限额
用户关闭授权
业务时间相差太久
	 */
	@ApiField("failure_reason")
	private String failureReason;

	/**
	 * 一个环保行为能量发放状态; "0"代表成功，“-1”代表失败
	 */
	@ApiField("status")
	private String status;

	public String getEnergyAmount() {
		return this.energyAmount;
	}
	public void setEnergyAmount(String energyAmount) {
		this.energyAmount = energyAmount;
	}

	public String getEnvironmental() {
		return this.environmental;
	}
	public void setEnvironmental(String environmental) {
		this.environmental = environmental;
	}

	public String getFailureCode() {
		return this.failureCode;
	}
	public void setFailureCode(String failureCode) {
		this.failureCode = failureCode;
	}

	public String getFailureReason() {
		return this.failureReason;
	}
	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
