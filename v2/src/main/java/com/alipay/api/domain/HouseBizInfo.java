package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 房产交易信息
 *
 * @author auto create
 * @since 1.0, 2023-04-06 14:26:32
 */
public class HouseBizInfo extends AlipayObject {

	private static final long serialVersionUID = 5517646455624798686L;

	/**
	 * 房龄，单位年
	 */
	@ApiField("house_age")
	private Long houseAge;

	/**
	 * 房产价格
售房类型价格单位（元）；房产均价单位(元每平米)；租房类型单位（元每月）；
	 */
	@ApiField("house_price")
	private Long housePrice;

	/**
	 * 房间面积，单位平方米
	 */
	@ApiField("house_size")
	private Long houseSize;

	/**
	 * 房型
	 */
	@ApiField("house_type")
	private String houseType;

	/**
	 * 房产首图，base64编码字节流
	 */
	@ApiField("image_string")
	private String imageString;

	/**
	 * 小程序跳转链接
	 */
	@ApiField("page_url")
	private String pageUrl;

	public Long getHouseAge() {
		return this.houseAge;
	}
	public void setHouseAge(Long houseAge) {
		this.houseAge = houseAge;
	}

	public Long getHousePrice() {
		return this.housePrice;
	}
	public void setHousePrice(Long housePrice) {
		this.housePrice = housePrice;
	}

	public Long getHouseSize() {
		return this.houseSize;
	}
	public void setHouseSize(Long houseSize) {
		this.houseSize = houseSize;
	}

	public String getHouseType() {
		return this.houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getImageString() {
		return this.imageString;
	}
	public void setImageString(String imageString) {
		this.imageString = imageString;
	}

	public String getPageUrl() {
		return this.pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

}
