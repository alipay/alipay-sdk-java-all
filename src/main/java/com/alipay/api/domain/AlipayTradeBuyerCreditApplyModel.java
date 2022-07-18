package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易买家授信申请
 *
 * @author auto create
 * @since 1.0, 2020-07-10 19:40:55
 */
public class AlipayTradeBuyerCreditApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7468734667945121784L;

	/**
	 * 标识买家授信额度的来源
	 */
	@ApiField("buyer_credit_source")
	private String buyerCreditSource;

	/**
	 * 本次授信拆分的买家主体userId
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 卖家给买家分配的信用赊账周期，在账期结束前需要还款完成。取值格式：1m(表示分钟)，2h(表示小时)，3d(表示天)
	 */
	@ApiField("credit_period")
	private String creditPeriod;

	/**
	 * 标识本次授信拆分的业务场景，具体的值由支付宝定义
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 卖家授信拆分给买家的额度

单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("grant_credit_quota")
	private String grantCreditQuota;

	/**
	 * 标识商家授信额度的来源，具体的值由支付宝定义
	 */
	@ApiField("merchant_credit_source")
	private String merchantCreditSource;

	/**
	 * 商家授权开通账期的卖家userid
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 标识授信操作的类型。

CREATE_CREDIT(创建授信)

MODIFY_CREDIT(修改授信)

CLOSE_CREDIT(关闭授信)
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 卖家每次发起授权拆分对应一次外部请求号，用于幂等使用
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 本次操作前未拆分的的授信额度

单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("previous_credit_quota")
	private String previousCreditQuota;

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

	public String getCreditPeriod() {
		return this.creditPeriod;
	}
	public void setCreditPeriod(String creditPeriod) {
		this.creditPeriod = creditPeriod;
	}

	public String getCreditScene() {
		return this.creditScene;
	}
	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}

	public String getGrantCreditQuota() {
		return this.grantCreditQuota;
	}
	public void setGrantCreditQuota(String grantCreditQuota) {
		this.grantCreditQuota = grantCreditQuota;
	}

	public String getMerchantCreditSource() {
		return this.merchantCreditSource;
	}
	public void setMerchantCreditSource(String merchantCreditSource) {
		this.merchantCreditSource = merchantCreditSource;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPreviousCreditQuota() {
		return this.previousCreditQuota;
	}
	public void setPreviousCreditQuota(String previousCreditQuota) {
		this.previousCreditQuota = previousCreditQuota;
	}

}
