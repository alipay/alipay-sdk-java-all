package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DetailCommissionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.commission.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:28
 */
public class AlipayOpenSpCommissionDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5361754514493446765L;

	/** 
	 * null
	 */
	@ApiListField("commission_list")
	@ApiField("detail_commission_info")
	private List<DetailCommissionInfo> commissionList;

	/** 
	 * 抽佣模式
	 */
	@ApiField("commission_mode")
	private String commissionMode;

	/** 
	 * 抽佣场景
	 */
	@ApiField("commission_scene")
	private String commissionScene;

	/** 
	 * 商家确认链接，商家确认阶段才有
	 */
	@ApiField("merchant_confirm_url")
	private String merchantConfirmUrl;

	/** 
	 * 商家 id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 商户登录号
	 */
	@ApiField("merchant_logon_id")
	private String merchantLogonId;

	/** 
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 修改时间
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	public void setCommissionList(List<DetailCommissionInfo> commissionList) {
		this.commissionList = commissionList;
	}
	public List<DetailCommissionInfo> getCommissionList( ) {
		return this.commissionList;
	}

	public void setCommissionMode(String commissionMode) {
		this.commissionMode = commissionMode;
	}
	public String getCommissionMode( ) {
		return this.commissionMode;
	}

	public void setCommissionScene(String commissionScene) {
		this.commissionScene = commissionScene;
	}
	public String getCommissionScene( ) {
		return this.commissionScene;
	}

	public void setMerchantConfirmUrl(String merchantConfirmUrl) {
		this.merchantConfirmUrl = merchantConfirmUrl;
	}
	public String getMerchantConfirmUrl( ) {
		return this.merchantConfirmUrl;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setMerchantLogonId(String merchantLogonId) {
		this.merchantLogonId = merchantLogonId;
	}
	public String getMerchantLogonId( ) {
		return this.merchantLogonId;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime( ) {
		return this.modifyTime;
	}

}
