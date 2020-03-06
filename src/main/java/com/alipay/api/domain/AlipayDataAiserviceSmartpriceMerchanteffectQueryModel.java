package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv商家效果展示接口
 *
 * @author auto create
 * @since 1.0, 2019-10-25 11:18:49
 */
public class AlipayDataAiserviceSmartpriceMerchanteffectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7867588826382337532L;

	/**
	 * 内部接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 商户Id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 标识定价场景 single_pay:单次支付定价stored_value_card:储值卡
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 接入方名称,不同业务方的区分
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 开始时间,传""表示返回开启服务后的所有记录
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 最小定价单元ID,传""时统计该商家下所有定价单元指标之和
	 */
	@ApiField("unit_id")
	private String unitId;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getUnitId() {
		return this.unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

}
