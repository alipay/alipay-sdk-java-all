package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 埋点信息
 *
 * @author auto create
 * @since 1.0, 2026-10-09 15:27:54
 */
public class NfcPointRefreshEventTracking extends AlipayObject {

	private static final long serialVersionUID = 7244274129159529629L;

	/**
	 * 埋点海报氛围
	 */
	@ApiField("atmosphere")
	private String atmosphere;

	/**
	 * 设备业务标识，按设备授权控制可见性
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 当前关联活动标识
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * null
	 */
	@ApiListField("camp_ids")
	@ApiField("string")
	private List<String> campIds;

	/**
	 * 关联活动来源类型
	 */
	@ApiField("camp_type")
	private String campType;

	/**
	 * 埋点海报类型，固定为REDUCE_PROCESS_POSTER
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 命中的海报计划标识
	 */
	@ApiField("scheme_id")
	private String schemeId;

	/**
	 * 海报计划中的设备界面类型，取值随设备型号配置变化
	 */
	@ApiField("ui_type")
	private String uiType;

	public String getAtmosphere() {
		return this.atmosphere;
	}
	public void setAtmosphere(String atmosphere) {
		this.atmosphere = atmosphere;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public List<String> getCampIds() {
		return this.campIds;
	}
	public void setCampIds(List<String> campIds) {
		this.campIds = campIds;
	}

	public String getCampType() {
		return this.campType;
	}
	public void setCampType(String campType) {
		this.campType = campType;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getSchemeId() {
		return this.schemeId;
	}
	public void setSchemeId(String schemeId) {
		this.schemeId = schemeId;
	}

	public String getUiType() {
		return this.uiType;
	}
	public void setUiType(String uiType) {
		this.uiType = uiType;
	}

}
