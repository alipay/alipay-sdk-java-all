package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 绿色能量流水
 *
 * @author auto create
 * @since 1.0, 2022-10-26 14:46:07
 */
public class GreenEnergyLogsDTO extends AlipayObject {

	private static final long serialVersionUID = 7177321876969528742L;

	/**
	 * 能量数量,单位g
	 */
	@ApiField("energy_amount")
	private Long energyAmount;

	/**
	 * 绿色行为描述文案
	 */
	@ApiField("energy_desc")
	private String energyDesc;

	/**
	 * 能量标签
	 */
	@ApiListField("energy_tags")
	@ApiField("string")
	private List<String> energyTags;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 能量流水id
	 */
	@ApiField("log_id")
	private String logId;

	/**
	 * 能量流水产生时间
	 */
	@ApiField("record_time")
	private String recordTime;

	/**
	 * OK: 领取成功 OVER_ACTIVITY_LIMITATION: 超过活动配置限制 OVER_ENERGY_APPLY_LIMITATION: 超过能量获取限制 ACTIVITY_EXPIRED: 活动过期
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 能量领取失败的原因描述： OK：领取成功； OVER_ACTIVITY_LIMITATION：领光了，活动商品数量已达上限； ACTIVITY_EXPIRED：超过活动有效期，不可再获得能量了 OVER_ENERGY_APPLY_LIMITATION：今日能量已领完，领取次数已达上限
	 */
	@ApiField("result_message")
	private String resultMessage;

	/**
	 * 能量状态：  0.待领取；1.已领取. 2.领取失败
	 */
	@ApiField("status")
	private Long status;

	public Long getEnergyAmount() {
		return this.energyAmount;
	}
	public void setEnergyAmount(Long energyAmount) {
		this.energyAmount = energyAmount;
	}

	public String getEnergyDesc() {
		return this.energyDesc;
	}
	public void setEnergyDesc(String energyDesc) {
		this.energyDesc = energyDesc;
	}

	public List<String> getEnergyTags() {
		return this.energyTags;
	}
	public void setEnergyTags(List<String> energyTags) {
		this.energyTags = energyTags;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getLogId() {
		return this.logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getRecordTime() {
		return this.recordTime;
	}
	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
