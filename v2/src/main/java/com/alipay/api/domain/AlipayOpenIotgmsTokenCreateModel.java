package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 团餐服务查询token获取
 *
 * @author auto create
 * @since 1.0, 2023-09-07 10:05:42
 */
public class AlipayOpenIotgmsTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2393179662766372549L;

	/**
	 * 需要查询功能列表
	 */
	@ApiListField("functions")
	@ApiField("string")
	private List<String> functions;

	/**
	 * 图片记录对应的用户openId，蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 要查询的订单列表
	 */
	@ApiListField("query_list")
	@ApiField("query_param")
	private List<QueryParam> queryList;

	/**
	 * 行业场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 图片记录对应的用户uid，蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getFunctions() {
		return this.functions;
	}
	public void setFunctions(List<String> functions) {
		this.functions = functions;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<QueryParam> getQueryList() {
		return this.queryList;
	}
	public void setQueryList(List<QueryParam> queryList) {
		this.queryList = queryList;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
