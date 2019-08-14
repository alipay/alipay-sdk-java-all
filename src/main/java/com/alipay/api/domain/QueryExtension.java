package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询个性化扩展区返回对象
 *
 * @author auto create
 * @since 1.0, 2017-06-01 11:26:41
 */
public class QueryExtension extends AlipayObject {

	private static final long serialVersionUID = 5442154726892794674L;

	/**
	 * 扩展区列表
	 */
	@ApiListField("areas")
	@ApiField("extension_area")
	private List<ExtensionArea> areas;

	/**
	 * 扩展区套id
	 */
	@ApiField("extension_key")
	private String extensionKey;

	/**
	 * 标签规则列表
	 */
	@ApiListField("label_rules")
	@ApiField("query_label_rule")
	private List<QueryLabelRule> labelRules;

	/**
	 * 扩展区状态，"ON"代表上线，"OFF"代表下线，只有上线的扩展区才能被用户看到
	 */
	@ApiField("status")
	private String status;

	public List<ExtensionArea> getAreas() {
		return this.areas;
	}
	public void setAreas(List<ExtensionArea> areas) {
		this.areas = areas;
	}

	public String getExtensionKey() {
		return this.extensionKey;
	}
	public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}

	public List<QueryLabelRule> getLabelRules() {
		return this.labelRules;
	}
	public void setLabelRules(List<QueryLabelRule> labelRules) {
		this.labelRules = labelRules;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
