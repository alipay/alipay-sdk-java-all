package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系门店收单信息
 *
 * @author auto create
 * @since 1.0, 2022-08-08 17:17:24
 */
public class ShopMemberInfo extends AlipayObject {

	private static final long serialVersionUID = 5667388297351565199L;

	/**
	 * 商业关系中的门店收单
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 商业关系中的门店收单类型,如：PID/SMID
	 */
	@ApiField("member_type")
	private String memberType;

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberType() {
		return this.memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

}
