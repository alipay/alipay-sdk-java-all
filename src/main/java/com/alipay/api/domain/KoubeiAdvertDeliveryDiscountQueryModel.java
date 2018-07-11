package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告投放优惠信息查询接口
 *
 * @author auto create
 * @since 1.0, 2018-03-27 14:39:23
 */
public class KoubeiAdvertDeliveryDiscountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2577773188734925366L;

	/**
	 * 优惠id，调用优惠查询接口时，需要提供“优惠id”
	 */
	@ApiField("item_id")
	private String itemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
