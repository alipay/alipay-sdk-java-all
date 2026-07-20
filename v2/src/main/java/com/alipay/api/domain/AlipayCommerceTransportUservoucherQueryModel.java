package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝机票阵地已领取优惠券查询
 *
 * @author auto create
 * @since 1.0, 2026-07-15 17:52:54
 */
public class AlipayCommerceTransportUservoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4729159268254783861L;

	/**
	 * 达到机场三字码
	 */
	@ApiField("arr_city")
	private String arrCity;

	/**
	 * 到达城市行政区划码
	 */
	@ApiField("arr_city_code")
	private String arrCityCode;

	/**
	 *  出发机场三字码
	 */
	@ApiField("dep_city")
	private String depCity;

	/**
	 * 出发城市行政区划码
	 */
	@ApiField("dep_city_code")
	private String depCityCode;

	/**
	 * JSON格式，用于后续扩展使用
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * DOMESTIC国内机票，INTERNATIONAL国际机票
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * ROUND_TRIP往返，ONE_WAY单程
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getArrCity() {
		return this.arrCity;
	}
	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}

	public String getArrCityCode() {
		return this.arrCityCode;
	}
	public void setArrCityCode(String arrCityCode) {
		this.arrCityCode = arrCityCode;
	}

	public String getDepCity() {
		return this.depCity;
	}
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	public String getDepCityCode() {
		return this.depCityCode;
	}
	public void setDepCityCode(String depCityCode) {
		this.depCityCode = depCityCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
