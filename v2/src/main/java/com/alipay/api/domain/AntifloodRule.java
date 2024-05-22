package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 防刷规则列表
 *
 * @author auto create
 * @since 1.0, 2023-09-14 16:04:17
 */
public class AntifloodRule extends AlipayObject {

	private static final long serialVersionUID = 4648572477876437497L;

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

	public String getCidrBlock() {
		return this.cidrBlock;
	}
	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStart() {
		return this.start;
	}
	public void setStart(String start) {
		this.start = start;
	}

}
