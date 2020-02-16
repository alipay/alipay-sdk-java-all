package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周边商圈查询
 *
 * @author auto create
 * @since 1.0, 2018-11-22 10:36:49
 */
public class KoubeiMarketingDataNearmallQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3351345989286835235L;

	/**
	 * 说明来源
	 */
	@ApiField("app_channel")
	private String appChannel;

	/**
	 * 城市编码
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 开始标记
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 数量标记
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 设备id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 设备版本号
	 */
	@ApiField("product_version")
	private String productVersion;

	/**
	 * 半径，单位【米】
	 */
	@ApiField("radius")
	private String radius;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 地理位置经度
	 */
	@ApiField("x")
	private Long x;

	/**
	 * 地理位置纬度
	 */
	@ApiField("y")
	private Long y;

	public String getAppChannel() {
		return this.appChannel;
	}
	public void setAppChannel(String appChannel) {
		this.appChannel = appChannel;
	}

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductVersion() {
		return this.productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	public String getRadius() {
		return this.radius;
	}
	public void setRadius(String radius) {
		this.radius = radius;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getX() {
		return this.x;
	}
	public void setX(Long x) {
		this.x = x;
	}

	public Long getY() {
		return this.y;
	}
	public void setY(Long y) {
		this.y = y;
	}

}
