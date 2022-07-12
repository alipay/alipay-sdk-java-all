package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 废弃奖品池奖品
 *
 * @author auto create
 * @since 1.0, 2019-08-19 15:59:02
 */
public class AlipayMarketingCampaignPrizepoolPrizeDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5196327347633148875L;

	/**
	 * 外部业务流水号，用来标识唯
一的业务动作，用于幂等
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 奖品池id，使用前请联系业务 对接同学提供
	 */
	@ApiField("pool_id")
	private String poolId;

	/**
	 * 奖品id，从奖品池内删除的奖品标识
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 表示业务来源，由营销技术提
供具体值
	 */
	@ApiField("source")
	private String source;

	/**
	 * PRIZE_PAUSED("PRIZE_PAUSED", "暂停状态"),
PRIZE_CLOSED("PRIZE_CLOSED", "关闭状态");
参数为空，默认暂停状态
	 */
	@ApiField("status")
	private String status;

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getPoolId() {
		return this.poolId;
	}
	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
