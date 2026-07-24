package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 某段时间交易状态描述
 *
 * @author auto create
 * @since 1.0, 2026-07-01 11:50:47
 */
public class TradingStageDTO extends AlipayObject {

	private static final long serialVersionUID = 2518144671434619155L;

	/**
	 * 开始时间
	 */
	@ApiField("begin")
	private Long begin;

	/**
	 * 是否包含开始时间
	 */
	@ApiField("begin_included")
	private Boolean beginIncluded;

	/**
	 * 结束时间
	 */
	@ApiField("end")
	private Long end;

	/**
	 * 是否包含结束时间
	 */
	@ApiField("end_included")
	private Boolean endIncluded;

	/**
	 * 交易时间段状态
	 */
	@ApiField("state")
	private String state;

	/**
	 * 交易时间状态描述
	 */
	@ApiField("state_desc")
	private String stateDesc;

	public Long getBegin() {
		return this.begin;
	}
	public void setBegin(Long begin) {
		this.begin = begin;
	}

	public Boolean getBeginIncluded() {
		return this.beginIncluded;
	}
	public void setBeginIncluded(Boolean beginIncluded) {
		this.beginIncluded = beginIncluded;
	}

	public Long getEnd() {
		return this.end;
	}
	public void setEnd(Long end) {
		this.end = end;
	}

	public Boolean getEndIncluded() {
		return this.endIncluded;
	}
	public void setEndIncluded(Boolean endIncluded) {
		this.endIncluded = endIncluded;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getStateDesc() {
		return this.stateDesc;
	}
	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}

}
