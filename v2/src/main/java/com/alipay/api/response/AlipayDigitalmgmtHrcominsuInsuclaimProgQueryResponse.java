package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsuClaimVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcominsu.insuclaim.prog.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-17 17:51:05
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimProgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4457156885437857814L;

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
