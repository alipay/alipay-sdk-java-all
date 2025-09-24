package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 股票码表对象
 *
 * @author auto create
 * @since 1.0, 2020-10-26 14:22:24
 */
public class SymbolDTO extends AlipayObject {

	private static final long serialVersionUID = 5711332815948636948L;

	/**
	 * 股票code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 成交单位
	 */
	@ApiField("hand")
	private Long hand;

	/**
	 * 成交单位
	 */
	@ApiField("hand_unit")
	private String handUnit;

	/**
	 * 上市状态：commons-push-model/src/main/proto/model/symbol.proto
	 */
	@ApiField("list_type")
	private String listType;

	/**
	 * 市场
	 */
	@ApiField("market")
	private String market;

	/**
	 * 股票名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 报价单位精度
	 */
	@ApiField("price_decimal")
	private Long priceDecimal;

	/**
	 * 股票子类型
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 股票唯一代码，symbol=code.market
	 */
	@ApiField("symbol")
	private String symbol;

	/**
	 * 股票类型
	 */
	@ApiField("type")
	private String type;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getHand() {
		return this.hand;
	}
	public void setHand(Long hand) {
		this.hand = hand;
	}

	public String getHandUnit() {
		return this.handUnit;
	}
	public void setHandUnit(String handUnit) {
		this.handUnit = handUnit;
	}

	public String getListType() {
		return this.listType;
	}
	public void setListType(String listType) {
		this.listType = listType;
	}

	public String getMarket() {
		return this.market;
	}
	public void setMarket(String market) {
		this.market = market;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPriceDecimal() {
		return this.priceDecimal;
	}
	public void setPriceDecimal(Long priceDecimal) {
		this.priceDecimal = priceDecimal;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getSymbol() {
		return this.symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
