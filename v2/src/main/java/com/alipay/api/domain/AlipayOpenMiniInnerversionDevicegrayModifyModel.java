package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序设备灰度管理
 *
 * @author auto create
 * @since 1.0, 2023-02-14 16:27:09
 */
public class AlipayOpenMiniInnerversionDevicegrayModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7822131782726647681L;

	/**
	 * 操作类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入，申请方式请参见接入手册。
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 设备号列表
	 */
	@ApiListField("device_no_list")
	@ApiField("string")
	private List<String> deviceNoList;

	/**
	 * 灰度规则
	 */
	@ApiField("gray_code")
	private String grayCode;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public List<String> getDeviceNoList() {
		return this.deviceNoList;
	}
	public void setDeviceNoList(List<String> deviceNoList) {
		this.deviceNoList = deviceNoList;
	}

	public String getGrayCode() {
		return this.grayCode;
	}
	public void setGrayCode(String grayCode) {
		this.grayCode = grayCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
