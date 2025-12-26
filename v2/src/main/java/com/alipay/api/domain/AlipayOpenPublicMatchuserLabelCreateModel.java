package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 匹配用户标签添加接口
 *
 * @author auto create
 * @since 1.0, 2022-11-13 16:09:38
 */
public class AlipayOpenPublicMatchuserLabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5727126716598311717L;

	/**
	 * 标签 id，只支持生活号自定义标签。通过 <a href="https://opendocs.alipay.com/apis/api_6/alipay.open.public.life.label.create">alipay.open.public.life.label.create</a>(创建标签接口)创建自定义标签后获取。
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签值，由开发者自主指定，标签值类型要满足 <a href="https://opendocs.alipay.com/apis/api_6/alipay.open.public.life.label.create">alipay.open.public.life.label.create</a>(创建标签接口)中data_type参数的限定。
	 */
	@ApiField("label_value")
	private String labelValue;

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

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

	public List<Matcher> getMatchers() {
		return this.matchers;
	}
	public void setMatchers(List<Matcher> matchers) {
		this.matchers = matchers;
	}

}
