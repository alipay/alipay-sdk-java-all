package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 我的排行
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:18:35
 */
public class AlipayCommerceOperationPromoterRankingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2878158188619297278L;

	/**
	 * 需要绑定的门店对映的pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * total
	 */
	@ApiField("type")
	private String type;

	/**
	 * 店员id，点击提交的收银员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
