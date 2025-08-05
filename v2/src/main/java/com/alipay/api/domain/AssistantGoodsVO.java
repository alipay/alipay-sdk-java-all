package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小助手商品模型
 *
 * @author auto create
 * @since 1.0, 2025-04-01 13:40:53
 */
public class AssistantGoodsVO extends AlipayObject {

	private static final long serialVersionUID = 1515839789258565734L;

	/**
	 * 人群code，需要通过棋盘人群创建接口<a href="https://opendocs.alipay.com/open/09c10677_alipay.marketing.qipan.crowdoperation.create?pathHash=3d8bad63">https://opendocs.alipay.com/open/09c10677_alipay.marketing.qipan.crowdoperation.create?pathHash=3d8bad63</a>创建并获取返回crowd_code作为这个地方传的人群code参数
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 商品Id。传入商品id后可支持在群内发商品消息。请先通过小程序商品创建接口<a href="https://opendocs.alipay.com/mini/4880cf68_alipay.open.app.item.create?scene=common&pathHash=250eb20d"> https://opendocs.alipay.com/mini/4880cf68_alipay.open.app.item.create?scene=common&pathHash=250eb20d</a> 或小程序本地商品创建接口<a href="https://opendocs.alipay.com/mini/4aa8dac1_alipay.open.app.localitem.create?pathHash=9bdb074d&highlight_field=item_id">https://opendocs.alipay.com/mini/4aa8dac1_alipay.open.app.localitem.create?pathHash=9bdb074d&highlight_field=item_id</a>创建商品，并获取item_id 平台侧商品ID作为这个入参的值。
	 */
	@ApiField("goods_item_id")
	private String goodsItemId;

	/**
	 * 商品所属的小程序appId
	 */
	@ApiField("related_app_id")
	private String relatedAppId;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public String getGoodsItemId() {
		return this.goodsItemId;
	}
	public void setGoodsItemId(String goodsItemId) {
		this.goodsItemId = goodsItemId;
	}

	public String getRelatedAppId() {
		return this.relatedAppId;
	}
	public void setRelatedAppId(String relatedAppId) {
		this.relatedAppId = relatedAppId;
	}

}
