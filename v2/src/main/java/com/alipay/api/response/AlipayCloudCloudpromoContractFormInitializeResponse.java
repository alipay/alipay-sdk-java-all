package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentContractDictVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.contract.form.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:49:32
 */
public class AlipayCloudCloudpromoContractFormInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8686512637889768315L;

	/** 
	 * 最早起租时间(单位 天)
	 */
	@ApiField("earliest_start_time")
	private Long earliestStartTime;

	/** 
	 * 预设的房屋设备列表
	 */
	@ApiListField("furniture_list")
	@ApiField("string")
	private List<String> furnitureList;

	/** 
	 * 最晚起租时间(单位 天)
	 */
	@ApiField("latest_start_time")
	private Long latestStartTime;

	/** 
	 * 最大押金金额 单位：元
	 */
	@ApiField("maximum_deposit_amount")
	private String maximumDepositAmount;

	/** 
	 * 最大租金金额 单位元
	 */
	@ApiField("maximum_rent_amount")
	private String maximumRentAmount;

	/** 
	 * 最大租期（单位月份）
	 */
	@ApiField("maximum_rent_period")
	private Long maximumRentPeriod;

	/** 
	 * 支付周期类型
	 */
	@ApiListField("pay_period_type_list")
	@ApiField("rent_contract_dict_vo")
	private List<RentContractDictVo> payPeriodTypeList;

	/** 
	 * 出租方式
	 */
	@ApiListField("room_type_list")
	@ApiField("rent_contract_dict_vo")
	private List<RentContractDictVo> roomTypeList;

	public void setEarliestStartTime(Long earliestStartTime) {
		this.earliestStartTime = earliestStartTime;
	}
	public Long getEarliestStartTime( ) {
		return this.earliestStartTime;
	}

	public void setFurnitureList(List<String> furnitureList) {
		this.furnitureList = furnitureList;
	}
	public List<String> getFurnitureList( ) {
		return this.furnitureList;
	}

	public void setLatestStartTime(Long latestStartTime) {
		this.latestStartTime = latestStartTime;
	}
	public Long getLatestStartTime( ) {
		return this.latestStartTime;
	}

	public void setMaximumDepositAmount(String maximumDepositAmount) {
		this.maximumDepositAmount = maximumDepositAmount;
	}
	public String getMaximumDepositAmount( ) {
		return this.maximumDepositAmount;
	}

	public void setMaximumRentAmount(String maximumRentAmount) {
		this.maximumRentAmount = maximumRentAmount;
	}
	public String getMaximumRentAmount( ) {
		return this.maximumRentAmount;
	}

	public void setMaximumRentPeriod(Long maximumRentPeriod) {
		this.maximumRentPeriod = maximumRentPeriod;
	}
	public Long getMaximumRentPeriod( ) {
		return this.maximumRentPeriod;
	}

	public void setPayPeriodTypeList(List<RentContractDictVo> payPeriodTypeList) {
		this.payPeriodTypeList = payPeriodTypeList;
	}
	public List<RentContractDictVo> getPayPeriodTypeList( ) {
		return this.payPeriodTypeList;
	}

	public void setRoomTypeList(List<RentContractDictVo> roomTypeList) {
		this.roomTypeList = roomTypeList;
	}
	public List<RentContractDictVo> getRoomTypeList( ) {
		return this.roomTypeList;
	}

}
