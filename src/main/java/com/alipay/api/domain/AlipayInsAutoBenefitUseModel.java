package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 00-I-车险权益使用信息同步
 *
 * @author auto create
 * @since 1.0, 2020-01-08 19:54:52
 */
public class AlipayInsAutoBenefitUseModel extends AlipayObject {

	private static final long serialVersionUID = 6858687233661218587L;

	/**
	 * 支付宝定义的权益编码
	 */
	@ApiField("benefit_code")
	private String benefitCode;

	/**
	 * ISV本次使用记录的业务单号，幂等字段
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 权益使用详情
	 */
	@ApiField("use_detail")
	private UseDetail useDetail;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBenefitCode() {
		return this.benefitCode;
	}
	public void setBenefitCode(String benefitCode) {
		this.benefitCode = benefitCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public UseDetail getUseDetail() {
		return this.useDetail;
	}
	public void setUseDetail(UseDetail useDetail) {
		this.useDetail = useDetail;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
