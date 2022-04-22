package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮pos业务订单结账同步
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:38
 */
public class KoubeiCateringOrderBillApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5168341716653162825L;

	/**
	 * 应收金额
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 账单维度优惠明细，本期识别：
BILL_CHANGE—整单改价；
DISH_CHANGE—单品改价；
MEMBER_DISCOUNT—会员价优惠
	 */
	@ApiListField("discount_details")
	@ApiField("pos_discount_detail")
	private List<PosDiscountDetail> discountDetails;

	/**
	 * 账单菜列表，包含菜品的优免分摊金额（内部优惠+外部优惠）
	 */
	@ApiListField("dish_details")
	@ApiField("kb_pos_bill_dish_detail")
	private List<KbPosBillDishDetail> dishDetails;

	/**
	 * 扩展信息,json对象格式 ,key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否享受会员价
	 */
	@ApiField("member_flag")
	private Boolean memberFlag;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 付款金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 账单支付渠道信息
	 */
	@ApiListField("pay_channels")
	@ApiField("pos_bill_pay_channel")
	private List<PosBillPayChannel> payChannels;

	/**
	 * 就餐人员列表，以英文逗号","分隔
	 */
	@ApiField("people_list")
	private String peopleList;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

	/**
	 * 实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/**
	 * 结账时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("settle_time")
	private Date settleTime;

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public List<PosDiscountDetail> getDiscountDetails() {
		return this.discountDetails;
	}
	public void setDiscountDetails(List<PosDiscountDetail> discountDetails) {
		this.discountDetails = discountDetails;
	}

	public List<KbPosBillDishDetail> getDishDetails() {
		return this.dishDetails;
	}
	public void setDishDetails(List<KbPosBillDishDetail> dishDetails) {
		this.dishDetails = dishDetails;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Boolean getMemberFlag() {
		return this.memberFlag;
	}
	public void setMemberFlag(Boolean memberFlag) {
		this.memberFlag = memberFlag;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public List<PosBillPayChannel> getPayChannels() {
		return this.payChannels;
	}
	public void setPayChannels(List<PosBillPayChannel> payChannels) {
		this.payChannels = payChannels;
	}

	public String getPeopleList() {
		return this.peopleList;
	}
	public void setPeopleList(String peopleList) {
		this.peopleList = peopleList;
	}

	public PosOrderKey getPosOrderKey() {
		return this.posOrderKey;
	}
	public void setPosOrderKey(PosOrderKey posOrderKey) {
		this.posOrderKey = posOrderKey;
	}

	public String getReceiptAmount() {
		return this.receiptAmount;
	}
	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public Date getSettleTime() {
		return this.settleTime;
	}
	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}

}
