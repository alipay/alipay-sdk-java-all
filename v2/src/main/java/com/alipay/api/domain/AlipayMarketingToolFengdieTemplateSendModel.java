package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分配云凤蝶站点模板
 *
 * @author auto create
 * @since 1.0, 2021-06-25 21:54:43
 */
public class AlipayMarketingToolFengdieTemplateSendModel extends AlipayObject {

	private static final long serialVersionUID = 7783115528247786145L;

	/**
	 * 企业 VIP 用户的ID（以 2088 开头的ID）
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 欲分配站点模板的空间业务 ID 列表
	 */
	@ApiListField("space_ids")
	@ApiField("string")
	private List<String> spaceIds;

	/**
	 * 欲分配的站点模板的名称，可以在模板包的 package.json 文件中找到 name 字段
	 */
	@ApiField("template_name")
	private String templateName;

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<String> getSpaceIds() {
		return this.spaceIds;
	}
	public void setSpaceIds(List<String> spaceIds) {
		this.spaceIds = spaceIds;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
