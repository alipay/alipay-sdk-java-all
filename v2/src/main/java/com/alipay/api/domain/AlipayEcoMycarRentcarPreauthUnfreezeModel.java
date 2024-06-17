package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车预授权解冻
 *
 * @author auto create
 * @since 1.0, 2024-01-12 15:58:17
 */
public class AlipayEcoMycarRentcarPreauthUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 7886776693179915726L;

	/**
	 * 解冻资金类型
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 支付宝用户开放平台id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部请求号，即商户请求车生活进行预授权资金解冻的流水号，车生活侧通过此字段进行幂等
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 解冻金额，单位分
	 */
	@ApiField("unfreeze_amount")
	private Long unfreezeAmount;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Long getUnfreezeAmount() {
		return this.unfreezeAmount;
	}
	public void setUnfreezeAmount(Long unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
