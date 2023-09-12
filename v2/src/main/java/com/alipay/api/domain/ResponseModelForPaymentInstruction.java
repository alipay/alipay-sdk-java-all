package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询付款进度通用结果模型
 *
 * @author auto create
 * @since 1.0, 2023-08-25 14:57:34
 */
public class ResponseModelForPaymentInstruction extends AlipayObject {

	private static final long serialVersionUID = 4433531619949765637L;

	/**
	 * 返回结果
	 */
	@ApiListField("data")
	@ApiField("cash_summary_d_t_o")
	private List<CashSummaryDTO> data;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误详细信息
	 */
	@ApiField("error_detail_info")
	private String errorDetailInfo;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public List<CashSummaryDTO> getData() {
		return this.data;
	}
	public void setData(List<CashSummaryDTO> data) {
		this.data = data;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDetailInfo() {
		return this.errorDetailInfo;
	}
	public void setErrorDetailInfo(String errorDetailInfo) {
		this.errorDetailInfo = errorDetailInfo;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
