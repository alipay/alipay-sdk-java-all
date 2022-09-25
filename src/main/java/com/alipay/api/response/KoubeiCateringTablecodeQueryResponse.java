package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.tablecode.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringTablecodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2474477498477683488L;

	/** 
	 * 返回值为shop_code表示只返回了门店码 返回值为table_code表示返回了桌码跟门店码
	 */
	@ApiField("code_flag")
	private String codeFlag;

	/** 
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 桌码
	 */
	@ApiField("table_num")
	private String tableNum;

	public void setCodeFlag(String codeFlag) {
		this.codeFlag = codeFlag;
	}
	public String getCodeFlag( ) {
		return this.codeFlag;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}
	public String getTableNum( ) {
		return this.tableNum;
	}

}
