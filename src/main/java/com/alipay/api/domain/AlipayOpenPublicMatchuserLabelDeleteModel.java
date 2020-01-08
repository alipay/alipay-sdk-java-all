package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 匹配用户标签删除接口
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:49:34
 */
public class AlipayOpenPublicMatchuserLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4863243221589815375L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 支付宝用户匹配器列表，最多传入10条
	 */
	@ApiListField("matchers")
	@ApiField("matcher")
	private List<Matcher> matchers;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public List<Matcher> getMatchers() {
		return this.matchers;
	}
	public void setMatchers(List<Matcher> matchers) {
		this.matchers = matchers;
	}

}
