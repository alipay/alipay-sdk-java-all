package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁信息
 *
 * @author auto create
 * @since 1.0, 2025-01-08 19:56:18
 */
public class RentInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3845942274195211281L;

	/**
	 * 极速审核任务信息
	 */
	@ApiListField("fast_audit_task_info_list")
	@ApiField("fast_audit_task_info_v_o")
	private List<FastAuditTaskInfoVO> fastAuditTaskInfoList;

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

	public List<FastAuditTaskInfoVO> getFastAuditTaskInfoList() {
		return this.fastAuditTaskInfoList;
	}
	public void setFastAuditTaskInfoList(List<FastAuditTaskInfoVO> fastAuditTaskInfoList) {
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
