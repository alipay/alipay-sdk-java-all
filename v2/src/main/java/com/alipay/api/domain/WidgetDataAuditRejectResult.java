package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 橱窗数据审核拒绝结果
 *
 * @author auto create
 * @since 1.0, 2022-11-15 20:37:00
 */
public class WidgetDataAuditRejectResult extends AlipayObject {

	private static final long serialVersionUID = 8711553413594651514L;

	/**
	 * 审核的备注
	 */
	@ApiField("audit_memo")
	private String auditMemo;

	/**
	 * 审核结果，PASS:审核通过，REJECT:审核驳回
	 */
	@ApiField("audit_result")
	private String auditResult;

	/**
	 * 数据ID
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 审核不通过的相关属性
	 */
	@ApiListField("reject_field_list")
	@ApiField("string")
	private List<String> rejectFieldList;

	/**
	 * 小程序橱窗ID
	 */
	@ApiField("widget_id")
	private String widgetId;

	public String getAuditMemo() {
		return this.auditMemo;
	}
	public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}

	public String getAuditResult() {
		return this.auditResult;
	}
	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public List<String> getRejectFieldList() {
		return this.rejectFieldList;
	}
	public void setRejectFieldList(List<String> rejectFieldList) {
		this.rejectFieldList = rejectFieldList;
	}

	public String getWidgetId() {
		return this.widgetId;
	}
	public void setWidgetId(String widgetId) {
		this.widgetId = widgetId;
	}

}
