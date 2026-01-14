package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 港股通码表响应返回信息
 *
 * @author auto create
 * @since 1.0, 2026-01-06 19:21:39
 */
public class HKStockConnSymbolDTO extends AlipayObject {

	private static final long serialVersionUID = 8655238544512514795L;

	/**
	 * 股票代码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 市场类型, 如深港通 SZ 或沪港通 SH
	 */
	@ApiField("conn_type")
	private String connType;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 数据时间
	 */
	@ApiField("date")
	private Long date;

	/**
	 * 港股通调入时间
	 */
	@ApiField("listed_join_date")
	private Long listedJoinDate;

	/**
	 * 港股通调出时间
	 */
	@ApiField("listed_leave_date")
	private Long listedLeaveDate;

	/**
	 * 是否支持港股通
	 */
	@ApiField("listed_status")
	private Boolean listedStatus;

	/**
	 * 最小购买股数
	 */
	@ApiField("lot_size")
	private Long lotSize;

	/**
	 * 表示标的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 业务子类型
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 股票标的, 如股票代码 00700.HK
	 */
	@ApiField("symbol")
	private String symbol;

	/**
	 * 业务类型
	 */
	@ApiField("type")
	private String type;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getConnType() {
		return this.connType;
	}
	public void setConnType(String connType) {
		this.connType = connType;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getDate() {
		return this.date;
	}
	public void setDate(Long date) {
		this.date = date;
	}

	public Long getListedJoinDate() {
		return this.listedJoinDate;
	}
	public void setListedJoinDate(Long listedJoinDate) {
		this.listedJoinDate = listedJoinDate;
	}

	public Long getListedLeaveDate() {
		return this.listedLeaveDate;
	}
	public void setListedLeaveDate(Long listedLeaveDate) {
		this.listedLeaveDate = listedLeaveDate;
	}

	public Boolean getListedStatus() {
		return this.listedStatus;
	}
	public void setListedStatus(Boolean listedStatus) {
		this.listedStatus = listedStatus;
	}

	public Long getLotSize() {
		return this.lotSize;
	}
	public void setLotSize(Long lotSize) {
		this.lotSize = lotSize;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
