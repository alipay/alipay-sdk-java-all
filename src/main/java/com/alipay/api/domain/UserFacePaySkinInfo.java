package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户付款码皮肤信息
 *
 * @author auto create
 * @since 1.0, 2021-09-23 18:00:32
 */
public class UserFacePaySkinInfo extends AlipayObject {

	private static final long serialVersionUID = 2453269588133579612L;

	/**
	 * 支持该皮肤的客户端最低版本
	 */
	@ApiField("client_version_limit")
	private String clientVersionLimit;

	/**
	 * 北京时间0点过期的日期(yyyy-MM-dd)
若未领取/未授权 字段为空
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 皮肤名称001
	 */
	@ApiField("name")
	private String name;

	/**
	 * 皮肤ID
	 */
	@ApiField("skin_id")
	private String skinId;

	/**
	 * 0-未授权时状态
1-未领取
2-已领取&未设置
3-已领取&已设置
	 */
	@ApiField("status")
	private String status;

	/**
	 * 缩略图
	 */
	@ApiField("thumbnail")
	private String thumbnail;

	public String getClientVersionLimit() {
		return this.clientVersionLimit;
	}
	public void setClientVersionLimit(String clientVersionLimit) {
		this.clientVersionLimit = clientVersionLimit;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSkinId() {
		return this.skinId;
	}
	public void setSkinId(String skinId) {
		this.skinId = skinId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getThumbnail() {
		return this.thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

}
