package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝代运营商业关系物理门店资产开放模型摘要信息
 *
 * @author auto create
 * @since 1.0, 2023-03-15 16:44:13
 */
public class BusinessRelationShopMemberDigest extends AlipayObject {

	private static final long serialVersionUID = 3113381636619463359L;

	/**
	 * 资产收录时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 商业关系物理门店资产成员编号
	 */
	@ApiField("member_id")
	private String memberId;

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

}
