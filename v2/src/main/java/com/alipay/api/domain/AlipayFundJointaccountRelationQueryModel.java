package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共同账户关系查询
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:18:40
 */
public class AlipayFundJointaccountRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7451625148765453475L;

	/**
	 * 账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 产品码下的业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 关系绑定的唯一单号，查询绑定关系方式一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务场景标识JOINT_ACCOUNT
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 为true代表需要查询基于该关系的支付信息（是否锁定等），不填默认false
	 */
	@ApiField("query_payment")
	private Boolean queryPayment;

	/**
	 * 关系绑定id，查询关系方式二
	 */
	@ApiField("relation_id")
	private String relationId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("request_open_id")
	private String requestOpenId;

	/**
	 * （操作人）支付宝侧用户唯一标识
	 */
	@ApiField("request_user_id")
	private String requestUserId;

	/**
	 * 操作人类型
	 */
	@ApiField("request_user_type")
	private String requestUserType;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Boolean getQueryPayment() {
		return this.queryPayment;
	}
	public void setQueryPayment(Boolean queryPayment) {
		this.queryPayment = queryPayment;
	}

	public String getRelationId() {
		return this.relationId;
	}
	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

	public String getRequestOpenId() {
		return this.requestOpenId;
	}
	public void setRequestOpenId(String requestOpenId) {
		this.requestOpenId = requestOpenId;
	}

	public String getRequestUserId() {
		return this.requestUserId;
	}
	public void setRequestUserId(String requestUserId) {
		this.requestUserId = requestUserId;
	}

	public String getRequestUserType() {
		return this.requestUserType;
	}
	public void setRequestUserType(String requestUserType) {
		this.requestUserType = requestUserType;
	}

}
