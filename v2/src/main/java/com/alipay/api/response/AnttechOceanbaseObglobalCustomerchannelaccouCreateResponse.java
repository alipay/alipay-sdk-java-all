package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FxiaokeCreateCustomerChannelAccountResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.customerchannelaccou.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-19 09:26:48
 */
public class AnttechOceanbaseObglobalCustomerchannelaccouCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3347769185625958235L;

	/** 
	 * 业务错误码
	 */
	@ApiField("biz_error_code")
	private String bizErrorCode;

	/** 
	 * 业务错误信息
	 */
	@ApiField("biz_error_msg")
	private String bizErrorMsg;

	/** 
	 * 业务是否成功
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 创建客户关联渠道账号返回结果
	 */
	@ApiField("result")
	private FxiaokeCreateCustomerChannelAccountResponse result;

	public void setBizErrorCode(String bizErrorCode) {
		this.bizErrorCode = bizErrorCode;
	}
	public String getBizErrorCode( ) {
		return this.bizErrorCode;
	}

	public void setBizErrorMsg(String bizErrorMsg) {
		this.bizErrorMsg = bizErrorMsg;
	}
	public String getBizErrorMsg( ) {
		return this.bizErrorMsg;
	}

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setResult(FxiaokeCreateCustomerChannelAccountResponse result) {
		this.result = result;
	}
	public FxiaokeCreateCustomerChannelAccountResponse getResult( ) {
		return this.result;
	}

}
