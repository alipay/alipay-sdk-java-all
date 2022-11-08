package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付付方还款信息咨询
 *
 * @author auto create
 * @since 1.0, 2022-02-09 10:51:43
 */
public class MybankCreditLoantradePayerBillrepayConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8559636341795967192L;

	/**
	 * 指定账单号，为空查询所有账单
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务场景，由网商端指定
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 子场景，可空
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	/**
	 * 用户信息，必填
	 */
	@ApiField("user_info")
	private CreditPayUserVO userInfo;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

	public CreditPayUserVO getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(CreditPayUserVO userInfo) {
		this.userInfo = userInfo;
	}

}
