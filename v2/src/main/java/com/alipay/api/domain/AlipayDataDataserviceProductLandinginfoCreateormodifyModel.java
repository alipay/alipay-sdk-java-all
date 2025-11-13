package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品落地页信息创建或更新
 *
 * @author auto create
 * @since 1.0, 2025-10-09 12:34:53
 */
public class AlipayDataDataserviceProductLandinginfoCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 1883962743485797191L;

	/**
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 每次请求需要包含全量的落地页信息，本次请求的落地页信息会对之前的落地页信息来做覆盖操作
	 */
	@ApiListField("landing")
	@ApiField("landing_type_dto")
	private List<LandingTypeDto> landing;

	/**
	 * 商家侧商品ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<LandingTypeDto> getLanding() {
		return this.landing;
	}
	public void setLanding(List<LandingTypeDto> landing) {
		this.landing = landing;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

}
