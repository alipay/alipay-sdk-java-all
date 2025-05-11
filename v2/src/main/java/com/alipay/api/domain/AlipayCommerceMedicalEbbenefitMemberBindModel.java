package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭成员绑定解绑受益人
 *
 * @author auto create
 * @since 1.0, 2025-01-08 15:28:31
 */
public class AlipayCommerceMedicalEbbenefitMemberBindModel extends AlipayObject {

	private static final long serialVersionUID = 8163548174849745957L;

	/**
	 * 是否绑定好大夫服务，0：未绑定，1：已绑定
	 */
	@ApiField("binding_hdf_service")
	private String bindingHdfService;

	/**
	 * 会员id
	 */
	@ApiField("eb_user_id")
	private String ebUserId;

	/**
	 * 家庭成员id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 外部家庭成员id
	 */
	@ApiField("out_member_id")
	private String outMemberId;

	/**
	 * 外部自有用户id，无特殊校验
	 */
	@ApiField("out_user_id")
	private String outUserId;

	public String getBindingHdfService() {
		return this.bindingHdfService;
	}
	public void setBindingHdfService(String bindingHdfService) {
		this.bindingHdfService = bindingHdfService;
	}

	public String getEbUserId() {
		return this.ebUserId;
	}
	public void setEbUserId(String ebUserId) {
		this.ebUserId = ebUserId;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOutMemberId() {
		return this.outMemberId;
	}
	public void setOutMemberId(String outMemberId) {
		this.outMemberId = outMemberId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

}
