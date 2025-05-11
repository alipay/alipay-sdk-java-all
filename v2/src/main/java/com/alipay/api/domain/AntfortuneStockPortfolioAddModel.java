package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 添加标的到自选列表
 *
 * @author auto create
 * @since 1.0, 2025-01-09 10:31:51
 */
public class AntfortuneStockPortfolioAddModel extends AlipayObject {

	private static final long serialVersionUID = 8129636356785854747L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 需要添加到支付宝自选列表的标的
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
