package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.blacklist.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-24 20:51:41
 */
public class AlipayCommerceTransportEtcBlacklistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7153334547967671113L;

	/** 
	 * ETC_ADVANCE_OVERTIME
	 */
	@ApiField("blacklist_code")
	private String blacklistCode;

	/** 
	 * 垫资超期未还
	 */
	@ApiField("blacklist_desc")
	private String blacklistDesc;

	/** 
	 * 黑名单状态：（无数据）NONE、（入黑状态）BLACKLIST_IN、（出黑状态）BLACKLIST_OUT
	 */
	@ApiField("blacklist_status")
	private String blacklistStatus;

	/** 
	 * 最近入黑名单时间
	 */
	@ApiField("in_time")
	private Date inTime;

	/** 
	 * 最近出黑名单时间
	 */
	@ApiField("out_time")
	private Date outTime;

	/** 
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/** 
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	public void setBlacklistCode(String blacklistCode) {
		this.blacklistCode = blacklistCode;
	}
	public String getBlacklistCode( ) {
		return this.blacklistCode;
	}

	public void setBlacklistDesc(String blacklistDesc) {
		this.blacklistDesc = blacklistDesc;
	}
	public String getBlacklistDesc( ) {
		return this.blacklistDesc;
	}

	public void setBlacklistStatus(String blacklistStatus) {
		this.blacklistStatus = blacklistStatus;
	}
	public String getBlacklistStatus( ) {
		return this.blacklistStatus;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public Date getInTime( ) {
		return this.inTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	public Date getOutTime( ) {
		return this.outTime;
	}

	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}
	public String getPlateColor( ) {
		return this.plateColor;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getPlateNo( ) {
		return this.plateNo;
	}

}
