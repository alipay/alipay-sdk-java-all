package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益模版有效期修改
 *
 * @author auto create
 * @since 1.0, 2021-04-27 23:59:08
 */
public class AlipayAssetPointVoucherprodBenefittemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5138793144249144493L;

	/**
	 * 资产id，需要修改的权益模版的id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产类型，由权益结算平台指定，BENEFIT_TEMPLATE表示权益模版
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 业务时间，业务系统指定业务操作时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 业务号，业务系统填充业务号，具备唯一性
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 过期时间，权益模版新的过期时间
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 权益模版所属商户的支付宝会员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
