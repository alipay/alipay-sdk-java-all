package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.device.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-14 14:30:21
 */
public class AlipayUserAccountDeviceInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5438425475912344264L;

	/** 
	 * 满足投放条件的简要设备信息
	 */
	@ApiListField("device_infos")
	@ApiField("device_result_info")
	private List<DeviceResultInfo> deviceInfos;

	/** 
	 * 设备类型，如：IDFA、IMEI、MOBILE等
	 */
	@ApiField("device_type")
	private String deviceType;

	/** 
	 * 设备id的加密方式，如没有加密，可以不传。一般sha256即可满足需求，如其他方式，请和支付宝技术支持联系
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/** 
	 * 请求处理结果
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setDeviceInfos(List<DeviceResultInfo> deviceInfos) {
		this.deviceInfos = deviceInfos;
	}
	public List<DeviceResultInfo> getDeviceInfos( ) {
		return this.deviceInfos;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceType( ) {
		return this.deviceType;
	}

	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}
	public String getEncryptType( ) {
		return this.encryptType;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
