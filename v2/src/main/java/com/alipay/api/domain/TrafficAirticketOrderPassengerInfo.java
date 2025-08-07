package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出行机票订单数据同步-乘机人信息
 *
 * @author auto create
 * @since 1.0, 2025-07-01 17:35:43
 */
public class TrafficAirticketOrderPassengerInfo extends AlipayObject {

	private static final long serialVersionUID = 8622281315738158998L;

	/**
	 * 证件号，与证件类型cert_type对应的号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 辅营商品信息
	 */
	@ApiListField("commodity_info_list")
	@ApiField("traffic_airticket_order_commodity_info")
	private List<TrafficAirticketOrderCommodityInfo> commodityInfoList;

	/**
	 * 乘机人手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 乘机人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户的唯一标识，由商户侧生成
	 */
	@ApiField("passenger_uuid")
	private String passengerUuid;

	/**
	 * 是否本人，该乘机人是否为订单的下单人
1. true-该乘机人是订单的下单人
2. false-该乘机人不是订单的下单人
	 */
	@ApiField("self")
	private Boolean self;

	/**
	 * 航程信息
	 */
	@ApiListField("voyage_info_list")
	@ApiField("traffic_airticket_order_voyage_info")
	private List<TrafficAirticketOrderVoyageInfo> voyageInfoList;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public List<TrafficAirticketOrderCommodityInfo> getCommodityInfoList() {
		return this.commodityInfoList;
	}
	public void setCommodityInfoList(List<TrafficAirticketOrderCommodityInfo> commodityInfoList) {
		this.commodityInfoList = commodityInfoList;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPassengerUuid() {
		return this.passengerUuid;
	}
	public void setPassengerUuid(String passengerUuid) {
		this.passengerUuid = passengerUuid;
	}

	public Boolean getSelf() {
		return this.self;
	}
	public void setSelf(Boolean self) {
		this.self = self;
	}

	public List<TrafficAirticketOrderVoyageInfo> getVoyageInfoList() {
		return this.voyageInfoList;
	}
	public void setVoyageInfoList(List<TrafficAirticketOrderVoyageInfo> voyageInfoList) {
		this.voyageInfoList = voyageInfoList;
	}

}
