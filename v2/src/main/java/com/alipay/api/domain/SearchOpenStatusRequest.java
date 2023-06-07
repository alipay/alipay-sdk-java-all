package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改运营服务的上下架请求入参
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:03:09
 */
public class SearchOpenStatusRequest extends AlipayObject {

	private static final long serialVersionUID = 4358958828657816993L;

	/**
	 * 行为(关闭或开启) on off
	 */
	@ApiField("action")
	private String action;

	/**
	 * 申请单类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 品牌box id
	 */
	@ApiField("box_id")
	private String boxId;

	/**
	 * 关闭原因
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 场景码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getBoxId() {
		return this.boxId;
	}
	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
