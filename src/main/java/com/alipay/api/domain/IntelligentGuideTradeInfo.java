package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能导购交易数据模型
 *
 * @author auto create
 * @since 1.0, 2019-11-12 11:16:56
 */
public class IntelligentGuideTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 6231995736538751561L;

	/**
	 * 商户在口碑侧的门店id，校验纯数字，28位
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商户门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 单个门店下的具体交易信息列表
	 */
	@ApiListField("trade_details")
	@ApiField("intelligent_guide_trade_detail")
	private List<IntelligentGuideTradeDetail> tradeDetails;

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

	public List<IntelligentGuideTradeDetail> getTradeDetails() {
		return this.tradeDetails;
	}
	public void setTradeDetails(List<IntelligentGuideTradeDetail> tradeDetails) {
		this.tradeDetails = tradeDetails;
	}

}
