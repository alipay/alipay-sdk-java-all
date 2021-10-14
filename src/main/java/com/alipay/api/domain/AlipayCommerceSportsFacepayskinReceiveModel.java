package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户领取付款码皮肤
 *
 * @author auto create
 * @since 1.0, 2021-09-23 18:00:44
 */
public class AlipayCommerceSportsFacepayskinReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 7273956467335294624L;

	/**
	 * 北京时间的皮肤的过期日期,0点过期
会与之前申请皮肤上架里的日期比较，取两者的最小值
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 付款码皮肤ID
	 */
	@ApiField("skin_id")
	private String skinId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getSkinId() {
		return this.skinId;
	}
	public void setSkinId(String skinId) {
		this.skinId = skinId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
