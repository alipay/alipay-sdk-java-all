package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流作业平台铺设点变更
 *
 * @author auto create
 * @since 1.0, 2025-04-22 10:47:27
 */
public class AlipayCommerceLogisticsPointWorkModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7387618154177218177L;

	/**
	 * 新的铺设点描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 当前变更的线圈ID。如果该值为空，支付宝会用old_point_id+old_place_id定位到当前变更的点位和铺设点
	 */
	@ApiField("logistics_nfc_id")
	private String logisticsNfcId;

	/**
	 * 变更后的铺设点ID。
在移撤场景下，该值可为空。其它场景下，该值不能为空
	 */
	@ApiField("new_place_id")
	private String newPlaceId;

	/**
	 * 变更后的铺设点名称。
在移撤场景下，该值可为空。其它场景下，该值不能为空
	 */
	@ApiField("new_place_name")
	private String newPlaceName;

	/**
	 * 变更后的点位ID。在移撤场景下，该值可为空。其它场景下，该值不能为空
	 */
	@ApiField("new_point_id")
	private String newPointId;

	/**
	 * 变更后的点位名称。
在移撤场景下，该值可为空。其它场景下，该值不能为空
	 */
	@ApiField("new_point_name")
	private String newPointName;

	/**
	 * 当前铺设点上的线圈状态
	 */
	@ApiField("nfc_status")
	private String nfcStatus;

	/**
	 * 变更前的铺设点ID
	 */
	@ApiField("old_place_id")
	private String oldPlaceId;

	/**
	 * 变更前的点位ID
	 */
	@ApiField("old_point_id")
	private String oldPointId;

	/**
	 * 本此的变更类型
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 变更前的铺设点ID 当前字段已废弃(该参数拼写错误，实际应该是old_place_id，请用old_place_id传参。)
	 */
	@ApiField("out_place_id")
	@Deprecated
	private String outPlaceId;

	/**
	 * 变更后的铺设点地址。
	 */
	@ApiField("work_place_address")
	private BusinessAddress workPlaceAddress;

	/**
	 * 变更后的点位地址。
在撤柜场景下，该值可为空。其它场景下，该值不能为空
	 */
	@ApiField("work_point_address")
	private BusinessAddress workPointAddress;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLogisticsNfcId() {
		return this.logisticsNfcId;
	}
	public void setLogisticsNfcId(String logisticsNfcId) {
		this.logisticsNfcId = logisticsNfcId;
	}

	public String getNewPlaceId() {
		return this.newPlaceId;
	}
	public void setNewPlaceId(String newPlaceId) {
		this.newPlaceId = newPlaceId;
	}

	public String getNewPlaceName() {
		return this.newPlaceName;
	}
	public void setNewPlaceName(String newPlaceName) {
		this.newPlaceName = newPlaceName;
	}

	public String getNewPointId() {
		return this.newPointId;
	}
	public void setNewPointId(String newPointId) {
		this.newPointId = newPointId;
	}

	public String getNewPointName() {
		return this.newPointName;
	}
	public void setNewPointName(String newPointName) {
		this.newPointName = newPointName;
	}

	public String getNfcStatus() {
		return this.nfcStatus;
	}
	public void setNfcStatus(String nfcStatus) {
		this.nfcStatus = nfcStatus;
	}

	public String getOldPlaceId() {
		return this.oldPlaceId;
	}
	public void setOldPlaceId(String oldPlaceId) {
		this.oldPlaceId = oldPlaceId;
	}

	public String getOldPointId() {
		return this.oldPointId;
	}
	public void setOldPointId(String oldPointId) {
		this.oldPointId = oldPointId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getOutPlaceId() {
		return this.outPlaceId;
	}
	public void setOutPlaceId(String outPlaceId) {
		this.outPlaceId = outPlaceId;
	}

	public BusinessAddress getWorkPlaceAddress() {
		return this.workPlaceAddress;
	}
	public void setWorkPlaceAddress(BusinessAddress workPlaceAddress) {
		this.workPlaceAddress = workPlaceAddress;
	}

	public BusinessAddress getWorkPointAddress() {
		return this.workPointAddress;
	}
	public void setWorkPointAddress(BusinessAddress workPointAddress) {
		this.workPointAddress = workPointAddress;
	}

}
