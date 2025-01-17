package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrescriptionCheckDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.health.prescription.check response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:05
 */
public class AlipayInsSceneHealthPrescriptionCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8678842269921437658L;

	/** 
	 * 校验详情
	 */
	@ApiListField("check_details")
	@ApiField("prescription_check_detail")
	private List<PrescriptionCheckDetail> checkDetails;

	/** 
	 * 校验结果
pass:通过
need_improve:需要改进
forbidden:不通过
	 */
	@ApiField("check_result")
	private String checkResult;

	public void setCheckDetails(List<PrescriptionCheckDetail> checkDetails) {
		this.checkDetails = checkDetails;
	}
	public List<PrescriptionCheckDetail> getCheckDetails( ) {
		return this.checkDetails;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
	public String getCheckResult( ) {
		return this.checkResult;
	}

}
