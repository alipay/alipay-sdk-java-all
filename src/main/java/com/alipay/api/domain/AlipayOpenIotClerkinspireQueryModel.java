package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收银员激励活动信息查询接口
 *
 * @author auto create
 * @since 1.0, 2021-11-26 13:42:52
 */
public class AlipayOpenIotClerkinspireQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6151266249815828567L;

	/**
	 * 设备biztid
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备物料ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * IoT设备供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
