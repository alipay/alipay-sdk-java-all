package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * SubsidySimpleResponse
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:19:59
 */
public class SubsidySimpleResponse extends AlipayObject {

	private static final long serialVersionUID = 5358823378166474156L;

	/**
	 * 商家自设/大运河等传参类权益详细信息（期数粒度）
	 */
	@ApiListField("activity_subsidy_list")
	@ApiField("activity_subsidy_model")
	private List<ActivitySubsidyModel> activitySubsidyList;

	/**
	 * 商品id
	 */
	@ApiField("good_item_id")
	private String goodItemId;

	/**
	 * 1、贴息支付核销时所需的字段，依赖收银、收单无脑透传
期数粒度贴息支付所需的信息返回淘宝，在用户选择资产+期数都进行匹配 -> 确认交易时透传给主站收单
2、商品信息
	 */
	@ApiField("installment_biz_info")
	private String installmentBizInfo;

	/**
	 * 期数粒度、免息/折扣/商家贴息信息
	 */
	@ApiListField("installment_int_discount_info")
	@ApiField("installment_int_discount_model")
	private List<InstallmentIntDiscountModel> installmentIntDiscountInfo;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 调用结果：resultFlag
错误码：errorCode
错误信息描述：errorMessage
	 */
	@ApiField("result_message")
	private ResultMessage resultMessage;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 分期卡券/活动权益相关信息详情（期数粒度）
	 */
	@ApiListField("voucher_subsidy_list")
	@ApiField("voucher_subsidy_model")
	private List<VoucherSubsidyModel> voucherSubsidyList;

	public List<ActivitySubsidyModel> getActivitySubsidyList() {
		return this.activitySubsidyList;
	}
	public void setActivitySubsidyList(List<ActivitySubsidyModel> activitySubsidyList) {
		this.activitySubsidyList = activitySubsidyList;
	}

	public String getGoodItemId() {
		return this.goodItemId;
	}
	public void setGoodItemId(String goodItemId) {
		this.goodItemId = goodItemId;
	}

	public String getInstallmentBizInfo() {
		return this.installmentBizInfo;
	}
	public void setInstallmentBizInfo(String installmentBizInfo) {
		this.installmentBizInfo = installmentBizInfo;
	}

	public List<InstallmentIntDiscountModel> getInstallmentIntDiscountInfo() {
		return this.installmentIntDiscountInfo;
	}
	public void setInstallmentIntDiscountInfo(List<InstallmentIntDiscountModel> installmentIntDiscountInfo) {
		this.installmentIntDiscountInfo = installmentIntDiscountInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public ResultMessage getResultMessage() {
		return this.resultMessage;
	}
	public void setResultMessage(ResultMessage resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<VoucherSubsidyModel> getVoucherSubsidyList() {
		return this.voucherSubsidyList;
	}
	public void setVoucherSubsidyList(List<VoucherSubsidyModel> voucherSubsidyList) {
		this.voucherSubsidyList = voucherSubsidyList;
	}

}
