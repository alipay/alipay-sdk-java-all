package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询口碑店铺月均人气分
 *
 * @author auto create
 * @since 1.0, 2017-08-17 13:57:23
 */
public class KoubeiShopDataScoreBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8557361585195818551L;

	/**
	 * 口碑店铺分数查询请求单元
	 */
	@ApiListField("req_items")
	@ApiField("shop_score_req_item")
	private List<ShopScoreReqItem> reqItems;

	public List<ShopScoreReqItem> getReqItems() {
		return this.reqItems;
	}
	public void setReqItems(List<ShopScoreReqItem> reqItems) {
		this.reqItems = reqItems;
	}

}
