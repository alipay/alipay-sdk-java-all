package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItermInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.item.update response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEbppRechargeItemUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4329644131215472551L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误类型
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 返回对象的列表
	 */
	@ApiListField("iterm_infos")
	@ApiField("iterm_info")
	private List<ItermInfo> itermInfos;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setItermInfos(List<ItermInfo> itermInfos) {
		this.itermInfos = itermInfos;
	}
	public List<ItermInfo> getItermInfos( ) {
		return this.itermInfos;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
