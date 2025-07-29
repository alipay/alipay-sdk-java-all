package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业股票信息
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:28:58
 */
public class EpStockInfo extends AlipayObject {

	private static final long serialVersionUID = 3322551965862658763L;

	/**
	 * 股票所属板块
	 */
	@ApiField("board_type")
	private String boardType;

	/**
	 * 股票交易代码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 上市时间
	 */
	@ApiField("market_date")
	private String marketDate;

	/**
	 * 股票简称
	 */
	@ApiField("short_name")
	private String shortName;

	public String getBoardType() {
		return this.boardType;
	}
	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMarketDate() {
		return this.marketDate;
	}
	public void setMarketDate(String marketDate) {
		this.marketDate = marketDate;
	}

	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
