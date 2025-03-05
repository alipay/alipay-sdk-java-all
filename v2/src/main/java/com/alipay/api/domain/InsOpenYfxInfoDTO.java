package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运费险详情
 *
 * @author auto create
 * @since 1.0, 2023-02-16 15:39:02
 */
public class InsOpenYfxInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5425684586995844971L;

	/**
	 * 商品图片
	 */
	@ApiField("auction_picture_url")
	private String auctionPictureUrl;

	/**
	 * 商品标题
	 */
	@ApiField("auction_title")
	private String auctionTitle;

	/**
	 * 交易订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 理赔申请时间
	 */
	@ApiField("claim_apply_time")
	private String claimApplyTime;

	/**
	 * 预计赔付时间
	 */
	@ApiField("claim_expect_time")
	private String claimExpectTime;

	/**
	 * 理赔金额
	 */
	@ApiField("claim_fee")
	private String claimFee;

	/**
	 * 理赔收入户
	 */
	@ApiField("claim_in_account")
	private String claimInAccount;

	/**
	 * 理赔单号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 拒赔code
	 */
	@ApiField("claim_refuse_code")
	private String claimRefuseCode;

	/**
	 * 报案单号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 理赔状态
	 */
	@ApiField("claim_status")
	private Long claimStatus;

	/**
	 * 首次理赔申请时间
	 */
	@ApiField("first_claim_apply_time")
	private String firstClaimApplyTime;

	/**
	 * 出单时间
	 */
	@ApiField("issue_time")
	private String issueTime;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_gmt_create")
	private String orderGmtCreate;

	/**
	 * 赔付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保单状态
	 */
	@ApiField("policy_status")
	private Long policyStatus;

	/**
	 * 保费
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 买家退货货物类型
	 */
	@ApiField("refund_goods_type")
	private Long refundGoodsType;

	/**
	 * 退款单号
	 */
	@ApiField("refund_id")
	private String refundId;

	/**
	 * 退货物流单号
	 */
	@ApiField("refund_mail_no")
	private String refundMailNo;

	/**
	 * 退货寄件方式
	 */
	@ApiField("refund_post_type")
	private String refundPostType;

	/**
	 * 退款状态
	 */
	@ApiField("refund_status")
	private Long refundStatus;

	/**
	 * 保额
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	/**
	 * 运费险类型
	 */
	@ApiField("yfx_type")
	private String yfxType;

	public String getAuctionPictureUrl() {
		return this.auctionPictureUrl;
	}
	public void setAuctionPictureUrl(String auctionPictureUrl) {
		this.auctionPictureUrl = auctionPictureUrl;
	}

	public String getAuctionTitle() {
		return this.auctionTitle;
	}
	public void setAuctionTitle(String auctionTitle) {
		this.auctionTitle = auctionTitle;
	}

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getClaimApplyTime() {
		return this.claimApplyTime;
	}
	public void setClaimApplyTime(String claimApplyTime) {
		this.claimApplyTime = claimApplyTime;
	}

	public String getClaimExpectTime() {
		return this.claimExpectTime;
	}
	public void setClaimExpectTime(String claimExpectTime) {
		this.claimExpectTime = claimExpectTime;
	}

	public String getClaimFee() {
		return this.claimFee;
	}
	public void setClaimFee(String claimFee) {
		this.claimFee = claimFee;
	}

	public String getClaimInAccount() {
		return this.claimInAccount;
	}
	public void setClaimInAccount(String claimInAccount) {
		this.claimInAccount = claimInAccount;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getClaimRefuseCode() {
		return this.claimRefuseCode;
	}
	public void setClaimRefuseCode(String claimRefuseCode) {
		this.claimRefuseCode = claimRefuseCode;
	}

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

	public Long getClaimStatus() {
		return this.claimStatus;
	}
	public void setClaimStatus(Long claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getFirstClaimApplyTime() {
		return this.firstClaimApplyTime;
	}
	public void setFirstClaimApplyTime(String firstClaimApplyTime) {
		this.firstClaimApplyTime = firstClaimApplyTime;
	}

	public String getIssueTime() {
		return this.issueTime;
	}
	public void setIssueTime(String issueTime) {
		this.issueTime = issueTime;
	}

	public String getOrderGmtCreate() {
		return this.orderGmtCreate;
	}
	public void setOrderGmtCreate(String orderGmtCreate) {
		this.orderGmtCreate = orderGmtCreate;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public Long getPolicyStatus() {
		return this.policyStatus;
	}
	public void setPolicyStatus(Long policyStatus) {
		this.policyStatus = policyStatus;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public Long getRefundGoodsType() {
		return this.refundGoodsType;
	}
	public void setRefundGoodsType(Long refundGoodsType) {
		this.refundGoodsType = refundGoodsType;
	}

	public String getRefundId() {
		return this.refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getRefundMailNo() {
		return this.refundMailNo;
	}
	public void setRefundMailNo(String refundMailNo) {
		this.refundMailNo = refundMailNo;
	}

	public String getRefundPostType() {
		return this.refundPostType;
	}
	public void setRefundPostType(String refundPostType) {
		this.refundPostType = refundPostType;
	}

	public Long getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(Long refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

	public String getYfxType() {
		return this.yfxType;
	}
	public void setYfxType(String yfxType) {
		this.yfxType = yfxType;
	}

}
