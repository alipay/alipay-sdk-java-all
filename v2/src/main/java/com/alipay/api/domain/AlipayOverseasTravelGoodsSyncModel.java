package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境游私域商品数据同步
 *
 * @author auto create
 * @since 1.0, 2022-01-17 17:48:28
 */
public class AlipayOverseasTravelGoodsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1762534565583885669L;

	/**
	 * 商品首图，外部商品图片地址
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 外链地址，仅支持白名单内的H5& 小程序地址
	 */
	@ApiField("external_link_url")
	private String externalLinkUrl;

	/**
	 * 跨境营销线上电商商品扩展参数
。针对scenarios传了GOL_GOODS的场景，必填。
	 */
	@ApiField("gol_goods_ext_param")
	private GolGoodsExtParam golGoodsExtParam;

	/**
	 * 商品分类枚举,请向支付宝业务对口BD询问可用的枚举值。
	 */
	@ApiField("goods_category")
	private String goodsCategory;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品标签，可空或传入一个或多个
	 */
	@ApiListField("goods_tags")
	@ApiField("string")
	private List<String> goodsTags;

	/**
	 * 是否同步库存，是传Y，否则传N，默认不填为N
	 */
	@ApiField("inventory_sync")
	private String inventorySync;

	/**
	 * 商品原价，币种遵循 ISO 4217 标准，金额数值为正整数且精确到货币最小单位
	 */
	@ApiField("original_price")
	private Amount originalPrice;

	/**
	 * 外部商户或第三方的商品ID，app_id、out_shop_id、out_goods_id唯一标识一个商品请求。
	 */
	@ApiField("out_goods_id")
	private String outGoodsId;

	/**
	 * 过期参数，从1.1以后，该参数不再使用。建议使用参数out_shop_ids
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 外部店铺ID列表，对于特定行业可选，比如GOL线上商品的场景非必填。对于线下店铺，该参数必填。
连锁商户，一种商品可以挂接到多个店铺上,该参数支持传输店铺列表。
	 */
	@ApiListField("out_shop_ids")
	@ApiField("string")
	private List<String> outShopIds;

	/**
	 * 商品现价，币种遵循 ISO 4217 标准，金额数值为正整数且精确到货币最小单位
	 */
	@ApiField("price")
	private Amount price;

	/**
	 * 是否推荐，如推荐则平台会优先展示该菜品，是传Y，否则传N，默认不填为N
	 */
	@ApiField("recommend")
	private String recommend;

	/**
	 * 销售截止时间。标准时间格式：yyyy-MM-dd HH:mm:ss
如果不填代表长期有效，与sale_start_time配合使用
	 */
	@ApiField("sale_end_time")
	private Date saleEndTime;

	/**
	 * 销售开始时间。标准时间格式：yyyy-MM-dd HH:mm:ss
如果不填代表长期有效，与sale_end_time配合使用
	 */
	@ApiField("sale_start_time")
	private Date saleStartTime;

	/**
	 * 外部平台商品销量
	 */
	@ApiField("sales_volume")
	private GoodsSalesVolume salesVolume;

	/**
	 * 业务场景，可传入一个或多个,该字段用来标识商品的适用业务场景。
	 */
	@ApiListField("scenarios")
	@ApiField("string")
	private List<String> scenarios;

	/**
	 * 商品状态，仅支持指定枚举值，NORMAL表示如正在售卖，CLOSED表示下架
	 */
	@ApiField("status")
	private String status;

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getExternalLinkUrl() {
		return this.externalLinkUrl;
	}
	public void setExternalLinkUrl(String externalLinkUrl) {
		this.externalLinkUrl = externalLinkUrl;
	}

	public GolGoodsExtParam getGolGoodsExtParam() {
		return this.golGoodsExtParam;
	}
	public void setGolGoodsExtParam(GolGoodsExtParam golGoodsExtParam) {
		this.golGoodsExtParam = golGoodsExtParam;
	}

	public String getGoodsCategory() {
		return this.goodsCategory;
	}
	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public List<String> getGoodsTags() {
		return this.goodsTags;
	}
	public void setGoodsTags(List<String> goodsTags) {
		this.goodsTags = goodsTags;
	}

	public String getInventorySync() {
		return this.inventorySync;
	}
	public void setInventorySync(String inventorySync) {
		this.inventorySync = inventorySync;
	}

	public Amount getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Amount originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutGoodsId() {
		return this.outGoodsId;
	}
	public void setOutGoodsId(String outGoodsId) {
		this.outGoodsId = outGoodsId;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public List<String> getOutShopIds() {
		return this.outShopIds;
	}
	public void setOutShopIds(List<String> outShopIds) {
		this.outShopIds = outShopIds;
	}

	public Amount getPrice() {
		return this.price;
	}
	public void setPrice(Amount price) {
		this.price = price;
	}

	public String getRecommend() {
		return this.recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public Date getSaleEndTime() {
		return this.saleEndTime;
	}
	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public Date getSaleStartTime() {
		return this.saleStartTime;
	}
	public void setSaleStartTime(Date saleStartTime) {
		this.saleStartTime = saleStartTime;
	}

	public GoodsSalesVolume getSalesVolume() {
		return this.salesVolume;
	}
	public void setSalesVolume(GoodsSalesVolume salesVolume) {
		this.salesVolume = salesVolume;
	}

	public List<String> getScenarios() {
		return this.scenarios;
	}
	public void setScenarios(List<String> scenarios) {
		this.scenarios = scenarios;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
