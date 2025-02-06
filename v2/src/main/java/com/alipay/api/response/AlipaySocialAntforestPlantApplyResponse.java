package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.plant.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 19:28:13
 */
public class AlipaySocialAntforestPlantApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7362776749788872821L;

	/** 
	 * 时间戳，记录的是业务在蚂蚁森林完成时间，可保存用户核对
	 */
	@ApiField("biz_time")
	private String bizTime;

	/** 
	 * 证书ID或者其他ID，表示一次兑换的凭证
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/** 
	 * 当前兑换树种账户的可用能量值
	 */
	@ApiField("current_energy")
	private Long currentEnergy;

	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}
	public String getBizTime( ) {
		return this.bizTime;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificateId( ) {
		return this.certificateId;
	}

	public void setCurrentEnergy(Long currentEnergy) {
		this.currentEnergy = currentEnergy;
	}
	public Long getCurrentEnergy( ) {
		return this.currentEnergy;
	}

}
