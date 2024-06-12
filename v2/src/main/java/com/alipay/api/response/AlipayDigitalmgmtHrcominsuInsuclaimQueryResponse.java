package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsuClaimVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcominsu.insuclaim.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:28
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1387765891733717811L;

	/** 
	 * insu_claim_vos+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiListField("insu_claim_vos")
	@ApiField("insu_claim_vo")
	private List<InsuClaimVo> insuClaimVos;

	public void setInsuClaimVos(List<InsuClaimVo> insuClaimVos) {
		this.insuClaimVos = insuClaimVos;
	}
	public List<InsuClaimVo> getInsuClaimVos( ) {
		return this.insuClaimVos;
	}

}
