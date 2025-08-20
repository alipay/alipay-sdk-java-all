package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁代扣签约信息
 *
 * @author auto create
 * @since 1.0, 2025-07-16 13:39:50
 */
public class RentDeductInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7688296486331632749L;

	/**
	 * 代扣签约场景
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 签约状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	/**
	 * 签约时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

}
