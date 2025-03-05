package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 变更小程序云服务开通状态
 *
 * @author auto create
 * @since 1.0, 2023-08-31 17:35:29
 */
public class AlipayOpenMiniCloudSupportModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3787769222374627727L;

	/**
	 * 要变更云服务状态的小程序应用id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 操作类型
open:开通
close:关闭
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 云服务类型
CLOUD_BASIS:云开发
CLOUD_RUN:云托管
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
