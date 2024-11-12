package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期号信息
 *
 * @author auto create
 * @since 1.0, 2024-10-22 14:07:16
 */
public class InstallmentNoInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2289131793981571997L;

	/**
	 * 当前分期数
	 */
	@ApiField("installment_no")
	private String installmentNo;

	/**
	 * 分期的阶段编码，与创建时的阶段付款计划里的阶段编码对应
	 */
	@ApiField("stage_no")
	private Long stageNo;

	public String getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(String installmentNo) {
		this.installmentNo = installmentNo;
	}

	public Long getStageNo() {
		return this.stageNo;
	}
	public void setStageNo(Long stageNo) {
		this.stageNo = stageNo;
	}

}
