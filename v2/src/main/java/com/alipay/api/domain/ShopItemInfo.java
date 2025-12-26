package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺信息
 *
 * @author auto create
 * @since 1.0, 2023-09-25 10:17:12
 */
public class ShopItemInfo extends AlipayObject {

	private static final long serialVersionUID = 6148444716761153748L;

	/**
	 * 店铺地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 店铺类别
	 */
	@ApiListField("category")
	@ApiField("string")
	private List<String> category;

	/**
	 * 内容描述，用于搜索
	 */
	@ApiField("content")
	private String content;

	/**
	 * 详情页面
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 店铺楼层
	 */
	@ApiField("floor")
	private String floor;

	/**
	 * 店铺id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品归属的小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 营业时间
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 时间戳
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 店铺评分（保留两位小数）
	 */
	@ApiField("shop_grade")
	private String shopGrade;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺电话
	 */
	@ApiField("shop_phone_no")
	private String shopPhoneNo;

	/**
	 * 店铺图片链接
	 */
	@ApiListField("shop_url")
	@ApiField("string")
	private List<String> shopUrl;

	/**
	 * 店铺状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 优惠标签
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 标题，用于搜索
	 */
	@ApiField("title")
	private String title;

	/**
	 * 总销量
	 */
	@ApiField("total_sale_number")
	private String totalSaleNumber;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getCategory() {
		return this.category;
	}
	public void setCategory(List<String> category) {
		this.category = category;
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

	public String getFloor() {
		return this.floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getShopGrade() {
		return this.shopGrade;
	}
	public void setShopGrade(String shopGrade) {
		this.shopGrade = shopGrade;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopPhoneNo() {
		return this.shopPhoneNo;
	}
	public void setShopPhoneNo(String shopPhoneNo) {
		this.shopPhoneNo = shopPhoneNo;
	}

	public List<String> getShopUrl() {
		return this.shopUrl;
	}
	public void setShopUrl(List<String> shopUrl) {
		this.shopUrl = shopUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalSaleNumber() {
		return this.totalSaleNumber;
	}
	public void setTotalSaleNumber(String totalSaleNumber) {
		this.totalSaleNumber = totalSaleNumber;
	}

}
