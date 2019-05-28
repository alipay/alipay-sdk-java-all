package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑淘抢购商品信息模型
 *
 * @author auto create
 * @since 1.0, 2017-12-01 11:22:32
 */
public class KbItemInfo extends AlipayObject {

	private static final long serialVersionUID = 5898629623493467625L;

	/**
	 * 店铺人气值，共4个等级,1,2,3,4
	 */
	@ApiField("avg_pop_value")
	private String avgPopValue;

	/**
	 * 开卖时间
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品logo图片
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 商品原价。
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 当前库存
	 */
	@ApiField("quota")
	private String quota;

	/**
	 * 优惠价
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 商品所属店铺距离当前用户距离
	 */
	@ApiField("shop_distance")
	private String shopDistance;

	/**
	 * 商品所属店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商品所属店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商品状态，SOLD_OUT：售罄，SELL_ING：进行中
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 是否置顶，1：置顶，0:非置顶
	 */
	@ApiField("top")
	private String top;

	/**
	 * 总库存
	 */
	@ApiField("total_quota")
	private String totalQuota;

	/**
	 * 商品详情页地址
	 */
	@ApiField("url")
	private String url;

	public String getAvgPopValue() {
		return this.avgPopValue;
	}
	public void setAvgPopValue(String avgPopValue) {
		this.avgPopValue = avgPopValue;
	}

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getQuota() {
		return this.quota;
	}
	public void setQuota(String quota) {
		this.quota = quota;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getShopDistance() {
		return this.shopDistance;
	}
	public void setShopDistance(String shopDistance) {
		this.shopDistance = shopDistance;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTop() {
		return this.top;
	}
	public void setTop(String top) {
		this.top = top;
	}

	public String getTotalQuota() {
		return this.totalQuota;
	}
	public void setTotalQuota(String totalQuota) {
		this.totalQuota = totalQuota;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
