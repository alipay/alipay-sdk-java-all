package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.devicebind.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-10 20:32:39
 */
public class AlipayOfflineProviderCollaborateDevicebindApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3554477681548693973L;

	/** 
	 * 商户签约链接，需要将该链接生成二维码让商户扫码签约，非白名单情况一定有
	 */
	@ApiField("activity_info_url")
	private String activityInfoUrl;

	/** 
	 * 设备绑定的状态，有卖进方案的申请，需要在用户签约后接收消息才能拿到状态
	 */
	@ApiField("device_bind_status")
	private String deviceBindStatus;

	/** 
	 * 设备备注信息，可将该提示展示给小二，由小二决定是否展示二维码给商户签约
	 */
	@ApiField("device_remark")
	private String deviceRemark;

	/** 
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/** 
	 * true-在白名单中，false-不在白名单中，如果在白名单中设备是直接绑定的，不在白名单中设备需要绑定卖进方案
	 */
	@ApiField("in_white_list")
	private Boolean inWhiteList;

	/** 
	 * 外部唯一单据号，和申请时传入的一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 批签模式下，绑定后会直接生成任务，并返回任务id。
	 */
	@ApiField("promo_activity_id")
	private String promoActivityId;

	/** 
	 * 卖进订单id，有参与卖进订单的一定有
	 */
	@ApiField("sales_entry_order_id")
	private String salesEntryOrderId;

	/** 
	 * 卖进方案id，作业时有卖进方案的必有
	 */
	@ApiField("solution_id")
	private String solutionId;

	public void setActivityInfoUrl(String activityInfoUrl) {
		this.activityInfoUrl = activityInfoUrl;
	}
	public String getActivityInfoUrl( ) {
		return this.activityInfoUrl;
	}

	public void setDeviceBindStatus(String deviceBindStatus) {
		this.deviceBindStatus = deviceBindStatus;
	}
	public String getDeviceBindStatus( ) {
		return this.deviceBindStatus;
	}

	public void setDeviceRemark(String deviceRemark) {
		this.deviceRemark = deviceRemark;
	}
	public String getDeviceRemark( ) {
		return this.deviceRemark;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}
	public String getDeviceSn( ) {
		return this.deviceSn;
	}

	public void setInWhiteList(Boolean inWhiteList) {
		this.inWhiteList = inWhiteList;
	}
	public Boolean getInWhiteList( ) {
		return this.inWhiteList;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPromoActivityId(String promoActivityId) {
		this.promoActivityId = promoActivityId;
	}
	public String getPromoActivityId( ) {
		return this.promoActivityId;
	}

	public void setSalesEntryOrderId(String salesEntryOrderId) {
		this.salesEntryOrderId = salesEntryOrderId;
	}
	public String getSalesEntryOrderId( ) {
		return this.salesEntryOrderId;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}
	public String getSolutionId( ) {
		return this.solutionId;
	}

}
