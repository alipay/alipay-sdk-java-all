package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑健身会籍修改
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:29:19
 */
public class KoubeiServindustryExerciseMemberModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3815663886291347282L;

	/**
	 * 会籍的到期时间 注：name与会籍的到期时间两个可选字段至少传一个
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 口碑的会籍id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 会籍名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
