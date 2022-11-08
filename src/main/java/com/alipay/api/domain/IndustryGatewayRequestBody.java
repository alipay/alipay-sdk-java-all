package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发往行业云网关请求体
 *
 * @author auto create
 * @since 1.0, 2022-01-14 11:42:31
 */
public class IndustryGatewayRequestBody extends AlipayObject {

	private static final long serialVersionUID = 2864679916919471791L;

	/**
	 * 场景标识 si_payment_income 缴费到账 si_medical_consume_detail 医保消费 si_medical_consume_month 医保月账单
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 城市编码，国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 根据场景不同的模型数据, json 数组格式
	 */
	@ApiListField("si_data")
	@ApiField("si_data")
	private List<SiData> siData;

	/**
	 * 返佣合作伙伴id
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	/**
	 * 通知时间，为空为当前时间立即发送 格式：yyyyMMddHHmms
	 */
	@ApiField("target_notify_time")
	private String targetNotifyTime;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public List<SiData> getSiData() {
		return this.siData;
	}
	public void setSiData(List<SiData> siData) {
		this.siData = siData;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

	public String getTargetNotifyTime() {
		return this.targetNotifyTime;
	}
	public void setTargetNotifyTime(String targetNotifyTime) {
		this.targetNotifyTime = targetNotifyTime;
	}

}
