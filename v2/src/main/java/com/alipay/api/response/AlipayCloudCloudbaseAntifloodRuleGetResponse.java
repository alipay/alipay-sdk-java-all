package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.antiflood.rule.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:41:45
 */
public class AlipayCloudCloudbaseAntifloodRuleGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5153482316248198862L;

	/** 
	 * IP或IP段
	 */
	@ApiField("cidr_block")
	private String cidrBlock;

	/** 
	 * 结束时间
	 */
	@ApiField("end")
	private String end;

	/** 
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 规则来源
 - BARRIER
 - BLACKLIST
	 */
	@ApiField("source")
	private String source;

	/** 
	 * 开始时间
	 */
	@ApiField("start")
	private String start;

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}
	public String getCidrBlock( ) {
		return this.cidrBlock;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	public String getEnd( ) {
		return this.end;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource( ) {
		return this.source;
	}

	public void setStart(String start) {
		this.start = start;
	}
	public String getStart( ) {
		return this.start;
	}

}
