package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字化解决方案服务报名进度查询接口
 *
 * @author auto create
 * @since 1.0, 2026-05-20 11:12:44
 */
public class AlipayCommerceOperationServiceApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2392547691257986941L;

	/**
	 * 报名记录id
	 */
	@ApiField("apply_record_id")
	private String applyRecordId;

	/**
	 * 服务code，如流量币、高德支付宝音响合作服务码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getApplyRecordId() {
		return this.applyRecordId;
	}
	public void setApplyRecordId(String applyRecordId) {
		this.applyRecordId = applyRecordId;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
