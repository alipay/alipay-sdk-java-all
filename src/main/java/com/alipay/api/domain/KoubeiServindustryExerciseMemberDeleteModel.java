package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑健身会籍删除
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:29:12
 */
public class KoubeiServindustryExerciseMemberDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2782313542142858526L;

	/**
	 * 口碑的会籍ID
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 外部请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
