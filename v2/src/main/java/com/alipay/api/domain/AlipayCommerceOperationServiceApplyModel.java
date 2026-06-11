package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字化解决方案服务报名接口
 *
 * @author auto create
 * @since 1.0, 2026-06-09 20:07:54
 */
public class AlipayCommerceOperationServiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3276753668499488221L;

	/**
	 * 序列化后的业务信息,如门店列表信息、商户信息、报名信息等等
	 */
	@ApiField("apply_data")
	private String applyData;

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

	public String getApplyData() {
		return this.applyData;
	}
	public void setApplyData(String applyData) {
		this.applyData = applyData;
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
