package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecomProduct;
import com.alipay.api.domain.InsurancePeriod;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.haha.isptest.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-15 17:35:24
 */
public class AlipaySecurityRiskHahaIsptestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8189737896452995141L;

	/** 
	 * 高级复杂类型
	 */
	@ApiListField("out_four")
	@ApiField("recom_product")
	private List<RecomProduct> outFour;

	/** 
	 * 23
	 */
	@ApiField("out_one")
	private String outOne;

	/** 
	 * 简单复杂类型
	 */
	@ApiListField("out_three")
	@ApiField("insurance_period")
	private List<InsurancePeriod> outThree;

	/** 
	 * 出参2
	 */
	@ApiListField("out_two")
	@ApiField("string")
	private List<String> outTwo;

	public void setOutFour(List<RecomProduct> outFour) {
		this.outFour = outFour;
	}
	public List<RecomProduct> getOutFour( ) {
		return this.outFour;
	}

	public void setOutOne(String outOne) {
		this.outOne = outOne;
	}
	public String getOutOne( ) {
		return this.outOne;
	}

	public void setOutThree(List<InsurancePeriod> outThree) {
		this.outThree = outThree;
	}
	public List<InsurancePeriod> getOutThree( ) {
		return this.outThree;
	}

	public void setOutTwo(List<String> outTwo) {
		this.outTwo = outTwo;
	}
	public List<String> getOutTwo( ) {
		return this.outTwo;
	}

}
