package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IoTBPaaSDeviceApplyBindInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotbpaas.devicebind.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:57:52
 */
public class AlipayOpenIotbpaasDevicebindApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3858215683241184311L;

	/** 
	 * 绑定信息
	 */
	@ApiField("bind_info")
	private IoTBPaaSDeviceApplyBindInfo bindInfo;

	/** 
	 * 绑定状态，枚举如下：
* 1：已绑定；
* 2：未绑定；
* 3：绑定中；
* 4：绑定失败；
* 5：无效token。
	 */
	@ApiField("bind_status")
	private Long bindStatus;

	/** 
	 * 绑定token，用于轮询绑定状态
	 */
	@ApiField("bind_token")
	private String bindToken;

	/** 
	 * 绑定URL，用于引导商户进行绑定操作
	 */
	@ApiField("bind_url")
	private String bindUrl;

	public void setBindInfo(IoTBPaaSDeviceApplyBindInfo bindInfo) {
		this.bindInfo = bindInfo;
	}
	public IoTBPaaSDeviceApplyBindInfo getBindInfo( ) {
		return this.bindInfo;
	}

	public void setBindStatus(Long bindStatus) {
		this.bindStatus = bindStatus;
	}
	public Long getBindStatus( ) {
		return this.bindStatus;
	}

	public void setBindToken(String bindToken) {
		this.bindToken = bindToken;
	}
	public String getBindToken( ) {
		return this.bindToken;
	}

	public void setBindUrl(String bindUrl) {
		this.bindUrl = bindUrl;
	}
	public String getBindUrl( ) {
		return this.bindUrl;
	}

}
