package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凭证释放锁定
 *
 * @author auto create
 * @since 1.0, 2023-08-15 10:58:51
 */
public class AlipayEcoMycarCommercializationCertificateUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 8171852119911196994L;

	/**
	 * 履约门店ID，和锁定的履约门店ID保持一致
	 */
	@ApiField("ant_store_id")
	private String antStoreId;

	/**
	 * 使用的凭证列表信息,和锁定的列表保持一致
	 */
	@ApiListField("certificate_use_info_list")
	@ApiField("commercialization_certificate_info")
	private List<CommercializationCertificateInfo> certificateUseInfoList;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作流水号，和锁定的操作流水号保持一致
	 */
	@ApiField("operate_serial_number")
	private String operateSerialNumber;

	/**
	 * 实际释放锁定的时间，要晚于锁定时间
	 */
	@ApiField("operate_time")
	private Date operateTime;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
