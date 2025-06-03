package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 申报响应结果
 *
 * @author auto create
 * @since 1.0, 2024-12-02 10:48:27
 */
public class BidResult extends AlipayObject {

	private static final long serialVersionUID = 7769416784728924994L;

	/**
	 * 中标调整负荷
	 */
	@ApiListField("bid_adjustment")
	@ApiField("load_info_node")
	private List<LoadInfoNode> bidAdjustment;

	/**
	 * 中标运行负荷
	 */
	@ApiListField("bid_load")
	@ApiField("load_info_node")
	private List<LoadInfoNode> bidLoad;

	/**
	 * 中标价格
	 */
	@ApiListField("bid_price")
	@ApiField("price_info_node")
	private List<PriceInfoNode> bidPrice;

	public List<LoadInfoNode> getBidAdjustment() {
		return this.bidAdjustment;
	}
	public void setBidAdjustment(List<LoadInfoNode> bidAdjustment) {
		this.bidAdjustment = bidAdjustment;
	}

	public List<LoadInfoNode> getBidLoad() {
		return this.bidLoad;
	}
	public void setBidLoad(List<LoadInfoNode> bidLoad) {
		this.bidLoad = bidLoad;
	}

	public List<PriceInfoNode> getBidPrice() {
		return this.bidPrice;
	}
	public void setBidPrice(List<PriceInfoNode> bidPrice) {
		this.bidPrice = bidPrice;
	}

}
