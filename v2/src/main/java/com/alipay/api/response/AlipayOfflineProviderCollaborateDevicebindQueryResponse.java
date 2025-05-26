package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BindApplyResult;
import com.alipay.api.domain.IotDeviceBindBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.devicebind.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-16 18:05:55
 */
public class AlipayOfflineProviderCollaborateDevicebindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2118567644181771517L;

	/** 
	 * 设备绑定申请单列表
	 */
	@ApiListField("apply_result_info")
	@ApiField("bind_apply_result")
	private List<BindApplyResult> applyResultInfo;

	/** 
	 * 设备当前绑定信息
	 */
	@ApiField("bind_info")
	private IotDeviceBindBaseInfo bindInfo;

	public void setApplyResultInfo(List<BindApplyResult> applyResultInfo) {
		this.applyResultInfo = applyResultInfo;
	}
	public List<BindApplyResult> getApplyResultInfo( ) {
		return this.applyResultInfo;
	}

	public void setBindInfo(IotDeviceBindBaseInfo bindInfo) {
		this.bindInfo = bindInfo;
	}
	public IotDeviceBindBaseInfo getBindInfo( ) {
		return this.bindInfo;
	}

}
