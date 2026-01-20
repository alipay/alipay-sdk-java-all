package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 匹配用户标签删除接口
 *
 * @author auto create
 * @since 1.0, 2022-11-13 16:05:22
 */
public class AlipayOpenPublicMatchuserLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4419558544725532849L;

	/**
	 * 标签 id，只支持生活号自定义标签。通过 <a href="https://opendocs.alipay.com/apis/api_6/alipay.open.public.life.label.create">alipay.open.public.life.label.create</a>(创建标签接口)创建自定义标签后获取。
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
