package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗先享订单关闭接口
 *
 * @author auto create
 * @since 1.0, 2021-02-25 15:11:56
 */
public class AlipayPcreditHuabeiAuthOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6218855255632993434L;

	/**
	 * 支付宝userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝侧花呗冻结、解冻操作单据id。在原先的冻结或者解冻接口调用中同步返回给商户，或者通过商户通知返回给商户。推荐优先使用本参数。与out_request_no不能同时为空。
	 */
	@ApiField("auth_opt_id")
	private String authOptId;

	/**
	 * 商户自定义的操作员信息，仅作记录用，无实际业务用途。
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商户原先调用冻结、解冻接口传入的请求流水号，与auth_opt_id不能同时为null。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 芝麻GO配置模板Id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAuthOptId() {
		return this.authOptId;
	}
	public void setAuthOptId(String authOptId) {
		this.authOptId = authOptId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
