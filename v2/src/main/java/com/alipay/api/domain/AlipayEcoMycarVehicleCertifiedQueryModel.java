package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车主车辆认证查询
 *
 * @author auto create
 * @since 1.0, 2022-09-30 11:12:15
 */
public class AlipayEcoMycarVehicleCertifiedQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4821121517791139915L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 车牌列表
	 */
	@ApiListField("plate_no_list")
	@ApiField("string")
	private List<String> plateNoList;

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

	public List<String> getPlateNoList() {
		return this.plateNoList;
	}
	public void setPlateNoList(List<String> plateNoList) {
		this.plateNoList = plateNoList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
