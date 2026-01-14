package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费订单扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-05-27 11:49:50
 */
public class EduTradeExtInfo extends AlipayObject {

	private static final long serialVersionUID = 6669474814177664673L;

	/**
	 * 课程描述信息
	 */
	@ApiField("course_desc")
	private String courseDesc;

	/**
	 * 课程图片地址
	 */
	@ApiField("course_img_url")
	private String courseImgUrl;

	/**
	 * 课程名称
	 */
	@ApiField("course_name")
	private String courseName;

	/**
	 * 课程标签
	 */
	@ApiField("course_tag")
	private String courseTag;

	/**
	 * 课程原价，单位元，两位小数
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 外部课程编号
	 */
	@ApiField("out_course_id")
	private String outCourseId;

	/**
	 * 外部门店编号
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 课程单价，单位元，两位小数
	 */
	@ApiField("price")
	private String price;

	/**
	 * 门店图片地址
	 */
	@ApiField("shop_img_url")
	private String shopImgUrl;

	/**
	 * 店铺别名
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店可跳转地址
	 */
	@ApiField("shop_url")
	private String shopUrl;

	public String getCourseDesc() {
		return this.courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public String getCourseImgUrl() {
		return this.courseImgUrl;
	}
	public void setCourseImgUrl(String courseImgUrl) {
		this.courseImgUrl = courseImgUrl;
	}

	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTag() {
		return this.courseTag;
	}
	public void setCourseTag(String courseTag) {
		this.courseTag = courseTag;
	}

	public String getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getOutCourseId() {
		return this.outCourseId;
	}
	public void setOutCourseId(String outCourseId) {
		this.outCourseId = outCourseId;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getShopImgUrl() {
		return this.shopImgUrl;
	}
	public void setShopImgUrl(String shopImgUrl) {
		this.shopImgUrl = shopImgUrl;
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

}
