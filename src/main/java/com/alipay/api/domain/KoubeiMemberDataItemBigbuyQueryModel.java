package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询超值抢购商品信息
 *
 * @author auto create
 * @since 1.0, 2019-01-02 15:47:30
 */
public class KoubeiMemberDataItemBigbuyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7726599413518693886L;

	/**
	 * 城市编码，国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 纬度，当城市id未传时用来获取对应城市id
	 */
	@ApiField("latitude")
	private Long latitude;

	/**
	 * 经度，当城市id未传时用来获取对应城市id
	 */
	@ApiField("longitude")
	private Long longitude;

	/**
	 * 展位码，如果有放置展位需求的话，用于请求cdp查询对应展位
	 */
	@ApiListField("space_code_list")
	@ApiField("string")
	private List<String> spaceCodeList;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Long getLatitude() {
		return this.latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return this.longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public List<String> getSpaceCodeList() {
		return this.spaceCodeList;
	}
	public void setSpaceCodeList(List<String> spaceCodeList) {
		this.spaceCodeList = spaceCodeList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
