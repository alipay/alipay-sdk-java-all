package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 免密合并支付
 *
 * @author auto create
 * @since 1.0, 2024-06-26 15:26:18
 */
public class AlipayTradeDeductMergePayModel extends AlipayObject {

	private static final long serialVersionUID = 6235356341937642231L;

	/**
	 * 用户与商户的协议信息
	 */
	@ApiField("agreement_params")
	private AgreementParams agreementParams;

	/**
	 * scene对应的场景值授权码，比如ZMOP12345
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 子订单详情
	 */
	@ApiListField("order_details")
	@ApiField("order_detail")
	private List<OrderDetail> orderDetails;

	/**
	 * 外部合并订单号
	 */
	@ApiField("out_merge_no")
	private String outMergeNo;

	/**
	 * 协议场景信息：比如芝麻先享
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 订单绝对超时时间。 格式为yyyy-MM-dd HH:mm:ss。 注： 1. 如果已经和支付宝约定要求子订单明细必须同时成功同时失败，则不需要填入该字段，默认为15分钟，此场景下如果需要支持自定义超时时间，请联系技术小二。 2. time_expire和timeout_express两者只需传入一个或者都不传，两者均传入时，优先使用time_expire。
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 合并支付订单相对超时时间。从商户合并下单请求时间开始计算。 请求合并的所有订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。 默认值为15d。 注： 1. 如果已经和支付宝约定要求子订单明细必须同时支付成功或者同时支付失败，则不需要填入该字段。 2. time_expire和timeout_express两者只需传入一个或者都不传，两者均传入时，优先使用time_expire。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public AgreementParams getAgreementParams() {
		return this.agreementParams;
	}
	public void setAgreementParams(AgreementParams agreementParams) {
		this.agreementParams = agreementParams;
	}

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public List<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getOutMergeNo() {
		return this.outMergeNo;
	}
	public void setOutMergeNo(String outMergeNo) {
		this.outMergeNo = outMergeNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
