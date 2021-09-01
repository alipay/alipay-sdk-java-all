package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验不合法的交易数据详情
 *
 * @author auto create
 * @since 1.0, 2019-11-12 11:16:57
 */
public class InvalidTradeDetail extends AlipayObject {

	private static final long serialVersionUID = 3519553678392425562L;

	/**
	 * 错误信息，用于描述单条交易数据错误原因
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 商户口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商户门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商户单门店下线下交易数据详细信息
	 */
	@ApiField("trade_detail")
	private IntelligentGuideTradeDetail tradeDetail;

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public IntelligentGuideTradeDetail getTradeDetail() {
		return this.tradeDetail;
	}
	public void setTradeDetail(IntelligentGuideTradeDetail tradeDetail) {
		this.tradeDetail = tradeDetail;
	}

}
