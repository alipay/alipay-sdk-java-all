package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家人群信息 
-注意：商家会员专用，禁止滥用，因模型升级造成的兼容性问题，后果自负
 *
 * @author auto create
 * @since 1.0, 2022-08-01 20:56:55
 */
public class QipanMerchantCrowd extends AlipayObject {

	private static final long serialVersionUID = 7272575846655524371L;

	/**
	 * 支付宝人群code
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 人群描述
	 */
	@ApiField("crowd_desc")
	private String crowdDesc;

	/**
	 * 人群名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 商户外部用户人群code 用于标识商家人群，需保证同一商户下crowd_code唯一
	 */
	@ApiField("external_crowd_code")
	private String externalCrowdCode;

	/**
	 * INIT-初始化中
EFFECTIVE-生效
INEFFECTIVE-失效
	 */
	@ApiField("status")
	private String status;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public String getCrowdDesc() {
		return this.crowdDesc;
	}
	public void setCrowdDesc(String crowdDesc) {
		this.crowdDesc = crowdDesc;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public String getExternalCrowdCode() {
		return this.externalCrowdCode;
	}
	public void setExternalCrowdCode(String externalCrowdCode) {
		this.externalCrowdCode = externalCrowdCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
