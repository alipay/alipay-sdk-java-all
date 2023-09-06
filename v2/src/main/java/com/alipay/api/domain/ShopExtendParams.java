package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺同步扩展参数
 *
 * @author auto create
 * @since 1.0, 2021-02-25 16:09:16
 */
public class ShopExtendParams extends AlipayObject {

	private static final long serialVersionUID = 2729745213929689359L;

	/**
	 * 店铺类目列表。外卖场景下必填，支持回传多个，可用值需要联系支付宝对口BD给出
	 */
	@ApiListField("categories")
	@ApiField("string")
	private List<String> categories;

	/**
	 * 用于外卖场景的配送费原价
	 */
	@ApiField("original_delivery_fee")
	private Amount originalDeliveryFee;

	/**
	 * 店铺销量，需要配合sales_volume_period一起使用。表示某一段时间内该店铺的销量
	 */
	@ApiField("sales_volume")
	private Long salesVolume;

	/**
	 * 店铺销量周期。使用枚举值 MONTH/HALF_YEAR/YEAR 分别表示月/半年/年，该字段需要配合sales_volume一起使用
	 */
	@ApiField("sales_volume_period")
	private String salesVolumePeriod;

	/**
	 * 店铺可视范围，仅支持距离（邮编暂不支持），指的是用户LBS与店铺距离在该范围内，才面向用户展示。外卖场景下，该字段必填，其余场景非必填。单位：米（m）
	 */
	@ApiField("visibility")
	private Long visibility;

	public List<String> getCategories() {
		return this.categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public Amount getOriginalDeliveryFee() {
		return this.originalDeliveryFee;
	}
	public void setOriginalDeliveryFee(Amount originalDeliveryFee) {
		this.originalDeliveryFee = originalDeliveryFee;
	}

	public Long getSalesVolume() {
		return this.salesVolume;
	}
	public void setSalesVolume(Long salesVolume) {
		this.salesVolume = salesVolume;
	}

	public String getSalesVolumePeriod() {
		return this.salesVolumePeriod;
	}
	public void setSalesVolumePeriod(String salesVolumePeriod) {
		this.salesVolumePeriod = salesVolumePeriod;
	}

	public Long getVisibility() {
		return this.visibility;
	}
	public void setVisibility(Long visibility) {
		this.visibility = visibility;
	}

}
