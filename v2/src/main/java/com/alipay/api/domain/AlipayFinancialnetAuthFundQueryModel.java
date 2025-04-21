package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户账户余额查询
 *
 * @author auto create
 * @since 1.0, 2021-09-02 20:46:42
 */
public class AlipayFinancialnetAuthFundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1493476474242757472L;

	/**
	 * 账户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 银行卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 业务扩展ID，关联外部业务数据ID
	 */
	@ApiField("biz_ext_id")
	private String bizExtId;

	/**
	 * 预留业务扩展字段
	 */
	@ApiField("biz_ext_info")
	private String bizExtInfo;

	/**
	 * 业务扩展类型
	 */
	@ApiField("biz_ext_type")
	private String bizExtType;

	/**
	 * 业务ID
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 协议值
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 手机号
	 */
	@ApiField("mobile_num")
	private String mobileNum;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 查询业务场景大类
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 提交单号-入参指定提交号，则会进行操作校验，用户之前是否有操作流水，Y-返回当前入参指定提交号，N-异常终止
	 */
	@ApiField("submit_no")
	private String submitNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBizExtId() {
		return this.bizExtId;
	}
	public void setBizExtId(String bizExtId) {
		this.bizExtId = bizExtId;
	}

	public String getBizExtInfo() {
		return this.bizExtInfo;
	}
	public void setBizExtInfo(String bizExtInfo) {
		this.bizExtInfo = bizExtInfo;
	}

	public String getBizExtType() {
		return this.bizExtType;
	}
	public void setBizExtType(String bizExtType) {
		this.bizExtType = bizExtType;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getMobileNum() {
		return this.mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSubmitNo() {
		return this.submitNo;
	}
	public void setSubmitNo(String submitNo) {
		this.submitNo = submitNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
