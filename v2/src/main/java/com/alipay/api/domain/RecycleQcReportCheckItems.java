package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-02-26 10:41:39
 */
public class RecycleQcReportCheckItems extends AlipayObject {

	private static final long serialVersionUID = 5794394434854934428L;

	/**
	 * 质检属性名
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("recycle_qc_report_check_item")
	private List<RecycleQcReportCheckItem> items;

	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public List<RecycleQcReportCheckItem> getItems() {
		return this.items;
	}
	public void setItems(List<RecycleQcReportCheckItem> items) {
		this.items = items;
	}

}
