package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.test.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:00
 */
public class AlipayBossProdTestModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4836263955519448536L;

	/** 
	 * test
	 */
	@ApiField("out_boolean")
	private String outBoolean;

	/** 
	 * test
	 */
	@ApiField("out_date")
	private Date outDate;

	/** 
	 * test
	 */
	@ApiField("out_number")
	private Long outNumber;

	/** 
	 * test
	 */
	@ApiField("out_number_open_id")
	private String outNumberOpenId;

	/** 
	 * test
	 */
	@ApiField("out_price")
	private String outPrice;

	/** 
	 * test
	 */
	@ApiField("out_string")
	private String outString;

	public void setOutBoolean(String outBoolean) {
		this.outBoolean = outBoolean;
	}
	public String getOutBoolean( ) {
		return this.outBoolean;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}
	public Date getOutDate( ) {
		return this.outDate;
	}

	public void setOutNumber(Long outNumber) {
		this.outNumber = outNumber;
	}
	public Long getOutNumber( ) {
		return this.outNumber;
	}

	public void setOutNumberOpenId(String outNumberOpenId) {
		this.outNumberOpenId = outNumberOpenId;
	}
	public String getOutNumberOpenId( ) {
		return this.outNumberOpenId;
	}

	public void setOutPrice(String outPrice) {
		this.outPrice = outPrice;
	}
	public String getOutPrice( ) {
		return this.outPrice;
	}

	public void setOutString(String outString) {
		this.outString = outString;
	}
	public String getOutString( ) {
		return this.outString;
	}

}
