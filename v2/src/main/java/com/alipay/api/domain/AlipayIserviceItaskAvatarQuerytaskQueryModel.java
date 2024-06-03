package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数字人短视频结果查询
 *
 * @author auto create
 * @since 1.0, 2024-04-25 17:04:58
 */
public class AlipayIserviceItaskAvatarQuerytaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4226848248177183629L;

	/**
	 * 任务列表
	 */
	@ApiListField("ids")
	@ApiField("number")
	private List<Long> ids;

	/**
	 * 租户code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public List<Long> getIds() {
		return this.ids;
	}
	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
