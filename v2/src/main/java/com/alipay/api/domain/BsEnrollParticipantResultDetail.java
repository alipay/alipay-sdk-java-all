package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报名对象结果拓展信息
 *
 * @author auto create
 * @since 1.0, 2026-01-22 20:52:12
 */
public class BsEnrollParticipantResultDetail extends AlipayObject {

	private static final long serialVersionUID = 5385377986148216334L;

	/**
	 * 数字化门店id，仅当报名对象类型为SN，且方案类型为UTC时会返回
	 */
	@ApiField("digital_poi_id")
	private String digitalPoiId;

	/**
	 * 仅当报名对象类型为SN，且方案类型为UTC时会返回
	 */
	@ApiField("digital_poi_name")
	private String digitalPoiName;

	/**
	 * 返回报名对象的门店相关信息
	 */
	@ApiField("store_address")
	private BsEnrollParticipantAddress storeAddress;

	public String getDigitalPoiId() {
		return this.digitalPoiId;
	}
	public void setDigitalPoiId(String digitalPoiId) {
		this.digitalPoiId = digitalPoiId;
	}

	public String getDigitalPoiName() {
		return this.digitalPoiName;
	}
	public void setDigitalPoiName(String digitalPoiName) {
		this.digitalPoiName = digitalPoiName;
	}

	public BsEnrollParticipantAddress getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(BsEnrollParticipantAddress storeAddress) {
		this.storeAddress = storeAddress;
	}

}
