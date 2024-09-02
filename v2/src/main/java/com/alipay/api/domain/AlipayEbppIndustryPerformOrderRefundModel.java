package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约单退款
 *
 * @author auto create
 * @since 1.0, 2024-05-07 11:16:34
 */
public class AlipayEbppIndustryPerformOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 3894424399763997534L;

	/**
	 * 行业业务订单号，即通过行业受理平台创建的业务单据
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 是否间联商户(是间联传Y,其他可不填)
非签约pid调用时必传Y(默认N)
	 */
	@ApiField("is_sub_merchant")
	private String isSubMerchant;

	/**
	 * 商户外部唯一订单号,billNo或tradeNo为空时必填
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 设置此参数进行退分账，只对直付通模式-部分退分账场景生效。全额退款默认全额退分账，不用单独设置该字段。
	 */
	@ApiListField("profit_sharing_list")
	@ApiField("profit_sharing")
	private List<ProfitSharing> profitSharingList;

	/**
	 * 退款原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 需要退款的金额，该金额不能大于订单金额，支持两位小数。默认不传则全额退款(推荐)。
	 */
	@ApiField("refund_money")
	private String refundMoney;

	/**
	 * 默认异步退款
	 */
	@ApiField("refund_scene")
	private String refundScene;

	/**
	 * 部分退款商家请求号,部分退款必传
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getIsSubMerchant() {
		return this.isSubMerchant;
	}
	public void setIsSubMerchant(String isSubMerchant) {
		this.isSubMerchant = isSubMerchant;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	public List<ProfitSharing> getProfitSharingList() {
		return this.profitSharingList;
	}
	public void setProfitSharingList(List<ProfitSharing> profitSharingList) {
		this.profitSharingList = profitSharingList;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRefundMoney() {
		return this.refundMoney;
	}
	public void setRefundMoney(String refundMoney) {
		this.refundMoney = refundMoney;
	}

	public String getRefundScene() {
		return this.refundScene;
	}
	public void setRefundScene(String refundScene) {
		this.refundScene = refundScene;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
