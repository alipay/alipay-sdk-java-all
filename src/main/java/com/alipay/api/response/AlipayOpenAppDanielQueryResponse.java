package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AppTestInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.daniel.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-16 17:31:44
 */
public class AlipayOpenAppDanielQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6653211167948751347L;

	/** 
	 * 1
	 */
	@ApiField("daniel_out_complex")
	private AppTestInfo danielOutComplex;

	/** 
	 * 2
	 */
	@ApiField("daniel_out_price")
	private String danielOutPrice;

	/** 
	 * 1
	 */
	@ApiField("daniel_output")
	private String danielOutput;

	/** 
	 * 12
	 */
	@ApiField("output_boolean")
	private Boolean outputBoolean;

	/** 
	 * 12
	 */
	@ApiField("output_date")
	private Date outputDate;

	public void setDanielOutComplex(AppTestInfo danielOutComplex) {
		this.danielOutComplex = danielOutComplex;
	}
	public AppTestInfo getDanielOutComplex( ) {
		return this.danielOutComplex;
	}

	public void setDanielOutPrice(String danielOutPrice) {
		this.danielOutPrice = danielOutPrice;
	}
	public String getDanielOutPrice( ) {
		return this.danielOutPrice;
	}

	public void setDanielOutput(String danielOutput) {
		this.danielOutput = danielOutput;
	}
	public String getDanielOutput( ) {
		return this.danielOutput;
	}

	public void setOutputBoolean(Boolean outputBoolean) {
		this.outputBoolean = outputBoolean;
	}
	public Boolean getOutputBoolean( ) {
		return this.outputBoolean;
	}

	public void setOutputDate(Date outputDate) {
		this.outputDate = outputDate;
	}
	public Date getOutputDate( ) {
		return this.outputDate;
	}

}
