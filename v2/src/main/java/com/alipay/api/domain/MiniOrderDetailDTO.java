package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单详情模型
 *
 * @author auto create
 * @since 1.0, 2025-02-19 16:55:56
 */
public class MiniOrderDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 6461397517828831121L;

	/**
	 * 商品详细信息
	 */
	@ApiListField("item_infos")
	@ApiField("mini_goods_detail_info_d_t_o")
	private List<MiniGoodsDetailInfoDTO> itemInfos;

	/**
	 * 支付信息
	 */
	@ApiField("pay_info")
	private PayInfoDTO payInfo;

	/**
	 * 价格详细信息
	 */
	@ApiField("price_info")
	private PriceInfoDTO priceInfo;

	public List<MiniGoodsDetailInfoDTO> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<MiniGoodsDetailInfoDTO> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public PayInfoDTO getPayInfo() {
		return this.payInfo;
	}
	public void setPayInfo(PayInfoDTO payInfo) {
		this.payInfo = payInfo;
	}

	public PriceInfoDTO getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(PriceInfoDTO priceInfo) {
		this.priceInfo = priceInfo;
	}

}
