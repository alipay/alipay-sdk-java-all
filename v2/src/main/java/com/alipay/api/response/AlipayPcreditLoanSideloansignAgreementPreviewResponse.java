package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AgreementView;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloansign.agreement.preview response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-25 15:02:34
 */
public class AlipayPcreditLoanSideloansignAgreementPreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 4132575481936355799L;

	/** 
	 * 协议渲染返回对象列表
	 */
	@ApiListField("agreement_list")
	@ApiField("agreement_view")
	private List<AgreementView> agreementList;

	/** 
	 * 透传协议预览相关信息
	 */
	@ApiField("extension")
	private String extension;

	/** 
	 * 表示当前请求处理状态
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * returnCode为FAIL或者NEED_RETRY状态下，返回具体详细子级错误码
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * return_code为FAIL时, 需要返回return_sub_message以详细描述失败原因，方便双方定位问题
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

	public void setAgreementList(List<AgreementView> agreementList) {
		this.agreementList = agreementList;
	}
	public List<AgreementView> getAgreementList( ) {
		return this.agreementList;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getExtension( ) {
		return this.extension;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnCode( ) {
		return this.returnCode;
	}

	public void setReturnSubCode(String returnSubCode) {
		this.returnSubCode = returnSubCode;
	}
	public String getReturnSubCode( ) {
		return this.returnSubCode;
	}

	public void setReturnSubMessage(String returnSubMessage) {
		this.returnSubMessage = returnSubMessage;
	}
	public String getReturnSubMessage( ) {
		return this.returnSubMessage;
	}

}
