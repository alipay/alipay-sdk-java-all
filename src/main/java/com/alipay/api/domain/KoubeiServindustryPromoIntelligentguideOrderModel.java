package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv开通商户智能导购权限
 *
 * @author auto create
 * @since 1.0, 2021-09-01 11:06:19
 */
public class KoubeiServindustryPromoIntelligentguideOrderModel extends AlipayObject {

	private static final long serialVersionUID = 2583937848694617464L;

	/**
	 * 枚举类型，目前仅支持半年(HALF_YEAR)和一年(ONE_YEAR)，使用前先确认是否有相对应的份额
	 */
	@ApiField("range_type")
	private String rangeType;

	/**
	 * 口碑侧门店shopId
	 */
	@ApiListField("shop_id")
	@ApiField("string")
	private List<String> shopId;

	public String getRangeType() {
		return this.rangeType;
	}
	public void setRangeType(String rangeType) {
		this.rangeType = rangeType;
	}

	public List<String> getShopId() {
		return this.shopId;
	}
	public void setShopId(List<String> shopId) {
		this.shopId = shopId;
	}

}
