package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务名单信息保存接口
 *
 * @author auto create
 * @since 1.0, 2026-05-25 10:42:49
 */
public class AlipayCommerceRetailBusinesslistSaveModel extends AlipayObject {

	private static final long serialVersionUID = 6211453778897572474L;

	/**
	 * 业务id，比如创意素材id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展信息
	 */
	@ApiField("extra_info")
	private String extraInfo;

	/**
	 * 操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部业务id，唯一键
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtraInfo() {
		return this.extraInfo;
	}
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
