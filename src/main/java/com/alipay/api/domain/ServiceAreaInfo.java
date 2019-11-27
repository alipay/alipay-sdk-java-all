package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开通地区列表，支持省province,市city，区district,比如支持杭州市西湖区、北京市全区[{“city”:[“110000”]}, {“district”: [“300101”]}]，如果写了区，就没有必要再写该对应的城市，同理，写了市就没必要写对应的省，不传改字段表示支持全国所有省市
 *
 * @author auto create
 * @since 1.0, 2016-12-05 16:15:21
 */
public class ServiceAreaInfo extends AlipayObject {

	private static final long serialVersionUID = 8723788417478342715L;

	/**
	 * 商家服务的市列表
	 */
	@ApiListField("city")
	@ApiField("string")
	private List<String> city;

	/**
	 * 商家提供服务的区列表
	 */
	@ApiListField("district")
	@ApiField("string")
	private List<String> district;

	/**
	 * 商家服务的省列表
	 */
	@ApiListField("province")
	@ApiField("string")
	private List<String> province;

	public List<String> getCity() {
		return this.city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}

	public List<String> getDistrict() {
		return this.district;
	}
	public void setDistrict(List<String> district) {
		this.district = district;
	}

	public List<String> getProvince() {
		return this.province;
	}
	public void setProvince(List<String> province) {
		this.province = province;
	}

}
