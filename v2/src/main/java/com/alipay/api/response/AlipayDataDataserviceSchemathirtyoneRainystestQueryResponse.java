package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainysCompelxTypeWeakRefTwo;
import com.alipay.api.domain.RainyComplexTypesTheFourteen;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemathirtyone.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-29 15:52:34
 */
public class AlipayDataDataserviceSchemathirtyoneRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8685457313337385326L;

	/** 
	 * test case
	 */
	@ApiField("demo")
	private String demo;

	/** 
	 * test CASE FOR PRE
	 */
	@ApiField("demo_empty_vv")
	private String demoEmptyVv;

	/** 
	 * test case change the value
	 */
	@ApiField("demo_emtpy")
	private String demoEmtpy;

	/** 
	 * test case
change the empty
	 */
	@ApiField("demo_other")
	private String demoOther;

	/** 
	 * test case
	 */
	@ApiField("demo_weak_ref")
	private RainysCompelxTypeWeakRefTwo demoWeakRef;

	/** 
	 * 出参一
	 */
	@ApiField("outone")
	private RainyComplexTypesTheFourteen outone;

	public void setDemo(String demo) {
		this.demo = demo;
	}
	public String getDemo( ) {
		return this.demo;
	}

	public void setDemoEmptyVv(String demoEmptyVv) {
		this.demoEmptyVv = demoEmptyVv;
	}
	public String getDemoEmptyVv( ) {
		return this.demoEmptyVv;
	}

	public void setDemoEmtpy(String demoEmtpy) {
		this.demoEmtpy = demoEmtpy;
	}
	public String getDemoEmtpy( ) {
		return this.demoEmtpy;
	}

	public void setDemoOther(String demoOther) {
		this.demoOther = demoOther;
	}
	public String getDemoOther( ) {
		return this.demoOther;
	}

	public void setDemoWeakRef(RainysCompelxTypeWeakRefTwo demoWeakRef) {
		this.demoWeakRef = demoWeakRef;
	}
	public RainysCompelxTypeWeakRefTwo getDemoWeakRef( ) {
		return this.demoWeakRef;
	}

	public void setOutone(RainyComplexTypesTheFourteen outone) {
		this.outone = outone;
	}
	public RainyComplexTypesTheFourteen getOutone( ) {
		return this.outone;
	}

}
