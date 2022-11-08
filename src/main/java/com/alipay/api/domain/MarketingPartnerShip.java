package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 委托营销合作关系
 *
 * @author auto create
 * @since 1.0, 2022-04-20 17:38:53
 */
public class MarketingPartnerShip extends AlipayObject {

	private static final long serialVersionUID = 7694782939643343413L;

	/**
	 * 被授权数据
	 */
	@ApiField("authorized_data")
	private MarketingAuthorizedData authorizedData;

	/**
	 * 建立合作关系的时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 合作方相关信息
	 */
	@ApiField("partner")
	private MarketingPartner partner;

	/**
	 * 合作状态
枚举值： 
ESTABLISHED：已建立 
TERMINATED：已终止
	 */
	@ApiField("status")
	private String status;

	/**
	 * 终止合作关系时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("stop_time")
	private Date stopTime;

	public MarketingAuthorizedData getAuthorizedData() {
		return this.authorizedData;
	}
	public void setAuthorizedData(MarketingAuthorizedData authorizedData) {
		this.authorizedData = authorizedData;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public MarketingPartner getPartner() {
		return this.partner;
	}
	public void setPartner(MarketingPartner partner) {
		this.partner = partner;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStopTime() {
		return this.stopTime;
	}
	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}

}
