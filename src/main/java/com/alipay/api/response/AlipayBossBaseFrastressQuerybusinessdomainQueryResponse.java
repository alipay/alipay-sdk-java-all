package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RiskBizDomain;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.frastress.querybusinessdomain.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-25 17:46:38
 */
public class AlipayBossBaseFrastressQuerybusinessdomainQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8371242197557136958L;

	/** 
	 * 返回实体结果
	 */
	@ApiListField("result")
	@ApiField("risk_biz_domain")
	private List<RiskBizDomain> result;

	public void setResult(List<RiskBizDomain> result) {
		this.result = result;
	}
	public List<RiskBizDomain> getResult( ) {
		return this.result;
	}

}
