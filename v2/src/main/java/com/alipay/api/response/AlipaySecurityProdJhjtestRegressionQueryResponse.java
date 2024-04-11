package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PubNestPub;
import com.alipay.api.domain.DomainNestOther;
import com.alipay.api.domain.RegressionPublic;
import com.alipay.api.domain.RegressionInDomian;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.jhjtest.regression.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-03 16:36:55
 */
public class AlipaySecurityProdJhjtestRegressionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1318876298487456474L;

	/** 
	 * 22
	 */
	@ApiField("comp_c")
	private PubNestPub compC;

	/** 
	 * 2
	 */
	@ApiField("comp_d")
	private DomainNestOther compD;

	/** 
	 * 1
	 */
	@ApiField("out_a")
	private RegressionPublic outA;

	/** 
	 * 1
	 */
	@ApiField("out_comp_b")
	private RegressionInDomian outCompB;

	/** 
	 * 2
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/** 
	 * 2
	 */
	@ApiField("out_para")
	private String outPara;

	public void setCompC(PubNestPub compC) {
		this.compC = compC;
	}
	public PubNestPub getCompC( ) {
		return this.compC;
	}

	public void setCompD(DomainNestOther compD) {
		this.compD = compD;
	}
	public DomainNestOther getCompD( ) {
		return this.compD;
	}

	public void setOutA(RegressionPublic outA) {
		this.outA = outA;
	}
	public RegressionPublic getOutA( ) {
		return this.outA;
	}

	public void setOutCompB(RegressionInDomian outCompB) {
		this.outCompB = outCompB;
	}
	public RegressionInDomian getOutCompB( ) {
		return this.outCompB;
	}

	public void setOutOpenId(String outOpenId) {
		this.outOpenId = outOpenId;
	}
	public String getOutOpenId( ) {
		return this.outOpenId;
	}

	public void setOutPara(String outPara) {
		this.outPara = outPara;
	}
	public String getOutPara( ) {
		return this.outPara;
	}

}
