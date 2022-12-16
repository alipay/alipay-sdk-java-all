package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区服务信息
 *
 * @author auto create
 * @since 1.0, 2021-04-30 15:39:18
 */
public class CommunityServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 3391168417838531775L;

	/**
	 * 服务类型
"THIRD_PARTY_COMMUNITY_JIAOFEI", "THIRD_PARTY","物业缴费"
"CENTRAL_SCAN_CODE_PASS", "SCAN_CODE_PASS","扫码通行联动门禁"
"OPEN_SESAME", "SCAN_CODE_PASS","扫码通行无门禁"
"H5_SCAN_CODE_PASS", "SCAN_CODE_PASS","扫码通行内部H5模式"
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务状态
"WAIT_BIND_METERIAL", "待物业小区关系材料上传"
"WAIT_BIND_AUDIT", "待小二审核状态"
"WAIT_ONLINE_REQUEST", "待ISV申请上线"
"WAIT_ONLINE_AUDIT", "待小二审核上线"
"ONLINE", "上线"
"ONLINE_AUDIT_REJECT", "上线拒绝"
	 */
	@ApiField("status")
	private String status;

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
