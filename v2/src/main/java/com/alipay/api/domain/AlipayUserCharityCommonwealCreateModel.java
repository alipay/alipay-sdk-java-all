package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝公益账户-公益数据接入接口
 *
 * @author auto create
 * @since 1.0, 2022-10-25 21:05:15
 */
public class AlipayUserCharityCommonwealCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5278751188722718614L;

	/**
	 * 业务时间；格式yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 预留扩展信息，JSON格式；
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 业务数值，例如 捐赠金额，无业务数值传0；
	 */
	@ApiField("numerical")
	private Long numerical;

	/**
	 * 蚂蚁统一会员Id 对应的open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 其他业务信息，JSON格式；
	 */
	@ApiField("original_data")
	private String originalData;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 唯一ID，用于防重控制，同一个unique_id重复提交多次只处理一次
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getNumerical() {
		return this.numerical;
	}
	public void setNumerical(Long numerical) {
		this.numerical = numerical;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOriginalData() {
		return this.originalData;
	}
	public void setOriginalData(String originalData) {
		this.originalData = originalData;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
