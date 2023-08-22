package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凭证锁定
 *
 * @author auto create
 * @since 1.0, 2023-08-16 11:18:51
 */
public class AlipayEcoMycarCommercializationCertificateFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 2249839638443138498L;

	/**
	 * 蚂蚁门店的唯一标识,如果商品属于本地生活类，必传
	 */
	@ApiField("ant_store_id")
	private String antStoreId;

	/**
	 * 锁定的凭证列表信息
	 */
	@ApiListField("certificate_use_info_list")
	@ApiField("commercialization_certificate_info")
	private List<CommercializationCertificateInfo> certificateUseInfoList;

	/**
	 * 支付宝的用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务操作流水号 要求唯一
	 */
	@ApiField("operate_serial_number")
	private String operateSerialNumber;

	/**
	 * 业务的操作时间
	 */
	@ApiField("operate_time")
	private Date operateTime;

	/**
	 * 业务归属订单号
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
