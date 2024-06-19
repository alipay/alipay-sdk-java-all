package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝订单租车费用信息
 *
 * @author auto create
 * @since 1.0, 2024-06-05 16:41:25
 */
public class RentCarOrderFeeInfo extends AlipayObject {

	private static final long serialVersionUID = 7357264714169888486L;

	/**
	 * 基础保障服务费，车生活向商户查询报价时不需要传此此字段；车生活请求商户下单时会传此字段
	 */
	@ApiField("basic_guarantee_fee")
	private RentCarFeeItem basicGuaranteeFee;

	/**
	 * 用户还车时，门店工作人员上门服务的费用
	 */
	@ApiField("home_return_fee")
	private RentCarFeeItem homeReturnFee;

	/**
	 * 上门送车费
	 */
	@ApiField("home_send_fee")
	private RentCarFeeItem homeSendFee;

	/**
	 * 更多保障服务费，车生活向商户查询报价时不需要传此字段；若用户选择了更多保障，则车生活请求商户下单时会传此字段
	 */
	@ApiField("more_guarantee_service_fee")
	private RentCarFeeItem moreGuaranteeServiceFee;

	/**
	 * 夜间还车费
	 */
	@ApiField("nigh_return_fee")
	private RentCarFeeItem nighReturnFee;

	/**
	 * 夜间送车费
	 */
	@ApiField("night_send_fee")
	private RentCarFeeItem nightSendFee;

	/**
	 * 其他费用列表
	 */
	@ApiListField("other_fee_list")
	@ApiField("rent_car_fee_item")
	private List<RentCarFeeItem> otherFeeList;

	/**
	 * 租金费用总价
	 */
	@ApiField("rent_fee")
	private RentCarFeeItem rentFee;

	/**
	 * 门店服务费
	 */
	@ApiField("store_service_fee")
	private RentCarFeeItem storeServiceFee;

	/**
	 * 增值服务费
	 */
	@ApiListField("value_added_service_fee")
	@ApiField("rent_car_fee_item")
	private List<RentCarFeeItem> valueAddedServiceFee;

	public RentCarFeeItem getBasicGuaranteeFee() {
		return this.basicGuaranteeFee;
	}
	public void setBasicGuaranteeFee(RentCarFeeItem basicGuaranteeFee) {
		this.basicGuaranteeFee = basicGuaranteeFee;
	}

	public RentCarFeeItem getHomeReturnFee() {
		return this.homeReturnFee;
	}
	public void setHomeReturnFee(RentCarFeeItem homeReturnFee) {
		this.homeReturnFee = homeReturnFee;
	}

	public RentCarFeeItem getHomeSendFee() {
		return this.homeSendFee;
	}
	public void setHomeSendFee(RentCarFeeItem homeSendFee) {
		this.homeSendFee = homeSendFee;
	}

	public RentCarFeeItem getMoreGuaranteeServiceFee() {
		return this.moreGuaranteeServiceFee;
	}
	public void setMoreGuaranteeServiceFee(RentCarFeeItem moreGuaranteeServiceFee) {
		this.moreGuaranteeServiceFee = moreGuaranteeServiceFee;
	}

	public RentCarFeeItem getNighReturnFee() {
		return this.nighReturnFee;
	}
	public void setNighReturnFee(RentCarFeeItem nighReturnFee) {
		this.nighReturnFee = nighReturnFee;
	}

	public RentCarFeeItem getNightSendFee() {
		return this.nightSendFee;
	}
	public void setNightSendFee(RentCarFeeItem nightSendFee) {
		this.nightSendFee = nightSendFee;
	}

	public List<RentCarFeeItem> getOtherFeeList() {
		return this.otherFeeList;
	}
	public void setOtherFeeList(List<RentCarFeeItem> otherFeeList) {
		this.otherFeeList = otherFeeList;
	}

	public RentCarFeeItem getRentFee() {
		return this.rentFee;
	}
	public void setRentFee(RentCarFeeItem rentFee) {
		this.rentFee = rentFee;
	}

	public RentCarFeeItem getStoreServiceFee() {
		return this.storeServiceFee;
	}
	public void setStoreServiceFee(RentCarFeeItem storeServiceFee) {
		this.storeServiceFee = storeServiceFee;
	}

	public List<RentCarFeeItem> getValueAddedServiceFee() {
		return this.valueAddedServiceFee;
	}
	public void setValueAddedServiceFee(List<RentCarFeeItem> valueAddedServiceFee) {
		this.valueAddedServiceFee = valueAddedServiceFee;
	}

}
