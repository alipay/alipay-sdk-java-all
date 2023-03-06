package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * mpcpromo商品数据
 *
 * @author auto create
 * @since 1.0, 2023-02-09 11:46:44
 */
public class MpcpromoGoodsList extends AlipayObject {

	private static final long serialVersionUID = 6593643436655267558L;

	/**
	 * 商品品牌名称
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 必填，若使用个性化小程序插件，则需要提供商品详情链接地址（跳转使用）
	 */
	@ApiField("buy_url")
	private String buyUrl;

	/**
	 * 商品不同级类目之间用$##$分隔，且自左向右类目层级逐渐细化。类目值推荐全部传名称，举例如“家电$##$电视$##$OLED电视”。某一段为空时直接传空字符串，如第二段为空， 则传“家电$##$$##$OLED电视”。
	 */
	@ApiField("cate")
	private String cate;

	/**
	 * 商品类目层级数。cate_cnt必须等于len(cate.split('$##$'))，用于校验cate数据。所有商品的分类体系应该一致，即对于所有商品来说，cate_cnt应该相同
	 */
	@ApiField("cate_cnt")
	private String cateCnt;

	/**
	 * 必填，非负数且保留两位小数，免费商品填写0.00
	 */
	@ApiField("current_price")
	private String currentPrice;

	/**
	 * 正整数
	 */
	@ApiField("detail_pic_num")
	private String detailPicNum;

	/**
	 * 用于接收返回的错误信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 包邮/不包邮/满足条件包邮，三选一
	 */
	@ApiField("free_shipping")
	private String freeShipping;

	/**
	 * 物品的唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 非负数且保留两位小数
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 商品详情的图片列表
	 */
	@ApiListField("pic_url_list")
	@ApiField("string")
	private List<String> picUrlList;

	/**
	 * 价格单位
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * 商品的logo图片列表，可用于公域推广对用户展示的图片，建议600*600
	 */
	@ApiListField("promo_pic_url_list")
	@ApiField("string")
	private List<String> promoPicUrlList;

	/**
	 * 商品上架时间，精确到秒
	 */
	@ApiField("pub_time")
	private Date pubTime;

	/**
	 * 运费
	 */
	@ApiField("shipping_money")
	private String shippingMoney;

	/**
	 * spu维度的id
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 推荐状态；
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品标签，如首页展示标签“特惠”，“热卖”,或详情页“满50包邮”,“假一赔三”等。多值示例：“特惠,热卖"
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

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

	public String getCateCnt() {
		return this.cateCnt;
	}
	public void setCateCnt(String cateCnt) {
		this.cateCnt = cateCnt;
	}

	public String getCurrentPrice() {
		return this.currentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getDetailPicNum() {
		return this.detailPicNum;
	}
	public void setDetailPicNum(String detailPicNum) {
		this.detailPicNum = detailPicNum;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFreeShipping() {
		return this.freeShipping;
	}
	public void setFreeShipping(String freeShipping) {
		this.freeShipping = freeShipping;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public List<String> getPicUrlList() {
		return this.picUrlList;
	}
	public void setPicUrlList(List<String> picUrlList) {
		this.picUrlList = picUrlList;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public List<String> getPromoPicUrlList() {
		return this.promoPicUrlList;
	}
	public void setPromoPicUrlList(List<String> promoPicUrlList) {
		this.promoPicUrlList = promoPicUrlList;
	}

	public Date getPubTime() {
		return this.pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	public String getShippingMoney() {
		return this.shippingMoney;
	}
	public void setShippingMoney(String shippingMoney) {
		this.shippingMoney = shippingMoney;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
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
