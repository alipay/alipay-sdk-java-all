package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-07-31 10:52:34
 */
public class InternetbarDeviceActivityData extends AlipayObject {

	private static final long serialVersionUID = 6172925888574454423L;

	/**
	 * 该线圈历史上是否曾唤起过支付宝端
	 */
	@ApiField("awake_app")
	private Boolean awakeApp;

	/**
	 * 动销数据对应的业务发生日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 线圈当日DAU
	 */
	@ApiField("device_dau")
	private Long deviceDau;

	/**
	 * 线圈当日pv值
	 */
	@ApiField("device_pv")
	private Long devicePv;

	/**
	 * 网吧门店编号
	 */
	@ApiField("shop_code")
	private String shopCode;

	/**
	 * 网吧门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 网吧门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 线圈的tagId
	 */
	@ApiField("tag_id")
	private String tagId;

	public Boolean getAwakeApp() {
		return this.awakeApp;
	}
	public void setAwakeApp(Boolean awakeApp) {
		this.awakeApp = awakeApp;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public Long getDeviceDau() {
		return this.deviceDau;
	}
	public void setDeviceDau(Long deviceDau) {
		this.deviceDau = deviceDau;
	}

	public Long getDevicePv() {
		return this.devicePv;
	}
	public void setDevicePv(Long devicePv) {
		this.devicePv = devicePv;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

}
