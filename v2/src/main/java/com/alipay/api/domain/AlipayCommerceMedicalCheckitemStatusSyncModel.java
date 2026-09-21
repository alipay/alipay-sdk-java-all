package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 检查项维度状态同步
 *
 * @author auto create
 * @since 1.0, 2026-09-20 15:12:51
 */
public class AlipayCommerceMedicalCheckitemStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2538252721515322579L;

	/**
	 * null
	 */
	@ApiListField("check_item_data_list")
	@ApiField("check_order_data")
	private List<CheckOrderData> checkItemDataList;

	/**
	 * 履约单号
	 */
	@ApiField("fulfillment_no")
	private String fulfillmentNo;

	/**
	 * 履约单号 当前字段已废弃(履约单号字段英文名有修改)
	 */
	@ApiField("fulfillment_on")
	@Deprecated
	private String fulfillmentOn;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 履约类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 2088用户UID
	 */
	@ApiField("user_id")
	private String userId;

	public List<CheckOrderData> getCheckItemDataList() {
		return this.checkItemDataList;
	}
	public void setCheckItemDataList(List<CheckOrderData> checkItemDataList) {
		this.checkItemDataList = checkItemDataList;
	}

	public String getFulfillmentNo() {
		return this.fulfillmentNo;
	}
	public void setFulfillmentNo(String fulfillmentNo) {
		this.fulfillmentNo = fulfillmentNo;
	}

	public String getFulfillmentOn() {
		return this.fulfillmentOn;
	}
	public void setFulfillmentOn(String fulfillmentOn) {
		this.fulfillmentOn = fulfillmentOn;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
