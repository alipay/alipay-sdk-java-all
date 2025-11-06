package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.fund.transfer.detect response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-03 15:52:18
 */
public class AlipayCommerceFundTransferDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 1534472569387116888L;

	/** 
	 * 返回状态码
	 */
	@ApiField("data_code")
	private Long dataCode;

	/** 
	 * 返回信息
	 */
	@ApiField("data_message")
	private String dataMessage;

	/** 
	 * 返回数据
	 */
	@ApiField("data_result")
	private String dataResult;

	/** 
	 * 银行核对结果
	 */
	@ApiField("data_success")
	private Boolean dataSuccess;

	/** 
	 * 交易发生的时间戳
	 */
	@ApiField("data_timestamp")
	private Long dataTimestamp;

	public void setDataCode(Long dataCode) {
		this.dataCode = dataCode;
	}
	public Long getDataCode( ) {
		return this.dataCode;
	}

	public void setDataMessage(String dataMessage) {
		this.dataMessage = dataMessage;
	}
	public String getDataMessage( ) {
		return this.dataMessage;
	}

	public void setDataResult(String dataResult) {
		this.dataResult = dataResult;
	}
	public String getDataResult( ) {
		return this.dataResult;
	}

	public void setDataSuccess(Boolean dataSuccess) {
		this.dataSuccess = dataSuccess;
	}
	public Boolean getDataSuccess( ) {
		return this.dataSuccess;
	}

	public void setDataTimestamp(Long dataTimestamp) {
		this.dataTimestamp = dataTimestamp;
	}
	public Long getDataTimestamp( ) {
		return this.dataTimestamp;
	}

}
