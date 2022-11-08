package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 本地零售商品实体
 *
 * @author auto create
 * @since 1.0, 2022-10-31 14:17:48
 */
public class RetailItem extends AlipayObject {

	private static final long serialVersionUID = 1528996556478764795L;

	/**
	 * 商品可售时间
	 */
	@ApiListField("available_times")
	@ApiField("string")
	private List<String> availableTimes;

	/**
	 * 品牌名
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 支付宝小程序的商品详情页面
	 */
	@ApiField("buy_url")
	private String buyUrl;

	/**
	 * 商品不同级类目之间用$##$分隔，且自左向右类目层级逐渐细化。类目值推荐全部传名称，举例如“家电$##$电视$##$OLED电视”。某一段为空时直接传空字符串，如第二段为空， 则传“家电$##$$##$OLED电视”。如果有多个类目，多个类目之间用,分割。
	 */
	@ApiField("cate")
	private String cate;

	/**
	 * 商品类目层级数。cate_cnt必须等于len(cate.split('$##$'))，用于校验cate数据。所有商品的分类体系应该一致，即对于所有商品来说，cate_cnt应该相同
	 */
	@ApiField("cate_cnt")
	private Long cateCnt;

	/**
	 * 内容描述，用于搜索
	 */
	@ApiField("content")
	private String content;

	/**
	 * 支付宝小程序的详情页面
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 商品ID，id里面传物品id和shopId的拼接，这里传物品id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品id和shopId的拼接，拼接规则为物品id+“&”+shopId
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商户角色id，同步蚂蚁门店时的pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 商品归属的小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 商品详情的图片列表
	 */
	@ApiListField("pic_url_list")
	@ApiField("string")
	private List<String> picUrlList;

	/**
	 * 商品的logo图片列表，可用于用户展示的图片，建议600*600
	 */
	@ApiListField("promo_pic_url_list")
	@ApiField("string")
	private List<String> promoPicUrlList;

	/**
	 * 支付宝侧的门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 状态，1为有效、0为无效
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 商品标签，如首页展示标签“特惠”，"热卖",或详情页“满50包邮”,“假一赔三”等。多值示例："特惠,热卖"
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 标题，用于搜索
	 */
	@ApiField("title")
	private String title;

	public List<String> getAvailableTimes() {
		return this.availableTimes;
	}
	public void setAvailableTimes(List<String> availableTimes) {
		this.availableTimes = availableTimes;
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBuyUrl() {
		return this.buyUrl;
	}
	public void setBuyUrl(String buyUrl) {
		this.buyUrl = buyUrl;
	}

	public String getCate() {
		return this.cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}

	public Long getCateCnt() {
		return this.cateCnt;
	}
	public void setCateCnt(Long cateCnt) {
		this.cateCnt = cateCnt;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public List<String> getPicUrlList() {
		return this.picUrlList;
	}
	public void setPicUrlList(List<String> picUrlList) {
		this.picUrlList = picUrlList;
	}

	public List<String> getPromoPicUrlList() {
		return this.promoPicUrlList;
	}
	public void setPromoPicUrlList(List<String> promoPicUrlList) {
		this.promoPicUrlList = promoPicUrlList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
