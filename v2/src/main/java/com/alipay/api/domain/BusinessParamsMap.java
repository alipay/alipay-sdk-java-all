package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Map类型数据结构
 *
 * @author auto create
 * @since 1.0, 2023-04-07 16:40:17
 */
public class BusinessParamsMap extends AlipayObject {

	private static final long serialVersionUID = 1254323659725729314L;

	/**
	 * 服务变更时间
	 */
	@ApiField("change_time")
	private String changeTime;

	/**
	 * 服务变更后新金额
	 */
	@ApiField("new_amount")
	private String newAmount;

	/**
	 * 原始价格
	 */
	@ApiField("ori_amount")
	private String oriAmount;

	public String getChangeTime() {
		return this.changeTime;
	}
	public void setChangeTime(String changeTime) {
		this.changeTime = changeTime;
	}

	public String getNewAmount() {
		return this.newAmount;
	}
	public void setNewAmount(String newAmount) {
		this.newAmount = newAmount;
	}

	public String getOriAmount() {
		return this.oriAmount;
	}
	public void setOriAmount(String oriAmount) {
		this.oriAmount = oriAmount;
	}

}
