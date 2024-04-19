package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户领取付款码皮肤
 *
 * @author auto create
 * @since 1.0, 2023-03-15 13:58:25
 */
public class AlipayCommerceSportsFacepayskinReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 1592686336391316798L;

	/**
	 * 支付宝客户端版本号
	 */
	@ApiField("client_version")
	private String clientVersion;

	/**
	 * 北京时间的皮肤的过期日期,当日的23点59分59秒
会与之前申请皮肤上架里的日期比较，取两者的最小值
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getClientVersion() {
		return this.clientVersion;
	}
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
