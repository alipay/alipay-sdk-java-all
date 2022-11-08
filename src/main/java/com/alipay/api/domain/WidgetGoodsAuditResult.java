package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小部件商品审核结果
 *
 * @author auto create
 * @since 1.0, 2022-11-03 19:49:28
 */
public class WidgetGoodsAuditResult extends AlipayObject {

	private static final long serialVersionUID = 7217984714293659637L;

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
	 * 商品ID
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品所属的小程序ID
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
	 * 小部件ID
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

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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
