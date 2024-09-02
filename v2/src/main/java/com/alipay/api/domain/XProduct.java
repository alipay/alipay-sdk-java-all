package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店价格套餐中对用的产品信息
 *
 * @author auto create
 * @since 1.0, 2024-07-05 18:25:10
 */
public class XProduct extends AlipayObject {

	private static final long serialVersionUID = 7617845585831333635L;

	/**
	 * X产品预订规则
	 */
	@ApiField("appoint_policy")
	private String appointPolicy;

	/**
	 * X产品预订电话
	 */
	@ApiField("booking_phone")
	private String bookingPhone;

	/**
	 * X产品适用人数
	 */
	@ApiField("capacity")
	private String capacity;

	/**
	 * 产品的具体数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * X产品接待时间
	 */
	@ApiField("reception_times")
	private String receptionTimes;

	/**
	 * X产品的分类，目前支持 住、食、享三类，传 “住” 活着其他值即可
	 */
	@ApiField("type_name")
	private String typeName;

	/**
	 * 酒店价格方案中，套餐对应的X产品id，唯一
	 */
	@ApiField("x_product_id")
	private String xProductId;

	/**
	 * X产品名称
	 */
	@ApiField("x_product_name")
	private String xProductName;

	public String getAppointPolicy() {
		return this.appointPolicy;
	}
	public void setAppointPolicy(String appointPolicy) {
		this.appointPolicy = appointPolicy;
	}

	public String getBookingPhone() {
		return this.bookingPhone;
	}
	public void setBookingPhone(String bookingPhone) {
		this.bookingPhone = bookingPhone;
	}

	public String getCapacity() {
		return this.capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getReceptionTimes() {
		return this.receptionTimes;
	}
	public void setReceptionTimes(String receptionTimes) {
		this.receptionTimes = receptionTimes;
	}

	public String getTypeName() {
		return this.typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getxProductId() {
		return this.xProductId;
	}
	public void setxProductId(String xProductId) {
		this.xProductId = xProductId;
	}

	public String getxProductName() {
		return this.xProductName;
	}
	public void setxProductName(String xProductName) {
		this.xProductName = xProductName;
	}

}
