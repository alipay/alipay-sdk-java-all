package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授信记录申请查询
 *
 * @author auto create
 * @since 1.0, 2024-01-29 11:13:32
 */
public class AlipayTradeCreditApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6238413846365414216L;

	/**
	 * 本次授信拆分申请时的被授信方授信来源
	 */
	@ApiField("buyer_credit_source")
	private String buyerCreditSource;

	/**
	 * 本次授信拆分申请时的被授信方的userId
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 标识本次授信拆分的业务场景，具体的值由支付宝定义
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 本次授信拆分的操作单号
	 */
	@ApiField("grant_operation_no")
	private String grantOperationNo;

	/**
	 * 本次授信拆分申请时的外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getBuyerCreditSource() {
		return this.buyerCreditSource;
	}
	public void setBuyerCreditSource(String buyerCreditSource) {
		this.buyerCreditSource = buyerCreditSource;
	}

	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getCreditScene() {
		return this.creditScene;
	}
	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}

	public String getGrantOperationNo() {
		return this.grantOperationNo;
	}
	public void setGrantOperationNo(String grantOperationNo) {
		this.grantOperationNo = grantOperationNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
