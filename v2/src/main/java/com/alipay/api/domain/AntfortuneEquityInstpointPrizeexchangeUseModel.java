package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构积分兑换奖品
 *
 * @author auto create
 * @since 1.0, 2023-01-04 13:51:30
 */
public class AntfortuneEquityInstpointPrizeexchangeUseModel extends AlipayObject {

	private static final long serialVersionUID = 7296887875785952615L;

	/**
	 * 手机号码，1864234324324。实物奖品兑换时本字段必填
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号，同个商户下相同订单号会幂等返回结果。比如：改订单已成功处理，则幂等返回成功；订单处理失败则幂等返回失败
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 兑换的奖品编号，可在财富开放平台配置上架积分奖品后获得
	 */
	@ApiField("prize_no")
	private String prizeNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrizeNo() {
		return this.prizeNo;
	}
	public void setPrizeNo(String prizeNo) {
		this.prizeNo = prizeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
