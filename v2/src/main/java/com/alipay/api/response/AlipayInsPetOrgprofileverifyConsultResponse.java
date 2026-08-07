package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.pet.orgprofileverify.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-31 15:10:02
 */
public class AlipayInsPetOrgprofileverifyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7427256848265831827L;

	/** 
	 * "true":"识别为同宠"
"false":"识别为非同宠"
	 */
	@ApiField("same_pet_result")
	private String samePetResult;

	/** 
	 * 校验结果的置信度得分，范围是[0,100]的数字，数字越大，置信度越高
	 */
	@ApiField("score")
	private String score;

	/** 
	 * 同宠识别是否完成的标识
	 */
	@ApiField("status")
	private String status;

	public void setSamePetResult(String samePetResult) {
		this.samePetResult = samePetResult;
	}
	public String getSamePetResult( ) {
		return this.samePetResult;
	}

	public void setScore(String score) {
		this.score = score;
	}
	public String getScore( ) {
		return this.score;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
