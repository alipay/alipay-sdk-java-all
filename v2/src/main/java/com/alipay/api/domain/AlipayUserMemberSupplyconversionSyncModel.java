package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区域上翻权益转化信息同步
 *
 * @author auto create
 * @since 1.0, 2023-08-14 15:14:16
 */
public class AlipayUserMemberSupplyconversionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6728879283388941254L;

	/**
	 * 用户权益转化发生的时间。如用户问卷完成时间。
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 用于唯一标识一次权益转化
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 标识流量渠道
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 本次权益转化类型，由区域上翻研发分配。
	 */
	@ApiField("conversion_id")
	private String conversionId;

	/**
	 * 蚂蚁open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 标识唯一一次用户权益点击
	 */
	@ApiField("scm")
	private String scm;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getConversionId() {
		return this.conversionId;
	}
	public void setConversionId(String conversionId) {
		this.conversionId = conversionId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScm() {
		return this.scm;
	}
	public void setScm(String scm) {
		this.scm = scm;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
