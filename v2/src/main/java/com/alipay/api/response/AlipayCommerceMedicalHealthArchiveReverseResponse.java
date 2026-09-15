package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReverseResultList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.health.archive.reverse response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-27 15:57:49
 */
public class AlipayCommerceMedicalHealthArchiveReverseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2241529514265739644L;

	/** 
	 * 整体是否成功（删除异常等失败场景返回 false；NOT_FOUND / 参数缺失等幂等场景仍返回 true）
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 整体结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * null
	 */
	@ApiListField("result_details")
	@ApiField("reverse_result_list")
	private List<ReverseResultList> resultDetails;

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDetails(List<ReverseResultList> resultDetails) {
		this.resultDetails = resultDetails;
	}
	public List<ReverseResultList> getResultDetails( ) {
		return this.resultDetails;
	}

}
