package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务模式设置
 *
 * @author auto create
 * @since 1.0, 2022-12-12 10:20:44
 */
public class AlipayIserviceCcmLcsServicemodelSetModel extends AlipayObject {

	private static final long serialVersionUID = 4158988921331113551L;

	/**
	 * 租户实例id（数据权限id），不填，则使用默认的租户实例id
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 云客服服务模式code
	 */
	@ApiField("service_mode")
	private String serviceMode;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getServiceMode() {
		return this.serviceMode;
	}
	public void setServiceMode(String serviceMode) {
		this.serviceMode = serviceMode;
	}

}
