package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NDeliveryBaseInfo;
import com.alipay.api.domain.NDeliveryPalyConfig;
import com.alipay.api.domain.NDeliveryTargetRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.iotnspoperation.delivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-13 16:17:24
 */
public class AlipayCommerceOperationIotnspoperationDeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7512411757622358717L;

	/** 
	 * 推广计划基础信息
	 */
	@ApiField("n_delivery_base_info")
	private NDeliveryBaseInfo nDeliveryBaseInfo;

	/** 
	 * 推广计划创建信息描述
	 */
	@ApiField("n_delivery_create_msg")
	private String nDeliveryCreateMsg;

	/** 
	 * 碰一下推广计划id
	 */
	@ApiField("n_delivery_id")
	private String nDeliveryId;

	/** 
	 * 推广发放规则配置。
	 */
	@ApiField("n_delivery_paly_config")
	private NDeliveryPalyConfig nDeliveryPalyConfig;

	/** 
	 * 推广计划审核信息描述
	 */
	@ApiField("n_delivery_reject_msg")
	private String nDeliveryRejectMsg;

	/** 
	 * 碰一下推广计划状态
	 */
	@ApiField("n_delivery_status")
	private String nDeliveryStatus;

	/** 
	 * 推广曝光规则
	 */
	@ApiField("n_delivery_target_rule")
	private NDeliveryTargetRule nDeliveryTargetRule;

	public void setnDeliveryBaseInfo(NDeliveryBaseInfo nDeliveryBaseInfo) {
		this.nDeliveryBaseInfo = nDeliveryBaseInfo;
	}
	public NDeliveryBaseInfo getnDeliveryBaseInfo( ) {
		return this.nDeliveryBaseInfo;
	}

	public void setnDeliveryCreateMsg(String nDeliveryCreateMsg) {
		this.nDeliveryCreateMsg = nDeliveryCreateMsg;
	}
	public String getnDeliveryCreateMsg( ) {
		return this.nDeliveryCreateMsg;
	}

	public void setnDeliveryId(String nDeliveryId) {
		this.nDeliveryId = nDeliveryId;
	}
	public String getnDeliveryId( ) {
		return this.nDeliveryId;
	}

	public void setnDeliveryPalyConfig(NDeliveryPalyConfig nDeliveryPalyConfig) {
		this.nDeliveryPalyConfig = nDeliveryPalyConfig;
	}
	public NDeliveryPalyConfig getnDeliveryPalyConfig( ) {
		return this.nDeliveryPalyConfig;
	}

	public void setnDeliveryRejectMsg(String nDeliveryRejectMsg) {
		this.nDeliveryRejectMsg = nDeliveryRejectMsg;
	}
	public String getnDeliveryRejectMsg( ) {
		return this.nDeliveryRejectMsg;
	}

	public void setnDeliveryStatus(String nDeliveryStatus) {
		this.nDeliveryStatus = nDeliveryStatus;
	}
	public String getnDeliveryStatus( ) {
		return this.nDeliveryStatus;
	}

	public void setnDeliveryTargetRule(NDeliveryTargetRule nDeliveryTargetRule) {
		this.nDeliveryTargetRule = nDeliveryTargetRule;
	}
	public NDeliveryTargetRule getnDeliveryTargetRule( ) {
		return this.nDeliveryTargetRule;
	}

}
