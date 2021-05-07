package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询会员信息
 *
 * @author auto create
 * @since 1.0, 2020-12-15 15:13:32
 */
public class AnttechBlockchainDefinCustomerMemberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6894371577221974432L;

	/**
	 * 指定业务线
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * DID, IP_ID, IP_ROLE_ID
	 */
	@ApiField("map_id_type")
	private String mapIdType;

	/**
	 * 映射id
	 */
	@ApiField("map_id_value")
	private String mapIdValue;

	/**
	 * 会员ID
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 会员角色
	 */
	@ApiField("member_role_type")
	private String memberRoleType;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getMapIdType() {
		return this.mapIdType;
	}
	public void setMapIdType(String mapIdType) {
		this.mapIdType = mapIdType;
	}

	public String getMapIdValue() {
		return this.mapIdValue;
	}
	public void setMapIdValue(String mapIdValue) {
		this.mapIdValue = mapIdValue;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberRoleType() {
		return this.memberRoleType;
	}
	public void setMemberRoleType(String memberRoleType) {
		this.memberRoleType = memberRoleType;
	}

}
