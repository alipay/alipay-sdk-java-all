package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺数据列表
 *
 * @author auto create
 * @since 1.0, 2023-10-10 16:28:29
 */
public class MpcpromoShopList extends AlipayObject {

	private static final long serialVersionUID = 5583938631344415455L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 店铺分类
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
	 * 店铺url地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 楼层说明
	 */
	@ApiField("floor")
	private String floor;

	/**
	 * 营业时间
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 店铺评分0-100
	 */
	@ApiField("shop_grade")
	private Long shopGrade;

	/**
	 * shopId唯一
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * shopName店铺名称，必填
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺手机或者电话
	 */
	@ApiField("shop_phone_no")
	private String shopPhoneNo;

	/**
	 * 店铺图片url，数组的形式
	 */
	@ApiListField("shop_url")
	@ApiField("string")
	private List<String> shopUrl;

	/**
	 * status用0或1，1就是上架，0下架
	 */
	@ApiField("status")
	private String status;

	/**
	 * 标签，如五折，包邮
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 店铺标题，用于搜索
	 */
	@ApiField("title")
	private String title;

	/**
	 * 销量
	 */
	@ApiField("total_sale_number")
	private Long totalSaleNumber;

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

	public String getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public Long getShopGrade() {
		return this.shopGrade;
	}
	public void setShopGrade(Long shopGrade) {
		this.shopGrade = shopGrade;
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

	public Long getTotalSaleNumber() {
		return this.totalSaleNumber;
	}
	public void setTotalSaleNumber(Long totalSaleNumber) {
		this.totalSaleNumber = totalSaleNumber;
	}

}
