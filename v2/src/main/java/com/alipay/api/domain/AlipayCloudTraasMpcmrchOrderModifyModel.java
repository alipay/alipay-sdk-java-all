package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云租赁订单同步
 *
 * @author auto create
 * @since 1.0, 2025-03-28 15:21:55
 */
public class AlipayCloudTraasMpcmrchOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1274621216845519879L;

	/**
	 * 客户详情
	 */
	@ApiField("customer_detail")
	private RentCustomerDetail customerDetail;

	/**
	 * 鉴权的主体id，可以是手机号也可以是用户的身份证号等信息
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 风险校验的原子单位，可以是身份证号也可以是手机号等信息
	 */
	@ApiField("customer_type")
	private String customerType;

	/**
	 * 配送详情
	 */
	@ApiField("delivery_detail")
	private RentDeliveryDetail deliveryDetail;

	/**
	 * 商品详情
	 */
	@ApiField("item_detail")
	private RentItemDetail itemDetail;

	/**
	 * 租赁的人工风控信息
	 */
	@ApiField("manual_risk_detail")
	private RentManualRiskDetail manualRiskDetail;

	/**
	 * 当前订单的创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 商户自身生成的订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 逾期的信息
	 */
	@ApiField("overdue_detail")
	private OverdueDetail overdueDetail;

	/**
	 * 租赁不同阶段的风控信息
	 */
	@ApiListField("phase_risk_details")
	@ApiField("auto_rent_phase_risk_detail")
	private List<AutoRentPhaseRiskDetail> phaseRiskDetails;

	/**
	 * 价格详情
	 */
	@ApiField("price_detail")
	private RentPriceDetail priceDetail;

	/**
	 * 订单的来源渠道。
支付宝:ALIPAY
微信:WECHAT
抖音:TIKTOK
美团:MEITUAN
饿了么:ELEME
其他:OTHERS
	 */
	@ApiField("source")
	private String source;

	/**
	 * 订单的状态同步
	 */
	@ApiField("status")
	private String status;

	public RentCustomerDetail getCustomerDetail() {
		return this.customerDetail;
	}
	public void setCustomerDetail(RentCustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerType() {
		return this.customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public RentDeliveryDetail getDeliveryDetail() {
		return this.deliveryDetail;
	}
	public void setDeliveryDetail(RentDeliveryDetail deliveryDetail) {
		this.deliveryDetail = deliveryDetail;
	}

	public RentItemDetail getItemDetail() {
		return this.itemDetail;
	}
	public void setItemDetail(RentItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	public RentManualRiskDetail getManualRiskDetail() {
		return this.manualRiskDetail;
	}
	public void setManualRiskDetail(RentManualRiskDetail manualRiskDetail) {
		this.manualRiskDetail = manualRiskDetail;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public OverdueDetail getOverdueDetail() {
		return this.overdueDetail;
	}
	public void setOverdueDetail(OverdueDetail overdueDetail) {
		this.overdueDetail = overdueDetail;
	}

	public List<AutoRentPhaseRiskDetail> getPhaseRiskDetails() {
		return this.phaseRiskDetails;
	}
	public void setPhaseRiskDetails(List<AutoRentPhaseRiskDetail> phaseRiskDetails) {
		this.phaseRiskDetails = phaseRiskDetails;
	}

	public RentPriceDetail getPriceDetail() {
		return this.priceDetail;
	}
	public void setPriceDetail(RentPriceDetail priceDetail) {
		this.priceDetail = priceDetail;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
