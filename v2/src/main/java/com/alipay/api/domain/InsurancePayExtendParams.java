package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保支付扩展参数
 *
 * @author auto create
 * @since 1.0, 2024-10-22 19:08:13
 */
public class InsurancePayExtendParams extends AlipayObject {

	private static final long serialVersionUID = 8323291198831469281L;

	/**
	 * 用来表示调用接口的渠道方名称，目前为固定的枚举值
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 医保卡Id；即医保电子凭证授权码
	 */
	@ApiField("medical_card_id")
	private String medicalCardId;

	/**
	 * 医保卡颁发机构编码；医保电子凭证为NATHSA
	 */
	@ApiField("medical_card_inst_id")
	private String medicalCardInstId;

	/**
	 * 系统商编号，该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getMedicalCardId() {
		return this.medicalCardId;
	}
	public void setMedicalCardId(String medicalCardId) {
		this.medicalCardId = medicalCardId;
	}

	public String getMedicalCardInstId() {
		return this.medicalCardInstId;
	}
	public void setMedicalCardInstId(String medicalCardInstId) {
		this.medicalCardInstId = medicalCardInstId;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
