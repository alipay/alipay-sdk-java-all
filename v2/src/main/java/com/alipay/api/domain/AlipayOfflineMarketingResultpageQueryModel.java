package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备结果页内容查询
 *
 * @author auto create
 * @since 1.0, 2026-04-24 10:52:45
 */
public class AlipayOfflineMarketingResultpageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4639445733818556242L;

	/**
	 * 设备biztid
	 */
	@ApiField("biztid")
	private String biztid;

	/**
	 * 设备itemid
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 标识一次完整的曝光链路
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易类型
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getBiztid() {
		return this.biztid;
	}
	public void setBiztid(String biztid) {
		this.biztid = biztid;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
