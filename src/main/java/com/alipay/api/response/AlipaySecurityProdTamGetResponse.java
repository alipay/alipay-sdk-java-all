package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.tam.get response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-09 13:36:41
 */
public class AlipaySecurityProdTamGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3681917952285817696L;

	/** 
	 * encrypted_ta_bin（ta二进制文件的加密字符串）+ 不唯一+用于传递加密后的ta文件给OEM厂商服务端+获取方式为支付宝服务端加密后生成+特殊说明：输入框长度有限，示例值并非真实的值，实际文件长度可能会超过4096
	 */
	@ApiField("encrypted_ta_bin")
	private String encryptedTaBin;

	/** 
	 * 加密后的用于ta访问的数据+不唯一+用于传递给OEM厂商服务端下发到支付宝客户端+获取方式为支付宝服务端加密后生成+特殊说明：输入框长度有限，示例值并非实际传输的值，传输的值的实际长度可能超过2048
	 */
	@ApiField("encrypted_ta_data")
	private String encryptedTaData;

	/** 
	 * return_code(错误码)+不唯一+用于响应OEM厂商服务端的请求+是枚举值，000000含义为成功+生成方式由具体执行情况确定+其它枚举值进一步约定
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * return_desc(响应描述)+不唯一+用于描述响应信息+有枚举值：OPERATION_SUCCESS ERR_DEV_STATE_MISMATCH ERR_INVALID_UUID ERR_OCSP_INVALID ERR_OWE_NOT_TRUSTED ERR_REQUEST_INVALID ERR_SD_NOT_EMPTY ERR_SDID_ALREADY_USED ERR_SPCERT_INVALID ERR_TA_ALREADY_INSTALLED ERR_TA_INVALID ERR_TA_NOT_FOUND ERR_TEE_BUSY
ERR_TEE_FAIL ERR_TEE_RESOURCE_FULL ERR_TEE_UNKNOWN ERR_TFW_NOT_TRUSTED ERR_UNSUPPORTED_CRYPTO_ALG ERR_UNSUPPORTED_MSG_VERSION ERR_UPDATING_DATA+获取方式：由具体执行情况确定
	 */
	@ApiField("return_desc")
	private String returnDesc;

	public void setEncryptedTaBin(String encryptedTaBin) {
		this.encryptedTaBin = encryptedTaBin;
	}
	public String getEncryptedTaBin( ) {
		return this.encryptedTaBin;
	}

	public void setEncryptedTaData(String encryptedTaData) {
		this.encryptedTaData = encryptedTaData;
	}
	public String getEncryptedTaData( ) {
		return this.encryptedTaData;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnCode( ) {
		return this.returnCode;
	}

	public void setReturnDesc(String returnDesc) {
		this.returnDesc = returnDesc;
	}
	public String getReturnDesc( ) {
		return this.returnDesc;
	}

}
