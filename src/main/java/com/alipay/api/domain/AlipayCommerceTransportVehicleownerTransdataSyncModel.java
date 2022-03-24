package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车服数据迁移
 *
 * @author auto create
 * @since 1.0, 2020-05-27 19:58:12
 */
public class AlipayCommerceTransportVehicleownerTransdataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8726194815296349692L;

	/**
	 * 同步操作类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 同步数据
	 */
	@ApiField("trans_data")
	private String transData;

	/**
	 * 支付宝uid
	 */
	@ApiField("uid")
	private String uid;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getTransData() {
		return this.transData;
	}
	public void setTransData(String transData) {
		this.transData = transData;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
