package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁账户新
 *
 * @author auto create
 * @since 1.0, 2018-03-14 17:14:17
 */
public class AlipayUserNewsceneTagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7593889578165263781L;

	/**
	 * 用户主体信息。要求AlipayUserPrincipalInfo中的user_id、mobile(不加国家码)、email属性，有且只有一个非空。否则接口会忽略除去优先级最高的属性之外的其他属性。user_id优先级最高，mobile次之，email最后
	 */
	@ApiField("principal")
	private AlipayUserPrincipalInfo principal;

	/**
	 * 要查询哪些新的标签，多个场景请用,隔开。注意该字段受scene控制，支付宝会给scene分配可以查询的标签，无效的请求会报参数异常
	 */
	@ApiField("query_tags")
	private String queryTags;

	/**
	 * 调用该接口的场景，由支付宝分配，如果是无效场景，将视为无效访问，并且该场景约束所查新标签的类型，如果不符合则报参数异常
	 */
	@ApiField("scene")
	private String scene;

	public AlipayUserPrincipalInfo getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(AlipayUserPrincipalInfo principal) {
		this.principal = principal;
	}

	public String getQueryTags() {
		return this.queryTags;
	}
	public void setQueryTags(String queryTags) {
		this.queryTags = queryTags;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
