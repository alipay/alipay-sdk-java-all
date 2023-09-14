package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 树项目基本信息查询
 *
 * @author auto create
 * @since 1.0, 2022-10-13 23:16:14
 */
public class AlipaySocialAntforestProjectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2141229377695395336L;

	/**
	 * 蚂蚁统一会员ID，执行该查询操作的支付宝用户
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求类型，不同类型查询的树项目可能不同，默认可不选择，由运营同学进行项目的绑定操作
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 蚂蚁统一会员ID，执行该查询操作的支付宝用户
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
