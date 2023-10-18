package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签到玩法奖品配置
 *
 * @author auto create
 * @since 1.0, 2023-10-08 14:05:38
 */
public class SignInPrizeConfig extends AlipayObject {

	private static final long serialVersionUID = 7359166214956259154L;

	/**
	 * 中奖频率限制
	 */
	@ApiField("frequency_count")
	private String frequencyCount;

	/**
	 * 频次限制的类型
	 */
	@ApiField("frequency_type")
	private String frequencyType;

	/**
	 * 奖品价值(定额时有值)
	 */
	@ApiField("price")
	private String price;

	/**
	 * 奖品对客信息表达
	 */
	@ApiField("prize_custom_display_info")
	private PrizeCustomDisplayInfo prizeCustomDisplayInfo;

	/**
	 * 奖品结束时间
	 */
	@ApiField("prize_end_time")
	private Date prizeEndTime;

	/**
	 * 奖品ID
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品开始时间
	 */
	@ApiField("prize_start_time")
	private Date prizeStartTime;

	/**
	 * 奖品类型
	 */
	@ApiField("prize_type")
	private String prizeType;

	public String getFrequencyCount() {
		return this.frequencyCount;
	}
	public void setFrequencyCount(String frequencyCount) {
		this.frequencyCount = frequencyCount;
	}

	public String getFrequencyType() {
		return this.frequencyType;
	}
	public void setFrequencyType(String frequencyType) {
		this.frequencyType = frequencyType;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public PrizeCustomDisplayInfo getPrizeCustomDisplayInfo() {
		return this.prizeCustomDisplayInfo;
	}
	public void setPrizeCustomDisplayInfo(PrizeCustomDisplayInfo prizeCustomDisplayInfo) {
		this.prizeCustomDisplayInfo = prizeCustomDisplayInfo;
	}

	public Date getPrizeEndTime() {
		return this.prizeEndTime;
	}
	public void setPrizeEndTime(Date prizeEndTime) {
		this.prizeEndTime = prizeEndTime;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public Date getPrizeStartTime() {
		return this.prizeStartTime;
	}
	public void setPrizeStartTime(Date prizeStartTime) {
		this.prizeStartTime = prizeStartTime;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

}
