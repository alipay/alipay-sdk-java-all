package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业涉诉公告明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:27:03
 */
public class EpLitigationNoticeInfo extends AlipayObject {

	private static final long serialVersionUID = 3267131651479842515L;

	/**
	 * 正文
	 */
	@ApiField("body")
	private String body;

	/**
	 * 当事人
	 */
	@ApiListField("parties")
	@ApiField("string")
	private List<String> parties;

	/**
	 * 公告时间
	 */
	@ApiField("proclamation_date")
	private String proclamationDate;

	/**
	 * 公告人
	 */
	@ApiField("proclamation_people")
	private String proclamationPeople;

	/**
	 * 公告类型
	 */
	@ApiField("proclamation_type")
	private String proclamationType;

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public List<String> getParties() {
		return this.parties;
	}
	public void setParties(List<String> parties) {
		this.parties = parties;
	}

	public String getProclamationDate() {
		return this.proclamationDate;
	}
	public void setProclamationDate(String proclamationDate) {
		this.proclamationDate = proclamationDate;
	}

	public String getProclamationPeople() {
		return this.proclamationPeople;
	}
	public void setProclamationPeople(String proclamationPeople) {
		this.proclamationPeople = proclamationPeople;
	}

	public String getProclamationType() {
		return this.proclamationType;
	}
	public void setProclamationType(String proclamationType) {
		this.proclamationType = proclamationType;
	}

}
