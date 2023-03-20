package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐商品数据模型
 *
 * @author auto create
 * @since 1.0, 2022-03-21 19:58:38
 */
public class RecommendGoods extends AlipayObject {

	private static final long serialVersionUID = 7282182137179467439L;

	/**
	 * 商品barcode
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 行业商品goodsCode
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 推荐排名
	 */
	@ApiField("rank")
	private String rank;

	/**
	 * 推荐商品使用货道数
	 */
	@ApiField("recommend_channels_count")
	private String recommendChannelsCount;

	/**
	 * 推荐商品数量
	 */
	@ApiField("recommend_goods_count")
	private String recommendGoodsCount;

	/**
	 * 商品推荐理由
	 */
	@ApiField("recommend_reason")
	private String recommendReason;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getRank() {
		return this.rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getRecommendChannelsCount() {
		return this.recommendChannelsCount;
	}
	public void setRecommendChannelsCount(String recommendChannelsCount) {
		this.recommendChannelsCount = recommendChannelsCount;
	}

	public String getRecommendGoodsCount() {
		return this.recommendGoodsCount;
	}
	public void setRecommendGoodsCount(String recommendGoodsCount) {
		this.recommendGoodsCount = recommendGoodsCount;
	}

	public String getRecommendReason() {
		return this.recommendReason;
	}
	public void setRecommendReason(String recommendReason) {
		this.recommendReason = recommendReason;
	}

}
