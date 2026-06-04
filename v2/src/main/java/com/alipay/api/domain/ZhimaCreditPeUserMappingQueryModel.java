package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻用户映射白鹭分信息查询
 *
 * @author auto create
 * @since 1.0, 2026-05-26 14:55:33
 */
public class ZhimaCreditPeUserMappingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3843424659326545431L;

	/**
	 * 开通/授权成功后生成的协议号，用于标记本次开通/授权的唯一标识
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/**
	 * 标记本次请求的用户是否为首次开通：Y表示首次，N表示非首次
	 */
	@ApiField("is_new_open")
	private String isNewOpen;

	/**
	 * 查询操作类型：MAPPING_SCORE
	 */
	@ApiField("mapping_type")
	private String mappingType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用于表示本次请求的唯一请求单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 信用服务service_id； 芝麻侧通过商户PID生成的一个信用服务的id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCreditAgreementId() {
		return this.creditAgreementId;
	}
	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}

	public String getIsNewOpen() {
		return this.isNewOpen;
	}
	public void setIsNewOpen(String isNewOpen) {
		this.isNewOpen = isNewOpen;
	}

	public String getMappingType() {
		return this.mappingType;
	}
	public void setMappingType(String mappingType) {
		this.mappingType = mappingType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
