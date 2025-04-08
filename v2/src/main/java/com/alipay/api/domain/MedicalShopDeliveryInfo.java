package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗门店配送配置信息
 *
 * @author auto create
 * @since 1.0, 2024-06-12 16:00:06
 */
public class MedicalShopDeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 5473178152898868625L;

	/**
	 * 多点位按顺时针顺序，首位点位必须相同
	 */
	@ApiListField("delivery_area")
	@ApiField("medical_shop_delivery_point")
	private List<MedicalShopDeliveryPoint> deliveryArea;

	/**
	 * 1 - 多边形；2 - 圆形
	 */
	@ApiField("delivery_area_type")
	private Long deliveryAreaType;

	/**
	 * 单位：分
	 */
	@ApiField("delivery_fee")
	private Long deliveryFee;

	/**
	 * 单位：米；圆心为门店位置经纬度
	 */
	@ApiField("delivery_radius")
	private Long deliveryRadius;

	/**
	 * 多个时间段按当天的从早到晚顺序，不能重叠、不能跨天；最多6个时间段
	 */
	@ApiListField("effective_period")
	@ApiField("medical_shop_time_period")
	private List<MedicalShopTimePeriod> effectivePeriod;

	/**
	 * 单位：分
	 */
	@ApiField("start_price")
	private Long startPrice;

	/**
	 * 特殊时段配送价加价规则，不跨天,
默认为全天,多个时间段按当天的从早到晚顺序，最多6个时间段，结束时间必须大于起始时间
所属的时间段不能有重叠
	 */
	@ApiListField("time_ext_fee")
	@ApiField("medical_shop_delivery_special_time_price")
	private List<MedicalShopDeliverySpecialTimePrice> timeExtFee;

	/**
	 * 特殊时间段起送价加价规则，
不跨天,默认为全天,多个时间段按当天的从早到晚顺序，最多6个时间段
结束时间必须大于起始时间；
所属的时间段不能有重叠
	 */
	@ApiListField("time_ext_price")
	@ApiField("medical_shop_delivery_special_time_price")
	private List<MedicalShopDeliverySpecialTimePrice> timeExtPrice;

	public List<MedicalShopDeliveryPoint> getDeliveryArea() {
		return this.deliveryArea;
	}
	public void setDeliveryArea(List<MedicalShopDeliveryPoint> deliveryArea) {
		this.deliveryArea = deliveryArea;
	}

	public Long getDeliveryAreaType() {
		return this.deliveryAreaType;
	}
	public void setDeliveryAreaType(Long deliveryAreaType) {
		this.deliveryAreaType = deliveryAreaType;
	}

	public Long getDeliveryFee() {
		return this.deliveryFee;
	}
	public void setDeliveryFee(Long deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public Long getDeliveryRadius() {
		return this.deliveryRadius;
	}
	public void setDeliveryRadius(Long deliveryRadius) {
		this.deliveryRadius = deliveryRadius;
	}

	public List<MedicalShopTimePeriod> getEffectivePeriod() {
		return this.effectivePeriod;
	}
	public void setEffectivePeriod(List<MedicalShopTimePeriod> effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public Long getStartPrice() {
		return this.startPrice;
	}
	public void setStartPrice(Long startPrice) {
		this.startPrice = startPrice;
	}

	public List<MedicalShopDeliverySpecialTimePrice> getTimeExtFee() {
		return this.timeExtFee;
	}
	public void setTimeExtFee(List<MedicalShopDeliverySpecialTimePrice> timeExtFee) {
		this.timeExtFee = timeExtFee;
	}

	public List<MedicalShopDeliverySpecialTimePrice> getTimeExtPrice() {
		return this.timeExtPrice;
	}
	public void setTimeExtPrice(List<MedicalShopDeliverySpecialTimePrice> timeExtPrice) {
		this.timeExtPrice = timeExtPrice;
	}

}
