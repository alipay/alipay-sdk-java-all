package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BFActivityOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcbenefitcore.bfactivitfacade.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:04
 */
public class AlipayPcreditHuabeiPcbenefitcoreBfactivitfacadeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6238515477925615349L;

	/** 
	 * 错误信息，参考通用错误格式
	 */
	@ApiListField("error_context")
	@ApiField("string")
	private List<String> errorContext;

	/** 
	 * 花呗营销活动信息返回数据
	 */
	@ApiField("result")
	private BFActivityOpenApiResult result;

	/** 
	 * 请求是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorContext(List<String> errorContext) {
		this.errorContext = errorContext;
	}
	public List<String> getErrorContext( ) {
		return this.errorContext;
	}

	public void setResult(BFActivityOpenApiResult result) {
		this.result = result;
	}
	public BFActivityOpenApiResult getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
