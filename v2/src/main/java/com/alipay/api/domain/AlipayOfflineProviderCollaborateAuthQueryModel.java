package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权申请单查询
 *
 * @author auto create
 * @since 1.0, 2025-02-14 18:21:40
 */
public class AlipayOfflineProviderCollaborateAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5299997757596648575L;

	/**
	 * 授权申请单ID，即发起法人授权接口返回的申请单ID
	 */
	@ApiField("auth_order_id")
	private String authOrderId;

	/**
	 * 设备绑定申请接口（alipay.offline.provider.collaborate.devicebind.apply）传入的out_biz_no字段
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAuthOrderId() {
		return this.authOrderId;
	}
	public void setAuthOrderId(String authOrderId) {
		this.authOrderId = authOrderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
