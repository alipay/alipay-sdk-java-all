package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益的等级配置信息
 *
 * @author auto create
 * @since 1.0, 2017-06-15 15:43:39
 */
public class BenefitGradeConfig extends AlipayObject {

	private static final long serialVersionUID = 2172361468851774717L;

	/**
	 * 权益背景图片地址，若没有，可以先mock一个地址进行填写
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * 该等级下权益的介绍
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 用户等级，差异化时可填primary、golden、platinum、diamond，非差异化时可填common
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 权益关联的活动页面
	 */
	@ApiField("page_url")
	private String pageUrl;

	/**
	 * 当前等级兑换权益所需要消耗的积分
	 */
	@ApiField("point")
	private Long point;

	/**
	 * 该等级兑换权益时，消耗的积分需要乘以配置的这个折扣，进行优惠
	 */
	@ApiField("point_discount")
	private String pointDiscount;

	public String getBackgroundUrl() {
		return this.backgroundUrl;
	}
	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPageUrl() {
		return this.pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public Long getPoint() {
		return this.point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}

	public String getPointDiscount() {
		return this.pointDiscount;
	}
	public void setPointDiscount(String pointDiscount) {
		this.pointDiscount = pointDiscount;
	}

}
