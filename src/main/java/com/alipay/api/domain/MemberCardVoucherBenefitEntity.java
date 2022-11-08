package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员券权益实例
 *
 * @author auto create
 * @since 1.0, 2022-04-20 11:52:41
 */
public class MemberCardVoucherBenefitEntity extends AlipayObject {

	private static final long serialVersionUID = 3738653341582571898L;

	/**
	 * 发放失败的原因列表
	 */
	@ApiListField("fail_reason_list")
	@ApiField("string")
	private List<String> failReasonList;

	/**
	 * 发放成功的券ID列表
	 */
	@ApiListField("success_voucher_list")
	@ApiField("string")
	private List<String> successVoucherList;

	/**
	 * 券活动ID
	 */
	@ApiField("voucher_activity_id")
	private String voucherActivityId;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public List<String> getFailReasonList() {
		return this.failReasonList;
	}
	public void setFailReasonList(List<String> failReasonList) {
		this.failReasonList = failReasonList;
	}

	public List<String> getSuccessVoucherList() {
		return this.successVoucherList;
	}
	public void setSuccessVoucherList(List<String> successVoucherList) {
		this.successVoucherList = successVoucherList;
	}

	public String getVoucherActivityId() {
		return this.voucherActivityId;
	}
	public void setVoucherActivityId(String voucherActivityId) {
		this.voucherActivityId = voucherActivityId;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
