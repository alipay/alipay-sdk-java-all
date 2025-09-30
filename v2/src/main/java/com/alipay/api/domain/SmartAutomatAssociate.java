package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助售卖机合作伙伴信息
 *
 * @author auto create
 * @since 1.0, 2018-06-22 15:45:40
 */
public class SmartAutomatAssociate extends AlipayObject {

	private static final long serialVersionUID = 1846398251882236275L;

	/**
	 * 合作伙伴类型
DISTRIBUTORS:渠道商
	 */
	@ApiField("associate_type")
	private String associateType;

	/**
	 * 合作伙伴的支付宝账号ID
	 */
	@ApiField("associate_user_id")
	private String associateUserId;

	public String getAssociateType() {
		return this.associateType;
	}
	public void setAssociateType(String associateType) {
		this.associateType = associateType;
	}

	public String getAssociateUserId() {
		return this.associateUserId;
	}
	public void setAssociateUserId(String associateUserId) {
		this.associateUserId = associateUserId;
	}

}
