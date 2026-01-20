package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提交划拨单关联凭证
 *
 * @author auto create
 * @since 1.0, 2026-01-12 20:24:16
 */
public class AlipayEbppIndustrySupervisionTransfermaterialSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1591112637254378831L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 确认期限（单位天）
	 */
	@ApiField("confirm_period")
	private String confirmPeriod;

	/**
	 * ATFS文件id集合
	 */
	@ApiListField("file_ids")
	@ApiField("string")
	private List<String> fileIds;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求流水号
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/**
	 * 外部商户订单
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getConfirmPeriod() {
		return this.confirmPeriod;
	}
	public void setConfirmPeriod(String confirmPeriod) {
		this.confirmPeriod = confirmPeriod;
	}

	public List<String> getFileIds() {
		return this.fileIds;
	}
	public void setFileIds(List<String> fileIds) {
		this.fileIds = fileIds;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutFlowId() {
		return this.outFlowId;
	}
	public void setOutFlowId(String outFlowId) {
		this.outFlowId = outFlowId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
