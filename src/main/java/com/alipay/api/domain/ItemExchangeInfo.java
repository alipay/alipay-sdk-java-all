package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分兑换奖品信息
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:18:08
 */
public class ItemExchangeInfo extends AlipayObject {

	private static final long serialVersionUID = 4712766486667824183L;

	/**
	 * 交兑换订单时作为外部订单号,用于防重复提交
	 */
	@ApiField("exchange_token")
	private String exchangeToken;

	/**
	 * 奖品code,唯一标识
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 奖品图片
	 */
	@ApiField("item_logo")
	private String itemLogo;

	/**
	 * 奖品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 积分数
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	/**
	 * 积分兑换提示
	 */
	@ApiField("point_exchange_note")
	private String pointExchangeNote;

	/**
	 * 积分单位
	 */
	@ApiField("point_unit")
	private String pointUnit;

	public String getExchangeToken() {
		return this.exchangeToken;
	}
	public void setExchangeToken(String exchangeToken) {
		this.exchangeToken = exchangeToken;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemLogo() {
		return this.itemLogo;
	}
	public void setItemLogo(String itemLogo) {
		this.itemLogo = itemLogo;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getPointAmount() {
		return this.pointAmount;
	}
	public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}

	public String getPointExchangeNote() {
		return this.pointExchangeNote;
	}
	public void setPointExchangeNote(String pointExchangeNote) {
		this.pointExchangeNote = pointExchangeNote;
	}

	public String getPointUnit() {
		return this.pointUnit;
	}
	public void setPointUnit(String pointUnit) {
		this.pointUnit = pointUnit;
	}

}
