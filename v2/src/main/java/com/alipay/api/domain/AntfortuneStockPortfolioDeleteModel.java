package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 从自选列表删除标的
 *
 * @author auto create
 * @since 1.0, 2025-01-09 10:32:16
 */
public class AntfortuneStockPortfolioDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5781997278264474925L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 股票标的列表
	 */
	@ApiListField("symbol_list")
	@ApiField("string")
	private List<String> symbolList;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getSymbolList() {
		return this.symbolList;
	}
	public void setSymbolList(List<String> symbolList) {
		this.symbolList = symbolList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
