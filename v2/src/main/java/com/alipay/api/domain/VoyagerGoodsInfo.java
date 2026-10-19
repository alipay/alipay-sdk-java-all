package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:47:54
 */
public class VoyagerGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 1218996416444747767L;

	/**
	 * 商品咨询营销的金额
	 */
	@ApiField("biz_amount")
	private MultiCurrencyMoneyDTO bizAmount;

	/**
	 * 扩展参数（商户 pid、国家区域等），填写json字符串即可
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 咨询营销时唯一商品ID
	 */
	@ApiField("goods_id")
	private String goodsId;

	public MultiCurrencyMoneyDTO getBizAmount() {
		return this.bizAmount;
	}
	public void setBizAmount(MultiCurrencyMoneyDTO bizAmount) {
		this.bizAmount = bizAmount;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

}
