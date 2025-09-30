package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CircularAgreementRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.circular.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-22 14:22:41
 */
public class AlipayCircularAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8574531291953353582L;

	/** 
	 * 扣款账户绑定关系
	 */
	@ApiField("relations")
	private CircularAgreementRelation relations;

	/** 
	 * 总条数
	 */
	@ApiField("total")
	private Long total;

	public void setRelations(CircularAgreementRelation relations) {
		this.relations = relations;
	}
	public CircularAgreementRelation getRelations( ) {
		return this.relations;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
