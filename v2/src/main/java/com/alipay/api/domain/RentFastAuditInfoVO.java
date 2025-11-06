package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 极速审核信息
 *
 * @author auto create
 * @since 1.0, 2025-08-22 20:57:19
 */
public class RentFastAuditInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4378725755257238954L;

	/**
	 * 极速审核任务信息
	 */
	@ApiListField("fast_audit_task_info_list")
	@ApiField("rent_fast_audit_task_info_v_o")
	private List<RentFastAuditTaskInfoVO> fastAuditTaskInfoList;

	/**
	 * 极速审核页面连接地址
	 */
	@ApiField("fast_audit_url")
	private String fastAuditUrl;

	/**
	 * 审核资料安全密钥，用于对content进行解密
	 */
	@ApiField("secure_key")
	private String secureKey;

	public List<RentFastAuditTaskInfoVO> getFastAuditTaskInfoList() {
		return this.fastAuditTaskInfoList;
	}
	public void setFastAuditTaskInfoList(List<RentFastAuditTaskInfoVO> fastAuditTaskInfoList) {
		this.fastAuditTaskInfoList = fastAuditTaskInfoList;
	}

	public String getFastAuditUrl() {
		return this.fastAuditUrl;
	}
	public void setFastAuditUrl(String fastAuditUrl) {
		this.fastAuditUrl = fastAuditUrl;
	}

	public String getSecureKey() {
		return this.secureKey;
	}
	public void setSecureKey(String secureKey) {
		this.secureKey = secureKey;
	}

}
