package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一卡通消费记录
 *
 * @author auto create
 * @since 1.0, 2019-02-13 17:11:57
 */
public class CardTradeList extends AlipayObject {

	private static final long serialVersionUID = 3189287637467384675L;

	/**
	 * 事由描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 操作类型0充值 1消费
	 */
	@ApiField("flag")
	private Long flag;

	/**
	 * 交易发生时间，格式为2018-07-20 12:16:25
	 */
	@ApiField("opdt")
	private String opdt;

	/**
	 * 触发金额
	 */
	@ApiField("opfare")
	private String opfare;

	/**
	 * 交易钱包类型0主钱包 1补助钱包 2混合消费 3电子钱包
	 */
	@ApiField("type")
	private Long type;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getFlag() {
		return this.flag;
	}
	public void setFlag(Long flag) {
		this.flag = flag;
	}

	public String getOpdt() {
		return this.opdt;
	}
	public void setOpdt(String opdt) {
		this.opdt = opdt;
	}

	public String getOpfare() {
		return this.opfare;
	}
	public void setOpfare(String opfare) {
		this.opfare = opfare;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
