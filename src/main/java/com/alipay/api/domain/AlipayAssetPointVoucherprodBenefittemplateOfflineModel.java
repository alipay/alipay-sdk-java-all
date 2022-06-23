package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益模版下线
 *
 * @author auto create
 * @since 1.0, 2021-04-27 23:59:24
 */
public class AlipayAssetPointVoucherprodBenefittemplateOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 6383748919512938997L;

	/**
	 * 资产id，需要下线的权益模版的id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产类型，要创建的资产的类型，BENEFIT_TEMPLATE表示权益模板，由支付宝权益结算平台定义
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 业务时间，业务系统填充业务发生时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 业务号，业务系统填充业务号，具备唯一性
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 支付宝会员id，权益模版所属商家的支付宝会员id
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
