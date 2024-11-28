package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店租赁车辆信息
 *
 * @author auto create
 * @since 1.0, 2024-11-22 17:51:11
 */
public class StoreRentalEbikeDetail extends AlipayObject {

	private static final long serialVersionUID = 1192665279489543968L;

	/**
	 * 车辆唯一标识
	 */
	@ApiField("ebike_id")
	private String ebikeId;

	/**
	 * 车辆图片
	 */
	@ApiField("ebike_image_url")
	private String ebikeImageUrl;

	/**
	 * 车辆名称
	 */
	@ApiField("ebike_name")
	private String ebikeName;

	/**
	 * 车辆服务描述
	 */
	@ApiListField("ebike_service_desc")
	@ApiField("string")
	private List<String> ebikeServiceDesc;

	/**
	 * 下单跳转链接
	 */
	@ApiField("order_link_url")
	private String orderLinkUrl;

	/**
	 * 租赁周期类型
	 */
	@ApiField("rental_period_type")
	private String rentalPeriodType;

	/**
	 * 租赁价格
	 */
	@ApiField("rental_price")
	private String rentalPrice;

	public String getEbikeId() {
		return this.ebikeId;
	}
	public void setEbikeId(String ebikeId) {
		this.ebikeId = ebikeId;
	}

	public String getEbikeImageUrl() {
		return this.ebikeImageUrl;
	}
	public void setEbikeImageUrl(String ebikeImageUrl) {
		this.ebikeImageUrl = ebikeImageUrl;
	}

	public String getEbikeName() {
		return this.ebikeName;
	}
	public void setEbikeName(String ebikeName) {
		this.ebikeName = ebikeName;
	}

	public List<String> getEbikeServiceDesc() {
		return this.ebikeServiceDesc;
	}
	public void setEbikeServiceDesc(List<String> ebikeServiceDesc) {
		this.ebikeServiceDesc = ebikeServiceDesc;
	}

	public String getOrderLinkUrl() {
		return this.orderLinkUrl;
	}
	public void setOrderLinkUrl(String orderLinkUrl) {
		this.orderLinkUrl = orderLinkUrl;
	}

	public String getRentalPeriodType() {
		return this.rentalPeriodType;
	}
	public void setRentalPeriodType(String rentalPeriodType) {
		this.rentalPeriodType = rentalPeriodType;
	}

	public String getRentalPrice() {
		return this.rentalPrice;
	}
	public void setRentalPrice(String rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

}
