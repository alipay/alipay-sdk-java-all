package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.devicebind.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-13 14:07:24
 */
public class AlipayOfflineProviderCollaborateDevicebindCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4498167874442899152L;

	/** 
	 * 设备备注信息，可将该提示展示给小二，由小二决定是否展示二维码给商户签约
	 */
	@ApiField("device_remark")
	private String deviceRemark;

	/** 
	 * true-在白名单中，false-不在白名单中，如果在白名单中设备是直接绑定的，不在白名单中设备需要绑定卖进方案
	 */
	@ApiField("in_white_list")
	private Boolean inWhiteList;

	/** 
	 * true:法人能够签约，false：法人不能签约
	 */
	@ApiField("legal_person_is_allow_sign")
	private Boolean legalPersonIsAllowSign;

	public void setDeviceRemark(String deviceRemark) {
		this.deviceRemark = deviceRemark;
	}
	public String getDeviceRemark( ) {
		return this.deviceRemark;
	}

	public void setInWhiteList(Boolean inWhiteList) {
		this.inWhiteList = inWhiteList;
	}
	public Boolean getInWhiteList( ) {
		return this.inWhiteList;
	}

	public void setLegalPersonIsAllowSign(Boolean legalPersonIsAllowSign) {
		this.legalPersonIsAllowSign = legalPersonIsAllowSign;
	}
	public Boolean getLegalPersonIsAllowSign( ) {
		return this.legalPersonIsAllowSign;
	}

}
