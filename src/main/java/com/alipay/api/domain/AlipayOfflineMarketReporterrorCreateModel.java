package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上报线下服务异常
 *
 * @author auto create
 * @since 1.0, 2017-07-03 14:41:37
 */
public class AlipayOfflineMarketReporterrorCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5421345826495617526L;

	/**
	 * 发生错误的时候，当前系统的毫秒数，系统会把当前时间构建成Date对象保存为错误发生时间
	 */
	@ApiField("err_time")
	private Long errTime;

	/**
	 * 如果：type是tableNum  请设置table_num字段作为桌码
	 */
	@ApiField("feature")
	private ReportErrorFeature feature;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 上传类型，通过类型来区分不同错误： value=tableNum 代表扫码点菜
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户的ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getErrTime() {
		return this.errTime;
	}
	public void setErrTime(Long errTime) {
		this.errTime = errTime;
	}

	public ReportErrorFeature getFeature() {
		return this.feature;
	}
	public void setFeature(ReportErrorFeature feature) {
		this.feature = feature;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
