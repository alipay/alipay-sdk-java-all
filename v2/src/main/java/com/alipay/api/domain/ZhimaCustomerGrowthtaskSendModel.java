package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回传成长任务信息
 *
 * @author auto create
 * @since 1.0, 2023-02-24 10:06:08
 */
public class ZhimaCustomerGrowthtaskSendModel extends AlipayObject {

	private static final long serialVersionUID = 2376444142114779492L;

	/**
	 * 业务时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 业务发生值，用户推进任务
	 */
	@ApiField("biz_inc_value")
	private Long bizIncValue;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部业务ID，只会接收处理配置白名单内的数据。
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 指定推进的任务记录
	 */
	@ApiField("push_record_id")
	private String pushRecordId;

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

	public Long getBizIncValue() {
		return this.bizIncValue;
	}
	public void setBizIncValue(Long bizIncValue) {
		this.bizIncValue = bizIncValue;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPushRecordId() {
		return this.pushRecordId;
	}
	public void setPushRecordId(String pushRecordId) {
		this.pushRecordId = pushRecordId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
