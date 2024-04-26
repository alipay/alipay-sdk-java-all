package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凭证核销
 *
 * @author auto create
 * @since 1.0, 2023-08-15 10:58:54
 */
public class AlipayEcoMycarCommercializationCertificateVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4657789356937957289L;

	/**
	 * 核销凭证的门店ID，如果凭证所属商品类目是本地生活类必传
	 */
	@ApiField("ant_store_id")
	private String antStoreId;

	/**
	 * 核销的凭证列表信息
	 */
	@ApiListField("certificate_use_info_list")
	@ApiField("commercialization_certificate_info")
	private List<CommercializationCertificateInfo> certificateUseInfoList;

	/**
	 * 如果是二阶段核销，该字段为true；默认为false
	 */
	@ApiField("has_freeze")
	private Boolean hasFreeze;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 核销流水号,要求唯一
	 */
	@ApiField("operate_serial_number")
	private String operateSerialNumber;

	/**
	 * 实际的核销时间
	 */
	@ApiField("operate_time")
	private Date operateTime;

	/**
	 * 归属的业务单号，如果是二阶段核销的情况下和锁定的业务履约单号保持一致
	 */
	@ApiField("out_biz_order_id")
	private String outBizOrderId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAntStoreId() {
		return this.antStoreId;
	}
	public void setAntStoreId(String antStoreId) {
		this.antStoreId = antStoreId;
	}

	public List<CommercializationCertificateInfo> getCertificateUseInfoList() {
		return this.certificateUseInfoList;
	}
	public void setCertificateUseInfoList(List<CommercializationCertificateInfo> certificateUseInfoList) {
		this.certificateUseInfoList = certificateUseInfoList;
	}

	public Boolean getHasFreeze() {
		return this.hasFreeze;
	}
	public void setHasFreeze(Boolean hasFreeze) {
		this.hasFreeze = hasFreeze;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperateSerialNumber() {
		return this.operateSerialNumber;
	}
	public void setOperateSerialNumber(String operateSerialNumber) {
		this.operateSerialNumber = operateSerialNumber;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getOutBizOrderId() {
		return this.outBizOrderId;
	}
	public void setOutBizOrderId(String outBizOrderId) {
		this.outBizOrderId = outBizOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
