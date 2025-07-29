package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺数据
 *
 * @author auto create
 * @since 1.0, 2023-04-13 22:30:44
 */
public class ShopItem extends AlipayObject {

	private static final long serialVersionUID = 4724916557628642882L;

	/**
	 * 店铺内商品列表
	 */
	@ApiListField("goods")
	@ApiField("aos_good_item")
	private List<AosGoodItem> goods;

	/**
	 * 分值
	 */
	@ApiField("score")
	private String score;

	/**
	 * 店铺的id信息
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺的名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺的跳转地址
	 */
	@ApiField("shop_url")
	private String shopUrl;

	/**
	 * 搜索结果item的trace_id用于关联搜索结果和用户行为
	 */
	@ApiField("trace_id")
	private String traceId;

	public List<AosGoodItem> getGoods() {
		return this.goods;
	}
	public void setGoods(List<AosGoodItem> goods) {
		this.goods = goods;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopUrl() {
		return this.shopUrl;
	}
	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
