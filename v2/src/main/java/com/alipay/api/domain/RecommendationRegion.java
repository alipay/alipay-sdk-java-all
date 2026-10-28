package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业经营地，各级缺失时为null。不使用注册地址、店铺所在地或发货地冒充。1688按省、市、区顺序展示非空值，全部为空时隐藏地区。
 *
 * @author auto create
 * @since 1.0, 2026-10-22 12:07:55
 */
public class RecommendationRegion extends AlipayObject {

	private static final long serialVersionUID = 7762338262276415763L;

	/**
	 * 经营地城市名称，最多64个Unicode码点，缺失时为null。 无值时字段可省略或返回null；调用方统一按未知处理，不补0或空字符串。
	 */
	@ApiField("city")
	private String city;

	/**
	 * 经营地区县名称，最多64个Unicode码点，缺失时为null。 无值时字段可省略或返回null；调用方统一按未知处理，不补0或空字符串。
	 */
	@ApiField("district")
	private String district;

	/**
	 * 经营地省级名称，最多64个Unicode码点，缺失时为null。 无值时字段可省略或返回null；调用方统一按未知处理，不补0或空字符串。
	 */
	@ApiField("province")
	private String province;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
