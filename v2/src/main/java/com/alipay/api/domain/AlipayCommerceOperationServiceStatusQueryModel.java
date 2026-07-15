package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字化解决方案服务状态查询接口
 *
 * @author auto create
 * @since 1.0, 2026-05-20 11:17:45
 */
public class AlipayCommerceOperationServiceStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1367625316848289621L;

	/**
	 * 业务信息，是序列化字符串，如门店列表信息、商户信息、报名信息等等
	 */
	@ApiField("request_data")
	private String requestData;

	/**
	 * 服务code，如流量币、高德支付宝音响合作服务码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 主体id
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 主体类型，枚举值：ALPAY_USER（商户）、SMID（二级商户）、POIMID（门店）、LEADS_ID（leadsId）、BIZ_TID、TAG_ID、SN、EMAIL、PHONE、APP
	 */
	@ApiField("subject_type")
	private String subjectType;

	public String getRequestData() {
		return this.requestData;
	}
	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
