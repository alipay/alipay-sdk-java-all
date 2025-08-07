package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品商家群活动内容模型
 *
 * @author auto create
 * @since 1.0, 2025-03-06 15:40:10
 */
public class GoodsActivityContentVO extends AlipayObject {

	private static final long serialVersionUID = 4238782975377395791L;

	/**
	 * 商品Id。传入商品id后可支持在群内发商品消息。请先通过小程序商品创建接口<a href="https://opendocs.alipay.com/mini/4880cf68_alipay.open.app.item.create?scene=common&pathHash=250eb20d">https://opendocs.alipay.com/mini/4880cf68_alipay.open.app.item.create?scene=common&pathHash=250eb20d</a> 或小程序本地商品创建接口<a href="https://opendocs.alipay.com/mini/4aa8dac1_alipay.open.app.localitem.create?pathHash=9bdb074d&highlight_field=item_id">https://opendocs.alipay.com/mini/4aa8dac1_alipay.open.app.localitem.create?pathHash=9bdb074d&highlight_field=item_id</a>创建商品，并获取item_id 平台侧商品ID作为这个入参的值。
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 应用ID
	 */
	@ApiField("related_app_id")
	private String relatedAppId;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getRelatedAppId() {
		return this.relatedAppId;
	}
	public void setRelatedAppId(String relatedAppId) {
		this.relatedAppId = relatedAppId;
	}

}
