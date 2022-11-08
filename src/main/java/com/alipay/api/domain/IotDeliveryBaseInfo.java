package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Iot投放计划基础信息
 *
 * @author auto create
 * @since 1.0, 2022-06-23 20:43:25
 */
public class IotDeliveryBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2851923389864712216L;

	/**
	 * 投放计划开始时间。
格式为：yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("delivery_begin_time")
	private Date deliveryBeginTime;

	/**
	 * 投放计划结束时间。
格式为：yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("delivery_end_time")
	private Date deliveryEndTime;

	/**
	 * 投放计划名称。
投放计划名称不会对用户进行表达，只用于商户管理使用。长度需要大于等于3，小于32。
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	/**
	 * 设备名单上传接口返回文件id。在创建投放时传参使用，查询投放时不返回
	 */
	@ApiField("device_file_id")
	private String deviceFileId;

	/**
	 * 文件链接，可通过此链接下载之前上传的机具文件，查询时返回，创建时无须传参
	 */
	@ApiField("device_file_url")
	private String deviceFileUrl;

	/**
	 * 不投放门店列表
	 */
	@ApiField("exclude_shop_ids")
	private String excludeShopIds;

	/**
	 * 投放门店列表
	 */
	@ApiField("include_shop_ids")
	private String includeShopIds;

	/**
	 * 金额门槛下限
限制：value > 0 && value <= 99999。
	 */
	@ApiField("trade_down_threshold")
	private String tradeDownThreshold;

	/**
	 * 金额门槛上限
限制：value > 0 && value <= 99999。
	 */
	@ApiField("trade_upon_threshold")
	private String tradeUponThreshold;

	public Date getDeliveryBeginTime() {
		return this.deliveryBeginTime;
	}
	public void setDeliveryBeginTime(Date deliveryBeginTime) {
		this.deliveryBeginTime = deliveryBeginTime;
	}

	public Date getDeliveryEndTime() {
		return this.deliveryEndTime;
	}
	public void setDeliveryEndTime(Date deliveryEndTime) {
		this.deliveryEndTime = deliveryEndTime;
	}

	public String getDeliveryName() {
		return this.deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public String getDeviceFileId() {
		return this.deviceFileId;
	}
	public void setDeviceFileId(String deviceFileId) {
		this.deviceFileId = deviceFileId;
	}

	public String getDeviceFileUrl() {
		return this.deviceFileUrl;
	}
	public void setDeviceFileUrl(String deviceFileUrl) {
		this.deviceFileUrl = deviceFileUrl;
	}

	public String getExcludeShopIds() {
		return this.excludeShopIds;
	}
	public void setExcludeShopIds(String excludeShopIds) {
		this.excludeShopIds = excludeShopIds;
	}

	public String getIncludeShopIds() {
		return this.includeShopIds;
	}
	public void setIncludeShopIds(String includeShopIds) {
		this.includeShopIds = includeShopIds;
	}

	public String getTradeDownThreshold() {
		return this.tradeDownThreshold;
	}
	public void setTradeDownThreshold(String tradeDownThreshold) {
		this.tradeDownThreshold = tradeDownThreshold;
	}

	public String getTradeUponThreshold() {
		return this.tradeUponThreshold;
	}
	public void setTradeUponThreshold(String tradeUponThreshold) {
		this.tradeUponThreshold = tradeUponThreshold;
	}

}
