package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链金融-预付申请单取消
 *
 * @author auto create
 * @since 1.0, 2023-08-10 10:21:27
 */
public class MybankCreditSupplychainPrepaymentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1174437867934599667L;

	/**
	 * 买家身份信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 预付申请单编号，由调用创建预付申请时自动分配。
	 */
	@ApiField("prepay_apply_no")
	private String prepayApplyNo;

	/**
	 * 接口幂等字段，相同requestId请求系统默认认为是相同的请求。此处requestId要求的格式为"{机构IpRoleId}_{机构生成的唯一请求ID}"。
	 */
	@ApiField("request_id")
	private String requestId;

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getPrepayApplyNo() {
		return this.prepayApplyNo;
	}
	public void setPrepayApplyNo(String prepayApplyNo) {
		this.prepayApplyNo = prepayApplyNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
