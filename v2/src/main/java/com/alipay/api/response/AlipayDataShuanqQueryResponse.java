package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.shuanq.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:50
 */
public class AlipayDataShuanqQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6188499364661533622L;

	/** 
	 * rfdss
	 */
	@ApiField("cert_no")
	private Long certNo;

	/** 
	 * 的改动染发膏
	 */
	@ApiField("name")
	private Boolean name;

	/** 
	 * 萨芬圣德芬
	 */
	@ApiField("test")
	private Date test;

	public void setCertNo(Long certNo) {
		this.certNo = certNo;
	}
	public Long getCertNo( ) {
		return this.certNo;
	}

	public void setName(Boolean name) {
		this.name = name;
	}
	public Boolean getName( ) {
		return this.name;
	}

	public void setTest(Date test) {
		this.test = test;
	}
	public Date getTest( ) {
		return this.test;
	}

}
