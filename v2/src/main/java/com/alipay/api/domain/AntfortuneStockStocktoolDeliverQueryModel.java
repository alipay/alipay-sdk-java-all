package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁财富证券小程序用户准入查询
 *
 * @author auto create
 * @since 1.0, 2022-12-21 20:27:16
 */
public class AntfortuneStockStocktoolDeliverQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2556821489638255388L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 查询用户是否能在某个展位下透出，支持批量查询
	 */
	@ApiListField("position_list")
	@ApiField("string")
	private List<String> positionList;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getPositionList() {
		return this.positionList;
	}
	public void setPositionList(List<String> positionList) {
		this.positionList = positionList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
