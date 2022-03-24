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
 * @since 1.0, 2021-07-14 10:09:17
 */
public class AlipayUserAccountDeviceInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6897843743867742681L;

	/** 
	 * 满足投放条件的简要设备信息
1. device_id：对应入参中设备的唯一标识；
2. device_label：咨询的结果标签
	 */
	@ApiListField("device_infos")
	@ApiField("device_result_info")
	private List<DeviceResultInfo> deviceInfos;

	/** 
	 * 设备类型，如：IDFA、IMEI、MOBILE等
注意：该字段正在废弃，由于该信息取自用户传入参数，所以此处不再做回填；
	 */
	@ApiField("device_type")
	private String deviceType;

	/** 
	 * 设备id的加密方式，如没有加密，可以不传。一般sha256即可满足需求，如其他方式，请和支付宝技术支持联系。
注意：该字段正在废弃，由于该信息取自用户传入参数，所以此处不再做回填；
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
