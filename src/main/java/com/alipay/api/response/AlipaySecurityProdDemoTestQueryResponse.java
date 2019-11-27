package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BoxiuTestDSTwo;
import com.alipay.api.domain.BoxiuTestDS;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.demo.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-26 15:42:17
 */
public class AlipaySecurityProdDemoTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7791275689218834831L;

	/** 
	 * aaa
	 */
	@ApiField("boxiu_two_out")
	private BoxiuTestDSTwo boxiuTwoOut;

	/** 
	 * bbb
	 */
	@ApiField("level_1_plain")
	private String level1Plain;

	/** 
	 * 描述
	 */
	@ApiField("out_multi_level_complicated_ds")
	private BoxiuTestDS outMultiLevelComplicatedDs;

	/** 
	 * aaaa
	 */
	@ApiField("sametype")
	private BoxiuTestDSTwo sametype;

	public void setBoxiuTwoOut(BoxiuTestDSTwo boxiuTwoOut) {
		this.boxiuTwoOut = boxiuTwoOut;
	}
	public BoxiuTestDSTwo getBoxiuTwoOut( ) {
		return this.boxiuTwoOut;
	}

	public void setLevel1Plain(String level1Plain) {
		this.level1Plain = level1Plain;
	}
	public String getLevel1Plain( ) {
		return this.level1Plain;
	}

	public void setOutMultiLevelComplicatedDs(BoxiuTestDS outMultiLevelComplicatedDs) {
		this.outMultiLevelComplicatedDs = outMultiLevelComplicatedDs;
	}
	public BoxiuTestDS getOutMultiLevelComplicatedDs( ) {
		return this.outMultiLevelComplicatedDs;
	}

	public void setSametype(BoxiuTestDSTwo sametype) {
		this.sametype = sametype;
	}
	public BoxiuTestDSTwo getSametype( ) {
		return this.sametype;
	}

}
