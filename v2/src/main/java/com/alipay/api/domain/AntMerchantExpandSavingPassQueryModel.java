package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 省卡购买咨询
 *
 * @author auto create
 * @since 1.0, 2022-11-18 16:32:49
 */
public class AntMerchantExpandSavingPassQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6383758524141144112L;

	/**
	 * 咨询来源渠道
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 解决方案code ，如省卡付费会员
	 */
	@ApiField("sol_code")
	private String solCode;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSolCode() {
		return this.solCode;
	}
	public void setSolCode(String solCode) {
		this.solCode = solCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
