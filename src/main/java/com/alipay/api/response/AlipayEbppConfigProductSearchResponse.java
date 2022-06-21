package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InputFieldModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.config.product.search response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEbppConfigProductSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 2661793991623318327L;

	/** 
	 * 出账机构简称例如杭州电力的简称为HZELECTRIC
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 销账机构英文简称
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/** 
	 * 错误码，查询失败的返回码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误信息描述，如参数不合法
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 输入域模型列表inputFieldList
	 */
	@ApiListField("input_field_list")
	@ApiField("input_field_model")
	private List<InputFieldModel> inputFieldList;

	/** 
	 * 是否成功，true或者false
	 */
	@ApiField("is_success")
	private String isSuccess;

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst( ) {
		return this.chargeInst;
	}

	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}
	public String getChargeoffInst( ) {
		return this.chargeoffInst;
	}

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

	public void setInputFieldList(List<InputFieldModel> inputFieldList) {
		this.inputFieldList = inputFieldList;
	}
	public List<InputFieldModel> getInputFieldList( ) {
		return this.inputFieldList;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

}
