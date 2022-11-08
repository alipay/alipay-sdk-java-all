package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户权益信息
 *
 * @author auto create
 * @since 1.0, 2021-12-22 19:56:52
 */
public class UserBenefitInfo extends AlipayObject {

	private static final long serialVersionUID = 6318161329797582863L;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 权益实体id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 跳转链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 产品类型
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 权益开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 权益子标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 产品 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 优惠券梳理
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getVoucherQuantity() {
		return this.voucherQuantity;
	}
	public void setVoucherQuantity(Long voucherQuantity) {
		this.voucherQuantity = voucherQuantity;
	}

}
